## Description

Sample of Domain-driver design

## Installation

```bash
$ npm install
```

## Running the app

```bash
# development
$ npm run start

# watch mode
$ npm run start:dev

# production mode
$ npm run start:prod
```

Postman:

- POST
  http://localhost:3000/users/create
  ```bash
  {
    "fullName": "fvdavid",
    "password": "123456789",
    "email": "fv@halunix.com"
  }
  ```

- GET
  http://localhost:3000/users/83ba111c-4807-486d-b3c5-b115f0c21de8

