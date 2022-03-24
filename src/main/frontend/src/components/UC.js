import React from 'react';
import US from '../services/US';

class UC extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            users:[]
        }
    }

    cdm() {
        US.getNodes().then((response) => {
            this.setState({users: response.data})
        });
    }

    render() {
        <div>
            <h1 className="text-center"> Users List </h1>
            <table className = "table table-striped">
                <thead>
                <tr>
                    <td>
                        Node ID
                    </td>
                    <td>
                        Size
                    </td>
                    <td>
                        x
                    </td>
                    <td>
                        y
                    </td>
                </tr>
                </thead>
                <tbody>
                {
                    this.state.users.map(
                        user =>
                            <tr key = {user.nodeId}>
                                <td> {user.nodeId}</td>
                                <td> {user.size}</td>
                                <td> {user.x}</td>
                                <td> {user.y}</td>
                            </tr>
                    )
                }
                </tbody>
            </table>
        </div>
    }
}

export default UC