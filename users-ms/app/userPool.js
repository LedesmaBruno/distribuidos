function get(n = 10) {
    const users = [];
    let i = 0;
    while (i < n) {
        const u = {
            name: 'name-' + i,
            surname: 'surname-' + i,
            email: 'test' + i + '@test.com',
            lastAccess: new Date()
        }
        users.push(u);
        i++;
    }
    return users;
}

(function fillDB() {
    const users = UserPool.get(20);
    for(let user in users) {
        db.addUser(user);
    }
}());
