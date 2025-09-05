import java.util.Scanner;

public class App {

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        System.out.println("1.- Es primo");
        System.out.println("2.- Suma de los primeros n numeros");
        System.out.println("3.- Tabla de multiplicar del numero");
        System.out.println("4.- Ingresar una frase y mostrar cantidad de caracteres");
        System.out.println("5.- Salir");
        opc = sc.nextInt();
        sc.close();
        return opc;
    }

    public static int sumaNumeros(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    public static void tablaMultiplicar(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + n + " = " + i * n);
        }

    }

    public static boolean esPrimo(int n) {
        int numeroDivisiones = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                numeroDivisiones++;
            }
        }

        return numeroDivisiones == 2? true : false;

        /*if (numeroDivisiones == 2) {
            return true;

        }

        else {
            return false;
        }*/
    }

    public static int cantidadLetras(String mensaje) {
        return mensaje.length();
    }

    public static void main(String[] args) {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        while (opcion != 5) {
            opcion = menu();
            switch (opcion) {
                case 1:
                    System.out.println("Digita un numero: ");
                    int numero = sc.nextInt();
                    if (esPrimo(numero)) {
                        System.out.println("Es Primo ");
                    } else {
                        System.out.println("No Primo ");
                    }
                    break;
                case 2:
                    System.out.println("Digita un numero: ");
                    int numeroSuma = sc.nextInt();
                    System.out.println("La suma es: " + sumaNumeros(numeroSuma));
                    break;
                case 3:
                    System.out.println("Digita un numero: ");
                    int numeroTabla = sc.nextInt();
                    tablaMultiplicar(numeroTabla);
                    break;
                case 4:
                    System.out.println("Insertar frase: ");
                    String frase = sc.next();
                    System.out.println("La cantidad de caracteres es: " + cantidadLetras(frase));
                    break;
            }
        }
        sc.close();
        System.out.println("Auf Wiedersehen");
    }
}
