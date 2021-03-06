import { Button, Col, Row } from "react-bootstrap";
import React, {useEffect, useState} from "react";
import Sidebar from "./Sidebar";
import "./Dashboard.css";
import WordCloud from "./WordCloud";
import axios from "axios";
import FlowWithProvider from "./Flow";

//Co-author: Wilhelm Öberg
//Co-author: Johan Maseng
//Co-author: Alexander Falk
//Co-author: Joakim Abdinur Iusuf

// This is the main component that contains the entire webapp.
// It uses the react-bootstrap grid system for layouting.
// React-Flow for the network graph component
// React-wordcloud for the wordcloud.

// We are using functional components & hooks to handle the state of different components.
// This is the preferred way of using react since version 16.

const api = axios.create({
  baseURL:'http://localhost:8080/api'
})

function Dashboard() {

  const [nodes,setNodes] = useState([])
  const [words,setWords] = useState([])

  // useEffect will execute once, at the initial render of the Dashboard component
  // nodes are fetched from http://localhost:8080/api/nodes and put in the nodes via setNodes
  useEffect(() => {
    api.get('/nodes').then(res => {
      setNodes(res.data)
    })
  },[])

  return (
    <div className={"Outer-border"}>
      <Sidebar/>
      <div className="content">
        <Row>
          <Col>
            <Col className={"Navigation-buttons-column"}>
              <Button style={{backgroundColor:"#5695E3",borderColor:"#5695E3"}} size={"lg"} className={"Navigation-button"}>
                Network
              </Button>
              <Button style={{backgroundColor:"#5695E3",borderColor:"#5695E3"}} size={"lg"} className={"Navigation-button"}>
                Completed tasks
              </Button>
              <Button style={{backgroundColor:"#5695E3",borderColor:"#5695E3"}} size={"lg"} className={"Navigation-button"}>
                Notifications
              </Button>
              <Button style={{backgroundColor:"#5695E3",borderColor:"#5695E3"}} size={"lg"} className={"Navigation-button"}>
                Reports
              </Button>
            </Col>
            <Col className={"Network-graph"}>
              <FlowWithProvider nodes={nodes} onChange={(words) => setWords(words)}/>
            </Col>
          </Col>
          <Col xl={4} className={"Word-cloud"}>
            <WordCloud words={words}/>
          </Col>
        </Row>
      </div>
    </div>
  );
}
export default Dashboard;
