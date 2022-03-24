import React from 'react';
import UserService from '../services/UserService';

class UserComponent extends React.Component {

    constructor(props){
        super(props)
        this.state = {
            users:[]
        }
    }

    componentDidMount(){
        UserService.getUsers().then((response) => {
            this.setState({ users: response.data})
        });
    }

    render (){
        return (
            <div>
                <h1 className = "text-center"> Node List</h1>
                <table className = "table table-striped">
                    <thead>
                    <tr>

                        <td> Node Id</td>
                        <td> Size</td>
                        <td> X </td>
                        <td> Y </td>
                    </tr>

                    </thead>
                    <tbody>
                    {
                        this.state.users.map(
                            user =>
                                <tr key = {user.nodeID}>
                                    <td> {user.nodeID}</td>
                                    <td> {user.size}</td>
                                    <td> {user.x}</td>
                                    <td> {user.y}</td>
                                </tr>
                        )
                    }

                    </tbody>
                </table>

            </div>

        )
    }
}

export default UserComponent