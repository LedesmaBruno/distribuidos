const messages = require('../protoc/user_pb');
const services = require('../protoc/user_grpc_pb');

const grpc = require('grpc');
const config = require('./config.js');

const client = new services.UserServiceClient(config.ip + ':' + config.port,
    grpc.credentials.createInsecure());

function addUser(user) {
    const userRequest = new messages.AddUserRequest();
    userRequest.setName(user.name);
    userRequest.setSurname(user.surname);
    userRequest.setEmail(user.email);

    client.addUser(userRequest, (err, response) => {
        if (err) {
            console.error(err);
        }
        else {
            console.log(response.getId());
        }
    });
}

function getUser(id) {
    const userRequest = new messages.GetUserRequest();
    userRequest.setId(id);

    client.getUser(userRequest, (err, response) => {
        if (err) {
            console.error(err);
        }
        else {
            if (response.getUser() !== undefined) {
                console.log(response.getUser().toObject());
            }
        }
    });
}

function deleteUser(id) {
    const request = new messages.DeleteUserRequest();
    request.setId(id);

    client.deleteUser(request, (err, res) => {
       if (err) {
           console.log(err);
       }
       else {
           console.log(res.getId());
       }
    });
}

function getUsersByLastAccess(before, after) {
    const request = new messages.LastAccessRequest();
    request.setBefore(Number(before));
    request.setAfter(Number(after));

    client.getUsersByLastAccess(request, (err, res) => {
        if (err) {
            console.log(err);
        }
        else {
            console.log(res.toObject());
        }
    });
}

function main() {
    // addUser({
    //     name: 'test_name',
    //     surname: 'test_surname',
    //     email: 'test@test.com'
    // });

    // getUser(1);
    // deleteUser(12);
    const before = new Date();
    before.setDate(2);
    const after = new Date();
    after.setDate(4);

    getUsersByLastAccess(before, after);
}

main();