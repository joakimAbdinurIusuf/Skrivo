import React, { useState } from "react";
import ReactFlow , {useNodesState,
	useEdgesState,Controls} from "react-flow-renderer";
import "./Dashboard.css";


const initialNodes = [];
const initialEdges = [];

function createEdges(nodes) {
	const edgeArray = [];
	let edge = {};
	let i = 1;
	let k = 0;
	let centerNodeID = 0;

	nodes.forEach(obj => {
		if (i === 1) centerNodeID = i;
		else {
			edge = {
				id: `e${centerNodeID}-${i}`,
				source: `${centerNodeID}`,
				target: `${i}`,
				style: {stroke:"black"}
			}
			edgeArray[k] = edge;
			k++;
		}
		i++;
	})

	console.log(edgeArray)
	console.log("-------")
	return edgeArray;
}

function createNodes(axiosNode) {

	const nodeArray = [];
	let node = {};
	let i = 1;
	function isCenterNode(i) {
		if (i === 1) return "input";
		else return "output";
	}

	function getStyle(size) {
		return {
			width: size*300,
			height: size*300,
			borderRadius: size*300,
			fontSize: size*70,
			display: "flex",
			alignItems: "center",
			justifyContent: "center"
		};
	}

	axiosNode.forEach(obj => {
		node = {id:`${i}`,
				type: isCenterNode(i),
				data: {label:`node ${i}`},
				position: {x:`${obj.x}`,y:`${obj.y}`},
				style : getStyle(obj.size)
				}
		nodeArray[i] = node;
		i++;
	})
	return nodeArray;
}

function Flow(props) {
	const [nodes,setNodes] = useNodesState(initialNodes);
	const [edges,setEdges] = useEdgesState(initialEdges);
	const [captureElementClick] = useState(true);
	const onNodeClick = (event, node) => console.log(node);

	return (
		<div style={{height:"500px"}}>
			<button style={{marginBottom:"10px"}} onClick={() => {
				setNodes(createNodes(props.nodes))
				setEdges(createEdges(props.nodes))
			}}>Update Nodes</button>
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

export default Flow;
