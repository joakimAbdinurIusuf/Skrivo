import React, { useState } from "react";
import ReactFlow, {
	useNodesState,
	useEdgesState, Controls, useReactFlow, ReactFlowProvider
} from "react-flow-renderer";
import "./Dashboard.css";

//Co-author: Wilhelm Öberg
//Co-author: Johan Maseng

// https://reactflow.dev/docs/introduction/
// Visit this page for information about nodes, edges and other things related to the network graph.
// The following code is based on a variety of examples from this webpage.

// createEdges returns an array with edges.
// Edges are all going from the center node to unique nodes.
function createEdges(nodes) {
	const edgeArray = [];
	let edge = {};
	let k = 1;
	let centerNodeID = 0;

	// nodes are JavaScript objects and can be iterated over with a forEach method.
	// For every node fetched from the api, create the appropriate edges and append to the edgeArray
	nodes.forEach(obj => {
		edge = {
			id: `e${centerNodeID}-${k}`,
			source: `${centerNodeID}`,
			target: `${k}`,
			type: 'straight',
			style: {stroke:"black"}
		}
		edgeArray[k] = edge;
		k++;
	})

	return edgeArray;
}

// createNodes returns an array of nodes.
// It uses the first node fetched from the api as center node, the center node is of type input.
// All other nodes are of type output
function createNodes(axiosNode) {

	const nodeArray = [];
	let node = {};
	let i = 0;
	let k = 0;
	function isCenterNode(i) {
		if (i === 0) return 'input';
		else return 'output';
	}

	// This styling makes the nodes round and gives them correct sizes
	function getStyle(size) {
		return {
			width: Math.round(size*300),
			height: Math.round(size*300),
			borderRadius: Math.round(size*300),
			fontSize: Math.round(size*70),
			display: "flex",
			alignItems: "center",
			justifyContent: "center"
		};
	}

	// getWords returns no words if i is the index of the center node. If i is not the center node it just returns
	// the same wordsAndFrequencies as before.
	function getWords(wordsAndFrequencies, i) {
		if (i === 0) return [{text:"",value:1}]
		else return wordsAndFrequencies;

	}

	// for each object inside the object fetched from the nodes endpoint, parse nodes and
	// add them to the node array correctly formatted for React Flow to work.
	axiosNode.forEach(obj => {
		let xcoord = (obj.x)
		let ycoord = (obj.y)

		node = {id:`${i}`,
				type: isCenterNode(i),
				data: {label:`node ${i}`},
				position: {x:xcoord,y:ycoord},
				style : getStyle(obj.size),
				words : getWords(obj.wordsAndFrequencies,i),
				}
		nodeArray[k] = node;
		k++;
		i++;
	})
	return nodeArray;
}

function Flow(props) {

	// These hooks are used to update the nodes in the graph
	// if the database is updated, clicking on the update nodes button would fetch the new nodes and
	// re-render the Flow component.
	const [nodes,setNodes] = useNodesState([]);
	const [edges,setEdges] = useEdgesState([]);
	const [captureElementClick] = useState(true);
	const {zoomIn,zoomOut,setCenter} = useReactFlow();

	// calculate new position for viewport to focus on, based on the clicked nodes coords.
	const focusNode = (node) => {
		const x = node.position.x + node.width / 2;
		const y = node.position.y + node.height / 2;
		const zoom = 1.85;

		setCenter(x,y,{zoom, duration:1000})
	}

	// If a node is clicked. Pass its words to the onChange prop of the Flow component.
	// This will trigger the setWords hook to update the state of words in the Dashboard component.

	const onNodeClick = (event, node) => {
		props.onChange(node.words)
		focusNode(node)
	};

	return (
		<div style={{height:"600px"}}>
			<button style={{marginBottom:"10px"}} onClick={() => {
				setNodes(createNodes(props.nodes))
			}}>Update Nodes</button>
			<button style={{marginBottom:"10px", marginLeft:"5px"}} onClick={() => {
				setEdges(createEdges(nodes))
			}}>Update Edges</button>
		<ReactFlow
			nodes={nodes}
			edges={edges}
			onNodeClick={captureElementClick ? onNodeClick : undefined}
			fitView
		>
			<Controls/>
		</ReactFlow>
		</div>
	);
};

function FlowWithProvider(props) {
	// This is needed for the zoom to work when clicking a node.
	return (
		<ReactFlowProvider>
			<Flow nodes={props.nodes} onChange={props.onChange}/>
		</ReactFlowProvider>
	)
}
export default FlowWithProvider;
