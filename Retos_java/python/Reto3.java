package Retos_java.python;

public class Reto3 {
    //metodo que saluda
    public static void saludar(String nombre) {
        System.out.println("¡Hola" + nombre + "!");
    }

    //Metodo que suma 2 numeros
    public static int sumar(int a, int b){
        return a + b;
    }

    //Metodo que dice si un número es par o impar
    public static String parOImpar(int numero){
        if (numero % 2 == 0){
        return "par";
    } else {
        return "impar";
    }
  }

  // Método que calcula el mayor de dos números
    public static int mayor(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static double areaRectangulo(double ancho, double alto){
        return ancho * alto;
    }

    public static boolean esMayorDeEdad(int edad){
        return edad >= 18;
    }

  public static void main(String[] args) {
    // llamar metodo saludar
    saludar("Stiver");
    saludar("Java");

    //llamar al metodo sumar
    int resultado = sumar(15,27);
    System.out.println("15 + 27 = " + resultado);

    //llamar al metodo
    System.out.println("El 8 es " + parOImpar(8));
    System.out.println("El 13 es " + parOImpar(13));

    // Llamar al método mayor
    System.out.println("El mayor entre 44 y 71 es: " + mayor(44, 71));

    //llamar al areaRectangulo y mayor o no
    System.out.println("Area: " + areaRectangulo(5.0, 3.0));
    System.out.println("¿Mayor de edad? " + esMayorDeEdad(20));
    System.out.println("¿Mayor de edad? " + esMayorDeEdad(15));
  }
}
