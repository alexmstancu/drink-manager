FROM node:8.10.0

#EXPOSE 4200

RUN mkdir /usr/src/app
WORKDIR /usr/src/app

ENV PATH /usr/src/app/node_modules/.bin:$PATH

COPY package.json /usr/src/app/package.json
COPY package-lock.json /usr/src/app/package-lock.json

RUN npm install
RUN npm install -g @angular/cli

COPY . /usr/src/app

CMD ng serve