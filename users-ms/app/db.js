const { Pool } = require('pg');
const config = require('./config.js');

const pool = new Pool(config.pg);

async function getUserById(id) {
    return await pool.connect()
        .then(client => {
            client.query('SELECT * FROM users WHERE id = $1', [id])
                .then(res => {
                    client.release()
                    return res;
                })
                .catch(err => {
                    client.release();
                });
        });
}

async function getUsersByLastAccess(before = Date.now().getTime(), after = Date.now().getTime()) {
    return await pool.connect()
        .then(client => {
            client.query('SELECT * FROM users WHERE lastAccess BETWEEN $1 AND $2', [before, after])
                .then(res => {
                    client.release();
                    return res;
                })
                .catch(err => {
                    client.release();
                });
        });
}

module.exports = { getUserById, getUsersByLastAccess }