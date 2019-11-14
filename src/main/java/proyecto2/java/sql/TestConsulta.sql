-- use literatura;

-- 1.- Consultar el contenido de las tablas existentes.

select * from autores;
select * from editoriales;
select * from libros;

-- 2.- Consultar autores que nacieron después de 1930.

select a.nombre, a.apellido
from autores a
where a.año_nacimiento > 1930;

-- 3.- Consultar autores que nacieron entre 1500 y 1905.

select a.nombre, a.apellido
from autores a
where a.año_nacimiento between 1500 and 1905;

-- 4.- Consultar todos los libros editados por editorial sudamericana.

select      l.nombre_libro 'Nombre',
            l.genero_libro 'Genero',
            e.nombre 'Editorial'
from        libros l
join        editoriales e  on (l.editorial_id = e.editorial_id)
where       e.nombre = 'Sudamericana'
order by    l.genero_libro;	

-- 5.- Consultar todos los autores que hayan ganado el premio nobel.

select  a.nombre, a.apellido
from    autores a
where   a.distinciones = 'Nobel de literatura';        


-- 6.- Consultar todos los libros que sean poesía.

select  l.nombre_libro
from    libros l
where   l.genero_libro = 'Poesía';

-- 7.- Consultar el libro cuyo autor haya ganado el premio Orden Francisco De Miranda
-- y que editorial lo edito. ¡¡¡¡¡¡¡
select    l.nombre_libro 'Libro',
          concat(a.nombre,' ',a.apellido)'Autor',
          a.distinciones 'Distinciones',
          e.nombre 'Editorial'
from      libros l
join      autores a on (l.autor_id = a.autor_id)       
join      editoriales e on (l.editorial_id = e.editorial_id)
where     a.distinciones = 'Orden Francisco De Miranda';

-- 8.- Consultar los libros escritos por Ernest hemingway.

select      l.nombre_libro 'Nombre'
            
from        libros l
join        autores a  on (l.autor_id = a.autor_id)
where       a.nombre = 'Ernest';

	

-- 9.- Consultar todos los autores de nacionalidad peruana y que libros escribieron.

select      a.nombre  'Nombre', 
			a.apellido 'Apellido',
            l.nombre_libro 'Nombre libro'
from        libros l  
join        autores a  on (l.autor_id = a.autor_id)
where       a.nacionalidad = 'Peruana';       

-- 10.- Consultar cuantos autores escriben novelas

select      count(a.autor_id) 'Cantidad de autores'
from        autores a
join        libros l on (a.autor_id = l.libro_id)
where       l.genero_libro = 'Novela'; 


update autores where id=? set autor_id=?, nombre=?, apellido=?, año_nacimiento=?
