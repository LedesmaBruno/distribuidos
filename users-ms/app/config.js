const config = {
    ip: 'localhost',
    port: 8081,
    pg: {
        user: 'users',
        host: '192.168.99.100',
        database: 'users',
        password: 'users',
        port: 5432
    },
    etcd: {
        hosts: '192.168.99.100:2379'
    }
};

module.exports = config;