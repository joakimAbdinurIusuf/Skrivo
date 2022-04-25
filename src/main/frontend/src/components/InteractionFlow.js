import React, { useState } from 'react';
import ReactFlow, {
    useNodesState,
    useEdgesState,
} from 'react-flow-renderer';

const initialNodes = [
    {
        id: 'interaction-1',
        type: 'input',
        data: { label: 'Node 1' },
        position: { x: 250, y: 5 },
    },
    {
        id: 'interaction-2',
        data: { label: 'Node 2' },
        position: { x: 100, y: 100 },
    },
    {
        id: 'interaction-3',
        data: { label: 'Node 3' },
        position: { x: 400, y: 100 },
    },
    {
        id: 'interaction-4',
        data: { label: 'Node 4' },
        position: { x: 400, y: 200 },
    },
];

const initialEdges = [
    {
        id: 'interaction-e1-2',
        source: 'interaction-1',
        target: 'interaction-2',
        animated: true,
    },
    { id: 'interaction-e1-3', source: 'interaction-1', target: 'interaction-3' },
];

const onNodeClick = (event, node) => console.log('click node', node);

const InteractionFlow = () => {
    const [nodes, onNodesChange] = useNodesState(initialNodes);
    const [edges, onEdgesChange] = useEdgesState(initialEdges);

    const [captureElementClick] = useState(true);

    return (
        <ReactFlow
            nodes={nodes}
            edges={edges}
            onNodeClick={captureElementClick ? onNodeClick : undefined}
            fitView
        >
        </ReactFlow>
    );
};

export default InteractionFlow;
