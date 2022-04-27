import React, {useState} from 'react';
import ReactWordcloud from 'react-wordcloud';

const options = {
    rotations: 1,
    rotationAngles: [0, 0],
    fontSizes: [20,70],
};

function WordCloud() {
    const [words, setWords] = useState([])
    return <ReactWordcloud words={words} options={options}/>
}

export default WordCloud;