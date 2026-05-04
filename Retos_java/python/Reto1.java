package Retos_java.python;

public class Reto1 {
    public static void main(String[] args) {
        String nombre = "Stiver";
        int edad = 20;
        double estatura = 1.75;
        boolean estudianteProgramacion = true;
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
        System.out.println("¿Estudia programacion? "+ estudianteProgramacion);

        int a = 10;
        int b = 3;

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Residuo: " + (a % b));

        String materiaFavorita = "Programacion";
        int numeroMateria = 5;
        double promedio = 8.7;
        boolean tieneGitHub = true;

        System.out.println("Materia Favorita: " + materiaFavorita);
        System.out.println("Numero de materias: " + numeroMateria);
        System.out.println("Promedio: " + promedio);
        System.out.println("Tienes GitHub? " + tieneGitHub);
    }
}