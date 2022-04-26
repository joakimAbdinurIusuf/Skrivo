import React, {Component} from 'react';
import axios from "axios";

const api = axios.create({
    baseURL:'http://localhost:8080/api/nodes'
})

class GetNodesViaAxios extends Component {

    constructor() {
        super();
        api.get('/').then(res => {
            console.log(res.data)
        })
    }

    render() {
        return (<br/>);
    }
}

export default GetNodesViaAxios;