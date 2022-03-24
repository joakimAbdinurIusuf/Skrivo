import axios from 'axios'

const USERS_REST_API_URL = 'http://localhost:8080/api/nodes';

class US {
    getNodes() {
        return axios.get(USERS_REST_API_URL);
    }
}

export default new US();