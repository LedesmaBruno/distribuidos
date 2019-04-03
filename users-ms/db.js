const { Pool } = require('pg');
const config = require('./config.json');

const pool = new Pool(config.ps);

pool.on('error', (err) => {
    console.error('Unexpected error', err);
    process.exit(-1);
});

async function getUserById(id) {
    return await pool.connect()
        .then(client => {
            return client.query("SELECT * FROM users WHERE id = $1", [id])
                .then(res => {
                    client.release();
                    return res.rows[0];
                })
                .catch(e => {
                    client.release();
                    return {};
                });
        });
}

module.exports = { getUserById };