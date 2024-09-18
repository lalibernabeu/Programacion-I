public class SumaPares {
    public static void main(String[] args) {
        int suma = 0;

        // Iteramos del 1 al 100
        for (int i = 1; i <= 100; i++) {
            // Comprobamos si el número es par
            if (i % 2 == 0) {
                suma += i; // Sumamos el número par a la suma total
            }
        }

        // Mostramos el resultado
        System.out.println("La suma de todos los números pares entre 1 y 100 es: " + suma);
    }
}

