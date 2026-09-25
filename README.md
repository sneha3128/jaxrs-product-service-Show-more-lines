# JAX-RS Product REST Service

## Overview

This project demonstrates a Product REST Service using JAX-RS.

The application provides REST endpoints to:

- Retrieve all products
- Retrieve a product by ID
- Create a new product

## Architecture

Client
↓
ProductResource
↓
ProductRepository
↓
Product Data

## REST Endpoints

### GET /products

Returns all available products.

### GET /products/{id}

Returns a specific product based on the supplied ID.

### POST /products

Creates a new product.

## Sample Product JSON

{
  "id": 101,
  "name": "Laptop",
  "price": 50000
}

## HTTP Status Codes

200 - OK

201 - Created

400 - Bad Request

404 - Not Found

409 - Conflict

500 - Internal Server Error

## Future Enhancements

- Database Integration
- Authentication and Authorization
- Product Update API
- Product Delete API
- Pagination and Search
