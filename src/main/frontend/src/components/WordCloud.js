import React from 'react';
import ReactWordcloud from 'react-wordcloud';

//Author: Wilhelm Öberg

const options = {
    rotations: 1,
    rotationAngles: [0, 0],
    fontSizes: [20,70],
};


function WordCloud(props) {
    return (
        <ReactWordcloud words={props.words} options={options}/>)
}

export default WordCloud;