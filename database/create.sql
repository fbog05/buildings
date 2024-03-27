create database argus;
use argus;

create table buildings(
    id        int not null primary key auto_increment,
    city      varchar(50),
    address   varchar(50),
    busage     varchar(50),
    size      int,
    price     double,
);