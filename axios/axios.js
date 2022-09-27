import axios from "axios";
export {makeRequest};

async function makeRequest() {
    const config = {
        method: 'get',
        url: 'https://gorest.co.in/public/v2/users/27'
    }

    let res = await axios(config);
    console.log(res.data);
}


