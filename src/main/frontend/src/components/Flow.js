import React, { useState } from "react";
import ReactFlow, {
	useNodesState,
	useEdgesState, Controls, useReactFlow, ReactFlowProvider
} from "react-flow-renderer";
import "./Dashboard.css";

//Co-author: Wilhelm Öberg
//Co-author: Johan Maseng

function createEdges(nodes) {
	const edgeArray = [];
	let edge = {};
	let k = 1;
	let centerNodeID = 0;

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

function createNodes(axiosNode) {

	const nodeArray = [];
	let node = {};
	let i = 0;
	let k = 0;
	function isCenterNode(i) {
		if (i === 0) return 'input';
		else return 'output';
	}

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

	function getWords(wordsAndFrequencies, i) {
		if (i === 0) return [{text:"",value:1}]
		else return wordsAndFrequencies;

	}

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
	const [nodes,setNodes] = useNodesState([]);
	const [edges,setEdges] = useEdgesState([]);
	const [captureElementClick] = useState(true);
	const {zoomIn,zoomOut,setCenter} = useReactFlow();

	const focusNode = (node) => {
		const x = node.position.x + node.width / 2;
		const y = node.position.y + node.height / 2;
		const zoom = 1.85;

		setCenter(x,y,{zoom, duration:1000})
	}

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

	return (
		<ReactFlowProvider>
			<Flow nodes={props.nodes} onChange={props.onChange}/>
		</ReactFlowProvider>
	)
}
export default FlowWithProvider;
