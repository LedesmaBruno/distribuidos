const config = {
    ip: process.env.MS_HOST,
    port: 8081,
    pg: {
        user: process.env.PG_USER,
        host: process.env.PG_HOST,
        database: process.env.PG_DATABASE,
        password: process.env.PG_PASSWORD,
        port: 5432
    }
};

module.exports = config