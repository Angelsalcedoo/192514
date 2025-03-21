import java.util.Scanner;

public class CalculadoraDeComparaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();
        System.out.println("ingrese el tercer numero: ");
        int numero3 = scanner.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El numero mas grande es: " + numero1); 
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El numero mas grande es: " + numero2);
        } else {
            System.out.println("l numero mas grande es:  " + numero3);
        }

        System.out.print("ingrese cuantas veces quiere repetir el mensaje: ");
        int repeticiones = scanner.nextInt();

        for (int i = 1; i <= repeticiones; i++) {
            System.out.println("Repeticion de numero" + i);
        }

        scanner.close();
    }
}

