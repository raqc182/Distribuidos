 // Elabore un programa (Fibonacci) que cree una serie sumando los tres términos anteriores. 
 // El programa deberá imprimir los primeros 20 términos de esta serie.

class Ejercicio4 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 0;
        while(n < 20){
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            n = n + 1;
        }
        System.out.println("");
    }
}
