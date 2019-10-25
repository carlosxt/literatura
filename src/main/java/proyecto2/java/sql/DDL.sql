drop database if exists literatura;
create database literatura;
show databases;

use literatura;

create table editorial(
editorial_id      int not null primary key,
nombre            varchar(40)

);

create table autor(
autor_id         int not null primary key,
nombre           varchar(45),
apellido         varchar(45),
año_nacimiento   int(4) null,
nacionalidad     varchar(55),
distinciones     varchar(65)
);

create table libro(
libro_id          int auto_increment primary key,
nombre_libro      varchar(45),
genero_libro      varchar(35),
editorial_id      int,
autor_id          int,
foreign key (editorial_id) references editorial (editorial_id),
foreign key (autor_id)     references autor (autor_id)
);
	
