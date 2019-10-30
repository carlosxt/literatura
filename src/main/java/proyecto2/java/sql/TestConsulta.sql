-- 1.- Consultar el contenido de las tablas existentes.

select * from autores;
select * from editoriales;
select * from libros;

-- 2.- Consultar autores que nacieron después de 1930

select nombre, apellido
from autores 
where año_nacimiento > 1930;

-- 3.- Consultar autores que nacieron entre 1500 y 1905

select nombre, apellido
from autores
where año_nacimiento between 1500 and 1905;

-- 4.- Consultar todos los libros editados por editorial sudamericana

select      l.nombre_libro 'Nombre',
            l.genero_libro 'Genero',
            e.nombre 'Editorial'
from        libros l
join        editoriales e  on (l.editorial_id = e.editorial_id)
where       e.nombre = 'Sudamericana'
order by    l.genero_libro;	


-- 5.- Consultar todos los autores que hayan ganado el premio nobel



-- 6.- Consultar todos los libros que sean poesía

-- 7.- Consultar todos los autores que no tengan distinciones

-- 8.- Consultar los libros escritos por Ernest hemingway

-- 9.- Consultar todos los autores de nacionalidad peruana

-- 10.- Consultar que nacionalidad tienen los autores cuyos libros fueron editados
-- por editorial sudamericana


