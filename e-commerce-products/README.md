# E-Commerce-Products

## Save Product
@PostMapping = `localhost:8100/api/products`

headers:

key = `Content-type`

value = `application/json`

body:
```
{
	"name":"Product1",
	"description":"Product1 description"
}
```

## Get All Products
@GetMapping = `localhost:8100/api/products`

## Get One Product
@GetMapping = `localhost:8100/api/products/{id}`

id = id of the product

## Delete One Product
@DeleteMapping = `localhost:8100/api/products/{id}`

id = id of the product

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

spring.application.name=e-commerce-products
server.port=8100
```
