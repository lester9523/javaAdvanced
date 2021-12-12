create table users
(
    id bigint auto_increment,
    username varchar(20) not null,
    phone int not null,
    age int not null,
    create_time datetime default now() not null,
    constraint users_pk
        primary key (id)
);

create unique index users_phone_uindex
    on users (phone);

create unique index users_username_uindex
    on users (username);

