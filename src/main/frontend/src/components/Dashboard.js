import { Button, Col, Row } from "react-bootstrap";
import React from "react";
import Flow from "./Flow";
import Sidebar from "./Sidebar";
import "./Dashboard.css";
import WordCloud from "./WordCloud";

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
              <WordCloud/>
            </Col>
          </Row>
        </div>
      </div>
    );
  }
}
export default Dashboard;
