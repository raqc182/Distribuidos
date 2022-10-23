class Ejercicio15 implements Runnable {     // Implementamos Runnable

    private int n = 0;              // Numero de iteraciones
    private int var_compartida = 0; // Seccion critica

    Ejercicio15(int n, int var_compartida) {    // Constructor de la clase
        this.n = n;
        this.var_compartida = var_compartida;
    }

    // Metodo run, en este caso, la seccion critica
    @Override
    public void run() {
        if(Thread.currentThread().getName() == "Hilo 1"){       // Si es el hilo 1 entonces incrementa
            for(int i = 0; i <= n; i++) {
                var_compartida++;
            }
        }else if(Thread.currentThread().getName() == "Hilo 2"){ // Si es el hilo 2 entonces decrementa
            for(int i = n; i >= 0; i--){
                var_compartida--;
            }
        }
        System.out.println(var_compartida); // Imprimimos el valor final de la variable compartida
    }

    public static void main(String[] args) throws InterruptedException {
        int aux = Integer.parseInt(args[0]);   // Recibimos el parametro de iteraciones 
        
        Runnable iteracion = new Ejercicio15(aux, 0);    // Inicializamos un objeto Ejercicio15 con caracteristica Runnable
        
        Thread hilo1 = new Thread(iteracion, "Hilo 1");    // Inicializamos un hilo con el valor de iteraciones
        Thread hilo2 = new Thread(iteracion, "Hilo 2");

        hilo1.start();  // Iniciamos los hilos
        hilo2.start();

        hilo1.join();   // Hasta que no finalice el primer hilo no ejecutaremos el segundo
    }
}