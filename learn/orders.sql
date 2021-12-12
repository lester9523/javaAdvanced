create table orders
(
	id bigint auto_increment,
	user_id bigint not null,
	goods_id bigint not null,
	order_status int not null comment '0 未付款，1已付款 2已收货',
	money decimal(10,2) not null,
	create_time datetime default now() not null,
	update_time datetime default now() null,
	constraint orders_pk
		primary key (id)
)
comment '订单表';

