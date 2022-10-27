import java.util.ArrayList;
import java.util.List;

public class DemoLambda {
    public static void main(String[] args) {
        List<Alumno> listaAlumnos = new ArrayList<>();

        listaAlumnos.add(new Alumno(1, "1717213183", "Javier Ignacio", "Molina Cano", "Java 8", 7, 28));
		listaAlumnos.add(new Alumno(2, "1717456218", "Lillian Eugenia", "Gómez Álvarez", "Java 8", 10, 33));
		listaAlumnos.add(new Alumno(3, "1717328901", "Sixto Naranjoe", "Marín", "Java 8", 8.6, 15));
		listaAlumnos.add(new Alumno(4, "1717567128", "Gerardo Emilio", "Duque Gutiérrez", "Java 8", 10, 13));
		listaAlumnos.add(new Alumno(5, "1717902145", "Jhony Alberto", "Sáenz Hurtado", "Java 8", 9.5, 15));
		listaAlumnos.add(new Alumno(6, "1717678456", "Germán Antonio", "Lotero Upegui", "Java 8", 8, 34));
		listaAlumnos.add(new Alumno(7, "1102156732", "Oscar Darío", "Murillo González", "Java 8", 8, 32));
		listaAlumnos.add(new Alumno(8, "1103421907", "Augusto Osorno", "Palacio Martínez", "PHP", 9.5, 17));
		listaAlumnos.add(new Alumno(9, "1717297015", "César Oswaldo", "Alzate Agudelo", "Java 8", 8, 26));
		listaAlumnos.add(new Alumno(10, "1717912056", "Gloria Amparo", "González Castaño", "PHP", 10, 28));
		listaAlumnos.add(new Alumno(11, "1717912058", "Jorge León", "Ruiz Ruiz", "Python", 8, 22));
		listaAlumnos.add(new Alumno(12, "1717912985", "John Jairo", "Duque García", "Java Script", 9.4, 32));
		listaAlumnos.add(new Alumno(13, "1717913851", "Julio Cesar", "González Castaño", "C Sharp", 10, 22));
		listaAlumnos.add(new Alumno(14, "1717986531", "Gloria Amparo", "Rodas Monsalve", "Ruby", 7, 18));
		listaAlumnos.add(new Alumno(15, "1717975232", "Gabriel Jaime", "Jiménez Gómez", "Java Script", 10, 18));

        /*---------------------------------------------------
        
        // Primer ejemplo: Obtener todos los alumnos de la lista
        System.out.println("*** Lista de Alumnos ***");
        // De la lista obtenemos la secuencia de datos (stream) de cada uno de los elementos de la lista (forEach), esta lista tiene objetos Alumno (a) e imprimimos ese dato.
        listaAlumnos.stream().forEach(a -> System.out.println(a));

        */

        /*---------------------------------------------------

        // Segundo ejemplo: Imprimir todos aquellos alumnos cuyo nombre empieza con el caracter 'L' o 'G'
        System.out.println("*** Alumnos cuyo nombre empieza con el caracter L u G ***");
        // De la lista obtenemos la secuencia de datos (stream) filtrando los resultados con 'L' o 'G' de cada uno de los elementos de la lista (forEach), esta lista tiene objetos Alumno (a) e imprimimos ese dato.
        listaAlumnos.stream().filter(a -> a.getApellidos().charAt(0) == 'L' || a.getApellidos().charAt(0) == 'G').forEach(a -> System.out.println(a));

        */

        /*---------------------------------------------------

        // Tercer ejemplo: Imprimir longitud de la lista
        System.out.println("*** Numero de alumnos ***");
        System.out.println(listaAlumnos.stream().count());

        */

        /*---------------------------------------------------------------

        // Cuarto ejemplo: Obtener alumnos con notas mayores a 9 y que cursen PHP
        System.out.println("*** Alumnos con nota mayor a 9 y que cursen PHP ***");
        listaAlumnos.stream().filter(a -> a.getNota() > 9 && a.getNombreCurso().equals("PHP")).forEach(a -> System.out.println(a));
        
        */

        /*------------------------------------------------------

        // Quinto ejemplo: Obtener alunos que sean menores de edad
        System.out.println("*** Alumno con menor edad ***");
        System.out.println(listaAlumnos.stream().min((a1, a2) -> a1.getEdad() - a2.getEdad()));

        */
        
        /*---------------------------------------------------------

        // Sexto ejemplo: Obtener alumno con la mayor edad
        System.out.println("*** Alumno con mayor edad ***");
        System.out.println(listaAlumnos.stream().max((a1, a2) -> a1.getEdad() - a2.getEdad()));

        */

        /*------------------------------------------------------------

        // Septimo ejemplo: Obtener el primer alumno de la lista
        System.out.println("*** Encontrar el primer alumno ***");
        System.out.println(listaAlumnos.stream().findFirst());

        */

        /*-----------------------------------------------------
        
        // Octavo ejemplo: Alumnos que su materia acabe en t
        System.out.println("**** Alumnos en los  que los nombres de los cursos que terminan en t ***");
		listaAlumnos.stream().filter(a -> a.getNombreCurso().endsWith("t")).forEach(System.out::println);

        */

        /*----------------------------------------------------------------
        
        // Noveno ejemplo: Alumnos cuyos nombre de curso tengan 'a'
        System.out.println("**** Alumnos que tienen un curso en el que el nombre contienen la A ***");
		listaAlumnos.stream().filter(a -> a.getNombreCurso().contains("a")).forEach(System.out::println);

        */

        // Decimo ejemplo: Alumnos cuya longitud de nombre sea mayor a 10
        System.out.println("**** Alumnos en que su tamaño de su nombre es mayor a 10 caracteres ***");
		listaAlumnos.stream().filter(a -> a.getNombres().length() > 10).forEach(System.out::println);
    }
}