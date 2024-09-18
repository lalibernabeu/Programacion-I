import java.util.Scanner;

public class ContadorVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena de texto: ");
        String texto = scanner.nextLine();
        
        int contadorVocales = 0;
        texto = texto.toLowerCase();
        for (char c : texto.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            }
        }
        System.out.println("El número de vocales en la cadena es: " + contadorVocales);
    }
}

