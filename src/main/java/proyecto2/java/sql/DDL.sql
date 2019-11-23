drop database if exists AqeuJt3sJ4;
create database AqeuJt3sJ4;
use AqeuJt3sJ4;
create table editoriales(
editorial_id      int auto_increment primary key,
nombre            varchar(40)

);

create table autores(
autor_id         int auto_increment primary key,
nombre           varchar(45),
apellido         varchar(45),
año_nacimiento   int(4) null,
nacionalidad     varchar(55),
distinciones     varchar(65)
);

create table libros(
libro_id          int auto_increment primary key,
nombre_libro      varchar(45),
genero_libro      varchar(35),
editorial_id      int,
autor_id          int,
foreign key (editorial_id) references editoriales (editorial_id),
foreign key (autor_id)     references autores (autor_id)
);
	