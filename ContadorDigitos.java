import java.util.Scanner;

public class ContadorDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        String numero = scanner.nextLine();

        numero = numero.trim();
        if (numero.startsWith("-")) {
            numero = numero.substring(1);
        }

       
        int contadorDigitos = numero.length();

        System.out.println("El número de dígitos es: " + contadorDigitos);
    }
}
