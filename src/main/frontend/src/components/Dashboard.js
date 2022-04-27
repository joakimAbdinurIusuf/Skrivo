import { Button, Col, Row } from "react-bootstrap";
import React, {useEffect, useState} from "react";
import Flow from "./Flow";
import Sidebar from "./Sidebar";
import "./Dashboard.css";
import WordCloud from "./WordCloud";
import axios from "axios";
import FlowWithProvider from "./Flow";

//Co-author: Wilhelm Öberg
//Co-author: Johan Maseng
//Co-author: Alexander Falk
//Co-author: Joakim Abdinur Iusuf

const api = axios.create({
  baseURL:'http://localhost:8080/api'
})

function Dash() {

  const [nodes,setNodes] = useState([])
  const [words,setWords] = useState([])

  useEffect(() => {
    api.get('/nodes').then(res => {
      setNodes(res.data)
      console.log(res.data)
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
export default Dash;
