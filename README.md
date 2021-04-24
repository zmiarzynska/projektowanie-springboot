# projektowanie-springboot

Dostępne endpointy:

POST: http://localhost:8080/authorization/register


GET: http://localhost:8080/authorization/login


GET: http://localhost:8080/authorization/logout



We wszystkich przypadkach niezbędne jest użycie body.

W "Register" oraz "Login" z polami 'username' oraz 'password': 

np. {"username": "userSample", "password": "paswd" }

W logout z polem "username"

{"username": "userSample"}

