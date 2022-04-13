import React from 'react';
import ReactWordcloud from 'react-wordcloud';

const options = {
    rotations: 1,
    rotationAngles: [0, 0],
    fontSizes: [20,70],
};

const words = [
    {
        text: "In",
        value: "64"
    },
    {
        text: "Duis",
        value: "78"
    },
    {
        text: "lorem,",
        value: "32"
    },
    {
        text: "interdum",
        value: "50"
    },
    {
        text: "Quisque",
        value: "98"
    },
    {
        text: "arcu",
        value: "73"
    },
    {
        text: "convallis",
        value: "46"
    },
    {
        text: "Suspendisse",
        value: "18"
    },
    {
        text: "molestie",
        value: "91"
    },
    {
        text: "Aliquam",
        value: "73"
    },
    {
        text: "lectus",
        value: "41"
    },
    {
        text: "quis",
        value: "22"
    },
    {
        text: "est",
        value: "37"
    },
    {
        text: "ullamcorper",
        value: "71"
    },
    {
        text: "arcu",
        value: "37"
    },
    {
        text: "quis,",
        value: "10"
    },
    {
        text: "Nullam",
        value: "66"
    },
    {
        text: "luctus",
        value: "88"
    },
    {
        text: "vulputate",
        value: "31"
    },
    {
        text: "eros.",
        value: "26"
    },
    {
        text: "porttitor",
        value: "76"
    },
    {
        text: "molestie",
        value: "15"
    },
    {
        text: "massa.",
        value: "64"
    },
    {
        text: "dui.",
        value: "25"
    },
    {
        text: "nec,",
        value: "66"
    },
    {
        text: "eleifend",
        value: "92"
    },
    {
        text: "eget",
        value: "65"
    },
    {
        text: "sit",
        value: "25"
    },
    {
        text: "natoque",
        value: "42"
    },
    {
        text: "consequat,",
        value: "19"
    },
    {
        text: "turpis",
        value: "60"
    },
    {
        text: "Sed",
        value: "33"
    },
    {
        text: "amet",
        value: "92"
    },
    {
        text: "sapien,",
        value: "67"
    },
    {
        text: "nec",
        value: "46"
    },
    {
        text: "augue",
        value: "92"
    },
    {
        text: "convallis",
        value: "79"
    },
    {
        text: "mauris,",
        value: "31"
    },
    {
        text: "adipiscing.",
        value: "32"
    },
    {
        text: "nunc,",
        value: "88"
    },
    {
        text: "tempor",
        value: "68"
    },
    {
        text: "in,",
        value: "14"
    },
    {
        text: "mi",
        value: "32"
    },
    {
        text: "dignissim",
        value: "86"
    },
    {
        text: "natoque",
        value: "93"
    },
    {
        text: "egestas",
        value: "80"
    },
    {
        text: "sociis",
        value: "32"
    }
];



function WordCloud() {
    return <ReactWordcloud words={words} options={options}/>
}

export default WordCloud;