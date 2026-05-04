package Retos_java.python;

public class Reto2 {
    public static void main(String[] args) {
        // Condicionales
        int calificacion = 88;
        
        if (calificacion >= 90) {
            System.out.println("Calificacion: A  Excelente");
        } else if (calificacion >= 80) {
            System.out.println("Calificacion: B Bien");
        } else if (calificacion >= 70) {
            System.out.println("Calificacion: C Regular");
        } else {
            System.out.println("Calificacion: F Reprobado");
        }

        // bucle for
        System.out.println("\nTabla del 3: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("3 x " + i + " = " + (3 * i));
        }

        System.out.println("\nTabla del 7: ");
        for (int i = 1; i <= 10; i++){
            System.out.println("7 x " + i + " = " + (7 * i));
        }

        // bucle while
        System.out.println("\nContando regresiva");
        int cuenta = 5;
        while (cuenta >= 1) {
            System.out.println(cuenta + "...");
            cuenta --;
        }

        //Suma while
        System.out.println("\nSuma de numeros");
        int numero = 1;
        int suma = 0;
        while (numero <= 10) {
            suma = suma + numero;
            numero ++;
        }
        System.out.println("Suma del 1 al 10: " + suma);

        System.out.println("Despegue!!");
    }
}
