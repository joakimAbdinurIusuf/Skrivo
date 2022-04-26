import { Button, Col, Row } from "react-bootstrap";
import React from "react";
import Flow from "./Flow";
import Sidebar from "./Sidebar";
import "./Dashboard.css";
import WordCloud from "./WordCloud";
import axios from "axios";

const api = axios.create({
  baseURL:'http://localhost:8080/api'
})

class Dashboard extends React.Component {

  state = {}
  constructor() {
    super();
    api.get('/nodes').then(res => {
      this.setState({nodes: res.data})
      console.log("got nodes from axios",res.data)
    })
    api.get('/wordcloud').then(res => {
      this.setState({words: res.data})
      console.log(this.state.words)
    })
  }
  render() {
    return (
      <div className={"Outer-border"}>
        <Sidebar/>
        <div className="content">
          <Row>
            <Col>
              <Col className={"Navigation-buttons-column"}>
                <Button size={"lg"} className={"Navigation-button"}>
                  Network
                </Button>
                <Button size={"lg"} className={"Navigation-button"}>
                  Completed tasks
                </Button>
                <Button size={"lg"} className={"Navigation-button"}>
                  Notifications
                </Button>
                <Button size={"lg"} className={"Navigation-button"}>
                  Reports
                </Button>
              </Col>
              <Col className={"Network-graph"}>
                <Flow nodes={this.state.nodes}/>
              </Col>
            </Col>
            <Col xl={4} className={"Word-cloud"}>
              <WordCloud words={this.state.words}/>
            </Col>
          </Row>
        </div>
      </div>
    );
  }
}
export default Dashboard;
