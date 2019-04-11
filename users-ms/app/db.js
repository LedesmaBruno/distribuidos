const { Pool } = require('pg');
const config = require('./config.js');

const pool = new Pool(config.pg);

async function getUserById(id) {
    return await pool.connect()
        .then(client => {
            console.log('connected');
            client.query('SELECT * FROM users WHERE id = $1', [id])
                .then(res => {
                    client.release()
                    return res;
                })
                .catch(err => {
                    client.release();
                    console.error(err);
                });
        })
        .catch(console.error);
}

module.exports = { getUserById }