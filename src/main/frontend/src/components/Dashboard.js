import { Button, Col, Row } from "react-bootstrap";
import React from "react";
import Flow from "./Flow";
import wordcloud from "./images/Steve.png"
import { Image } from "react-bootstrap";
import Sidebar from "./Sidebar";
import "./Dashboard.css";

class Dashboard extends React.Component {
  state = {};
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
                <Flow />
              </Col>
            </Col>
            <Col xl={4} className={"Word-cloud"}>
              <h1>Word Cloud</h1>
              <Image src={wordcloud} fluid/>
            </Col>
          </Row>
        </div>
      </div>
    );
  }
}
export default Dashboard;
