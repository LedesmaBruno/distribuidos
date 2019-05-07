const { Pool } = require('pg');
const config = require('./config.js');

const pool = new Pool(config.pg);

function getUserById(id, callback) {
    pool.query('SELECT * FROM users WHERE id = $1', [id], callback);
}

function addUser(user, callback) {
    pool.query('INSERT INTO users(user_name, user_surname, user_email, user_last_access) VALUES($1, $2, $3, $4) RETURNING id',
        [user.name, user.surname, user.email, user.lastAccess], callback);
}

function deleteUser(id, callback) {
    pool.query('DELETE FROM users WHERE id = $1', [id], callback);
}

function getUsersByLastAccess(before, after, callback) {
    pool.query('SELECT * FROM users WHERE user_last_access BETWEEN $1 AND $2', [before, after], callback);
}

module.exports = { getUserById, getUsersByLastAccess, addUser, deleteUser };