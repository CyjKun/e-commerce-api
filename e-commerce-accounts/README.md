# E-Commerce-Accounts

---

## Save Account
@PostMapping = `localhost:8000/api/accounts`

headers:

key = `Content-type`

value = `application/json`

body:
```
{
	"firstName":"<First_Name>",
	"lastName":"<Last_Name>"
}
```

---

## Get All Accounts
@GetMapping = `localhost:8000/api/accounts`

---

## Get One Account
@GetMapping = `localhost:8000/api/accounts/{id}`

id = id of the account

---

## Update Account
@PutMapping = `localhost:8000/api/accounts/{id}`

id = id of the account

body:
```
{
	"firstName":"<First_Name>",
	"lastName":"<Last_Name>"
}
```

## Delete One Product
@DeleteMapping = `localhost:8000/api/accounts/{id}`

id = id of the account

---

`application.properties`
```
# this is the identifier of the API that we just created
auth0.audience=e-commerce-api
auth0.issuer=https://dev-cj.auth0.com/

## Spring DATASOURCE (DataSourceAutoConfiguration & DataSourceProperties)
spring.datasource.url = jdbc:mysql://localhost:3306/eCommerceApi?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false
spring.datasource.username = root
spring.datasource.password = root

## Hibernate Properties

# The SQL dialect makes Hibernate generate better SQL for the chosen database
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect

# Hibernate ddl auto (create, create-drop, validate, update)
spring.jpa.hibernate.ddl-auto = update

spring.application.name=e-commerce-accounts
server.port=8000
```