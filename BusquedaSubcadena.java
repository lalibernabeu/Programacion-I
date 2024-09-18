import java.util.Scanner;

public class BusquedaSubcadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cadena de texto: ");
        String texto = scanner.nextLine();

        System.out.print("Introduce la subcadena a buscar: ");
        String subcadena = scanner.nextLine();

        // Buscamos la subcadena en la cadena de texto
        boolean encontrado = false;

        for (int i = 0; i <= texto.length() - subcadena.length(); i++) {
            // Comparamos la subcadena con el fragmento de la cadena original
            if (texto.substring(i, i + subcadena.length()).equals(subcadena)) {
                encontrado = true;
                break;
            }
        }

        // Mostramos el resultado
        if (encontrado) {
            System.out.println("La subcadena \"" + subcadena + "\" fue encontrada en la cadena.");
        } else {
            System.out.println("La subcadena \"" + subcadena + "\" no fue encontrada en la cadena.");
        }
    }
}
