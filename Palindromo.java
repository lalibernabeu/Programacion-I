import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = scanner.nextLine();

        palabra = palabra.replaceAll("\\s+", "").toLowerCase();

        boolean esPalindromo = true;
        int longitud = palabra.length();

        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }


        if (esPalindromo) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }
    }
}
