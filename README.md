Biblioteca UFPSO

Este codigo se encarga de un sistema de una biblioteca para la prestacion de libros, un sistema para confirmar a los usuarios en su consulta, si los libros estan disponibles o en su momento se encuentran prestados.

class Libro: 

Esta es la clase padre para los atributos de los libro.
Esta clase contiene todos los atributos del libro los cuales son:
-titulo del libro 
-autor del libro
-ISBN(codigo de referencia del libro)
-estado del libro (si esta diponible o no)

Dentro de esta clase se encuentra el objeto del libro, el cual recibe los parametros o atributos de la clase padre, especificados anteriormente.

Esta clase tambien contiene algunos metodos los cuales serán especificados acontinuacion:

public void Prestar():
Este metodo se encarga de verificar el estado del libro, es decir, si el libro no se encuentra disponible y le da un aviso al usuario.
Ademas se registra en el sistema como prestrado.
En este metodo el libro está determinado como FALSE, esto cuando el libro no se encuentra disponible dentro del sistema

public void devolver():
Este metodo es responsable de verificar si el libro se encuentra disponible en la biblioteca y le porporciona la informacion al usuario
Ademas de esto tambien se registra en el sistema como disponible
En este metodo el libro está determinado como TRUE, esto cuando el libro se encuentra disponible dentro del sistema

Class Usuario:

Esta es una clase padre(principal) la cual contiene los siguientes atributos:
-nombre del usuario
-ID(identificacion del usuario)
-la cantidad de libros prestados

Dentro de esta clase padre se encuentra creado el objeto de usuario, el cual hereda los atributos de la clase padre y almecena los datos del usuario.

Dentro de esta clase padre estan creados los siguientes metodos:

public void prestarLibros():
Este metodo se encarga de hacer que el usuariop pueda tomar prestado un libro de la biblioteca.

public void devolverLibro():
Este metodo es el encargado de hacer que el usuario pueda o deba devolver el libro que se le fue prestado con anterioridad

Class GestionBiblioteca:

Esta clase contiene la siguiente informacion:
-registro de los libros
-usuarios que usaron libros del sitema
-verifica la disponibilidad de los libros(los libros que estan disponibles y lo que no)
-crea un historial de los libros que fueron prestados y devueltos