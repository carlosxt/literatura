use literatura;

insert into autores(autor_id,nombre,apellido,año_nacimiento,nacionalidad,distinciones) 
values 
(1,'Gabriel','Garcia',1927,'Colombiana','Nobel de literatura'),
(2,'Mario','Benedetti',1920,'Uruguaya','Orden Francisco De Miranda'),
(3,'Gustavo','Bécquer',1836,'Española','Sin distinciones'),
(4,'Miguel','De Cervantes',1547,'Española','Sin distinciones'),
(5,'Nicólas','Maquiavelo',1469,'Florentino','Sin distinciones'),
(6,'Mario','LLosa',1936,'Peruana','Nobel de literatura'),
(7,'Ernest','Hemingway',1899,'Estadounidense','Nobel de literatura'),
(8,'Vladímir','Nabókov',1899,'Ruso','Beca Guggenheim'),
(9,'Charles','Bukowski',1920,'Alemana','Sin distinciones'),
(10,'Antoine','Exupéry',1900,'Francesa','Sin distinciones'),
(11,'José','Arguedas',1911,'Peruana','Premio Inka Garcilazo De La Vega'),
(12,'Isabel','Allende',1942,'Chilena','Premio nacional del libro'),
(13,'Gabriela','Mistral',1889,'Chilena','Nobel de literatura'),
(14,'Julio','Cortázar',1914,'Argentina','Premio Médicis Etranger');

insert into editoriales(editorial_id,nombre)
values
(1,'Sudamericana'),
(2,'Seix Barral'),
(3,'Raica'),
(4,'Longseller'),
(5,'Planeta'),
(6,'El Ateneo'),
(7,'Alfaguara'),
(8,'Booket'),
(9,'Debolsillo'),
(10,'Sur'),
(11,'Anagrama'),
(12,'Emecé');

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
