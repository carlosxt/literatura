
insert into editoriales(nombre)
values
('Sudamericana'),
('Seix Barral'),
('Raica'),
('Longseller'),
('Planeta'),
('El Ateneo'),
('Alfaguara'),
('Booket'),
('Debolsillo'),
('Sur'),
('Anagrama'),
('Emecé');

insert into autores(nombre,apellido,año_nacimiento,nacionalidad,distinciones) 
values 
('Gabriel','Garcia',1927,'Colombiana','Nobel de literatura'),
('Mario','Benedetti',1920,'Uruguaya','Orden Francisco De Miranda'),
('Gustavo','Bécquer',1836,'Española','Sin distinciones'),
('Miguel','De Cervantes',1547,'Española','Sin distinciones'),
('Nicólas','Maquiavelo',1469,'Florentino','Sin distinciones'),
('Mario','LLosa',1936,'Peruana','Nobel de literatura'),
('Ernest','Hemingway',1899,'Estadounidense','Nobel de literatura'),
('Vladímir','Nabókov',1899,'Ruso','Beca Guggenheim'),
('Charles','Bukowski',1920,'Alemana','Sin distinciones'),
('Antoine','Exupéry',1900,'Francesa','Sin distinciones'),
('José','Arguedas',1911,'Peruana','Premio Inka Garcilazo De La Vega'),
('Isabel','Allende',1942,'Chilena','Premio nacional del libro'),
('Gabriela','Mistral',1889,'Chilena','Nobel de literatura'),
('Julio','Cortázar',1914,'Argentina','Premio Médicis Etranger');


insert into libros(libro_id,nombre_libro,genero_libro,editorial_id,autor_id)
values
(null,'Cien años de soledad','Novela',1,1),
(null,'Por la libre','Ensayo periodístico',1,1),
(null,'Inventario uno','Poesía',2,2),
(null,'Cuentos completos','Cuentos',2,2),
(null,'Rimas y leyendas','Lírica',3,3),
(null,'Don quijote de la mancha','Novela',4,4),
(null,'La galatea','Novela',5,4),
(null,'El príncipe','Política',6,5),
(null,'La ciudad y los perros','Novela',7,6),
(null,'Pantaleón y las visitadoras','Novela',7,6),
(null,'Por quién doblan las campanas','Novela',8,7),
(null,'El viejo y el mar','Cuentos',9,7),
(null,'Lolita','Novela',10,8),
(null,'El hechicero','Cuentos',10,8),
(null,'La máquina de follar','Realismo',11,9),
(null,'El principito','Novela',12,10),
(null,'Katatay y otros poemas','Poesía',7,11),
(null,'La casa de los espíritus','Poesía',1,12),
(null,'Tala','Poesía',10,13),
(null,'Rayuela','Antinovela',1,14);
