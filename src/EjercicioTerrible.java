import java.util.Scanner;

public class EjercicioTerrible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del primer estudiante: ");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el nombre del segundo estudiante: ");
        String nombre2= scanner.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el nombre del tercer estudiante: ");
        String nombre3 = scanner.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad3 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el nombre del cuarto estudiante: ");
        String nombre4 = scanner.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad4 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el nombre del quinto estudiante: ");
        String nombre5 = scanner.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad5 = scanner.nextInt();
        scanner.nextLine();

        double promedio = (double)(edad1 + edad2 + edad3 + edad4+ edad5) / 5;

        System.out.println("Edad promedio de los estudiantes: " + promedio);

        if (edad1 > 17) {
            System.out.println(nombre1 + " es mayor de edad. ");
        } else {
            System.out.println(nombre1 + " es menor de edad. ");
        }

        if (edad2 > 17) {
            System.out.println(nombre2 + " es mayor de edad. ");
        } else {
            System.out.println(nombre2 + " es menor de edad. ");
        }

        if (edad3 > 17) {
            System.out.println(nombre3 + " es mayor de edad. ");
        } else {
            System.out.println(nombre3 + " es menor de edad. ");
        }

        if (edad4 > 17) {
            System.out.println(nombre4 + " es mayor de edad. ");
        } else {
            System.out.println(nombre4 + " es menor de edad. ");
        }

        if (edad5 > 17) {
            System.out.println(nombre5 + " es mayor de edad. ");
        } else {
            System.out.println(nombre5 + " es menor de edad. ");
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
