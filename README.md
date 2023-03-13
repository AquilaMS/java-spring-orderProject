
# 

Obs: Este é um projeto feito para o curso **Java COMPLETO 2023 Programação Orientada a Objetos +Projetos** do **Nélio Alves** na **Udemy**

https://www.udemy.com/course/java-curso-completo/


## Documentação da API
### User


``http
  GET /users
``

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| ` ` | `json` | Retorna todos os usuários |



``http
  POST /users
``

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `USER`      | `USER` |Adiciona um novo usuário |

``http
  GET /users/${id}
``

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` |Retorna um usuário de acordo com o Id |



``http
  DELETE /users/${id}
``

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` |Deleta um usuário de acordo com o Id |

``http
  PUT /users/${id}
``

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` |Atualiza os dados de um usuário de acordo com o Id e dados enviados pelo Body|

### Products
``http
  GET /products
``

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| ` `      | ` ` |Retorna todos os produtos|

``http
  GET /products/${id}
``

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `id` |Retorna um produto de acordo com o Id|

### Orders
``http
  GET /orders
``

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| ` `      | ` ` |Retorna todas as orders|

``http
  GET /orders/${id}
``

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `id` |Retorna uma order de acordo com o Id|


### Category

``http
  GET /category
``

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| ` `      | ` ` |Retorna todas as categories|

``http
  GET /category/${id}
``

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `id` |Retorna uma category de acordo com o Id|



