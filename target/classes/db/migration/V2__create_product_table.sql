create table products.product(
	id bigserial primary key,
	product_identifier varchar not null,
	nome carchar(100) not null,
	descricao varchar not null,
	preco float not null,
	category_id bigint REFERENCES products.category(id)
);
