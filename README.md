# DDD Tactical Template

## Keywords:

- DDD
- Hexagonal Architecture

## Assumptions

- the company domain is `macdao.com`
- the project code is `ecommerce`
- the bounded context name is `order`

## Details

本章节描述细节。

### 项目的包（Package）命名

因为公司/组织域名是`macdao.com`，而项目名称是`ecommerce`，所以项目的包名是`com.macdao.ecommerce`。

### 限界上下文（Bounded Context）的包命名

限界上下文应该有独立包。我们以`context`名称来表示限界上下文的包。比如`com.macdao.ecommerce.context`表示是限界上下文（领域模型）的包。与此对应的是Web的BFF的包：`com.macdao.ecommerce.web.bff`和OpenAPI的API Gateway的包：`com.macdao.ecommerce.openapi.apigateway`。

订单上下文的包为`com.macdao.ecommerce.context.order`，支付上下文的包为`com.macdao.ecommerce.context.payment`。

### 聚合

domain.model.order

### 应用

application

## adapter

mysql, api

## common

### flyway file naming

`src/main/resources/db/migration`

### DB Naming

数据库，表，字段



## Tasks

- contract test
- deps mock server
- unit
- combo adapter
- multi context in one service