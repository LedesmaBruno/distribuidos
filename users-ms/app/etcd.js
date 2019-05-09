const Etcd = require('node-etcd');
const config = require('./config.js');

(function regsiterDB() {
    const key = '/config/users/';
    const value = config.pg;

    const etcd = new Etcd(config.etcd.hosts);
    etcd.set(key, value, console.log);
}());
