import React from 'react';
import ReactWordcloud from 'react-wordcloud';

//Author: Wilhelm Öberg

// We are using a pre-built package for the wordcloud.
// https://www.npmjs.com/package/react-wordcloud
// The code is based on examples from this webpage.

const options = {
    rotations: 1,
    rotationAngles: [0, 0],
    fontSizes: [20,70],
};

// this functions renders a wordcloud with words comming from a node that is clicked in the network graph.
// Initially props.words is an empty object. When a node is clicked. This prop is updated via its hook setWords.
// This is done in Flow.js
function WordCloud(props) {
    return (
        <ReactWordcloud words={props.words} options={options}/>)
}

export default WordCloud;