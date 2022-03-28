import { color } from "@mui/system";
import { useState } from "react";
import ReactFlow , {Controls} from "react-flow-renderer";
import "./Dashboard.css";

const initialNodes = [
  {
    id: "1",
    type: "input",
    data: { label: "Input Node" },
    position: { x: 250, y: 25 },
  },

  {
    id: "2",
    // you can also pass a React component as a label
    data: { label: <div>Default Node</div> },
    position: { x: 100, y: 125 },
  },
  {
    id: "3",
    type: "output",
    data: { label: "Output Node" },
    position: { x: 250, y: 250 },
  },
];

// const initialNodes = [
//   {
//     id: "1",
//     type: "input",
//     data: { label: "center node" },
//     position: { x: 500, y: 300 },
//     style: {
//       width: 64,
//       height: 64,
//       borderRadius: 64,
//       display: "flex",
//       alignItems: "center",
//       justifyContent: "center",
//     },
//   },
//   {
//     id: "2",
//     type: "input",
//     data: { label: "node 2" },
//     position: { x: 600, y: 450 },
//     style: {
//       width: 160,
//       height: 160,
//       borderRadius: 160,
//       display: "flex",
//       alignItems: "center",
//       justifyContent: "center",
//     },
//   },
//   {
//     id: "3",
//     type: "input",
//     data: { label: "node 3" },
//     position: { x: 300, y: 400 },
//     style: {
//       width: 90,
//       height: 90,
//       borderRadius: 90,
//       display: "flex",
//       alignItems: "center",
//       justifyContent: "center",
//     },
//   },
//   {
//     id: "4",
//     type: "input",
//     data: { label: "node 4" },
//     position: { x: 300, y: 100 },
//     style: {
//       width: 90,
//       height: 90,
//       borderRadius: 90,
//       display: "flex",
//       alignItems: "center",
//       justifyContent: "center",
//     },
//   },
//   {
//     id: "5",
//     type: "input",
//     data: { label: "node 5" },
//     position: { x: 40, y: 250 },
//     style: {
//       width: 140,
//       height: 140,
//       borderRadius: 140,
//       display: "flex",
//       alignItems: "center",
//       justifyContent: "center",
//     },
//   },
//   {
//     id: "6",
//     type: "input",
//     data: { label: "node 6" },
//     position: { x: 800, y: 300 },
//     style: {
//       width: 75,
//       height: 75,
//       borderRadius: 75,
//       display: "flex",
//       alignItems: "center",
//       justifyContent: "center",
//     },
//   },
//   {
//     id: "7",
//     type: "input",
//     data: { label: "node 7" },
//     position: { x: 650, y: 100 },
//     style: {
//       width: 190,
//       height: 190,
//       borderRadius: 190,
//       display: "flex",
//       alignItems: "center",
//       justifyContent: "center",
//     },
//   },
//   {
//     id: "8",
//     type: "input",
//     data: { label: "node 8" },
//     position: { x: 750, y: 600 },
//     style: {
//       width: 55,
//       height: 55,
//       borderRadius: 55,
//       display: "flex",
//       alignItems: "center",
//       justifyContent: "center",
//     },
//   },
//   {
//     id: "9",
//     type: "input",
//     data: { label: "node 9" },
//     position: { x: 20, y: 50 },
//     style: {
//       width: 120,
//       height: 120,
//       borderRadius: 120,
//       display: "flex",
//       alignItems: "center",
//       justifyContent: "center",
//     },
//   },
//   {
//     id: "10",
//     type: "input",
//     data: { label: "node 10" },
//     position: { x: 200, y: 600 },
//     style: {
//       width: 135,
//       height: 135,
//       borderRadius: 135,
//       display: "flex",
//       alignItems: "center",
//       justifyContent: "center",
//     },
//   },
// ];

const initialEdges = [
  { id: "e1-2", source: "1", target: "2" },
  { id: "e2-3", source: "2", target: "3", animated: true },
  // { id: "e1-2", source: "1", target: "2" },
  // { id: "e1-3", source: "1", target: "3" },
  // { id: "e1-4", source: "1", target: "4" },
  // { id: "e1-5", source: "1", target: "5" },
  // { id: "e1-6", source: "1", target: "6" },
  // { id: "e1-7", source: "1", target: "7" },
  // { id: "e1-8", source: "1", target: "8" },
  // { id: "e1-9", source: "1", target: "9" },
  // { id: "e1-10", source: "1", target: "10" },
];

function Flow() {
  const [nodes, setNodes] = useState(initialNodes);
  const [edges, setEdges] = useState(initialEdges);

  return <ReactFlow nodes={nodes} edges={edges}>
    <Controls />
  </ReactFlow>;
}

export default Flow;
