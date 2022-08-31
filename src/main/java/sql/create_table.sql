create type driver_access_type as enum ('ONLINE','OFFLINE');
create type car_type as enum ('LUX','NORMAL');

create table if not exists admin
(
    id            bigserial primary key,
    firstname     varchar(255)       not null,
    lastname      varchar(255)       not null,
    national_code char(10) unique    not null,
    phone_number  char(11) unique    not null,
    username      varchar(20) unique not null,
    password      varchar(255)       not null
    );

create table if not exists address
(
    id          bigserial primary key,
    province    varchar(255) not null,
    city        varchar(255) not null,
    description text         not null
    );

create table if not exists car
(
    id     bigserial primary key,
    name   varchar(255) not null,
    plaque char(8)      not null,
    type   car_type     not null
    );

create table if not exists driver
(
    id            bigserial primary key,
    firstname     varchar(255)       not null,
    lastname      varchar(255)       not null,
    national_code char(10) unique    not null,
    phone_number  char(11) unique    not null,
    username      varchar(20) unique not null,
    password      varchar(255)       not null,
    total_income  float,
    access_type   driver_access_type not null,
    car_id        int8 references car (id),
    travels_id    int[]
    );

create table if not exists passenger
(
    id            bigserial primary key,
    firstname     varchar(255)       not null,
    lastname      varchar(255)       not null,
    national_code char(10) unique    not null,
    phone_number  char(11) unique    not null,
    username      varchar(20) unique not null,
    password      varchar(255)       not null,
    address_id    int8[] references address (id),
    travels_id    int8[],
    total_pay     float
    );

create table if not exists travel
(
    id             bigserial primary key,
    origin_id      int8 references address (id),
    destination_id int8 references address (id),
    driver_id      int8 references driver (id),
    passenger_id   int8 references passenger (id),
    price          float not null
    );