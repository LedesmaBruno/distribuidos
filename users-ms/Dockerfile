FROM node:8

WORKDIR /usr/src/app

COPY package*.json ./

RUN npm install --prod

COPY . .

CMD ["node", "./app/userServer.js"]