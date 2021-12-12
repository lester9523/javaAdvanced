create table goods
(
	id bigint auto_increment,
	type int not null comment '0 衣服，1鞋子，2生活用品，3 其他',
	goods_name varchar(20) not null,
	goods_desc varchar(200) not null,
	goods_price decimal(10,2) not null comment '商品标价',
	sale_price decimal(10,2) not null comment '售价',
	sale_status int not null comment '0未开售  1已售',
	create_time datetime default now() not null,
	update_time datetime default now() not null,
	constraint goods_pk
		primary key (id)
)
comment '商品表';

