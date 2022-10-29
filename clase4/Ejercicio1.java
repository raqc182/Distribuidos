// Se ha elaborado el siguiente programa para convertir grados centígrados a Fahrenheit.
// Determine cual es el error y corríjalo mediante un cast para que dé el valor correcto.

class Ejercicio1 {
    public static void main(String[] args) {
        double c = 20;
        double f = 0;

        // Casteo
        f = ((double)9/5) * c + 32;

        System.out.println(f);
    }
}
