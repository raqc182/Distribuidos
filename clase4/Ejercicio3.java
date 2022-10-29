// Escriba un programa que cuente del 1 al 15, imprima cada 
// número y luego cuente hacia atrás de dos en dos hasta el 1, imprimiendo nuevamente cada número.

class Ejercicio3 {
    public static void main(String[] args) {
        int n = 0;
        boolean aux = true;
        boolean fin = false;
        while(aux == true){
            if(fin == false){ //Hace el conteo 0-15
                n = n + 1;
                System.out.println(n);
                if(n == 15){    //Llega a 15 y desciende
                    System.out.print("\n");
                    fin = true;
                }
            }
            if(fin == true) {   
                if(n == 1){ //Si llega a 1 acabo el proceso
                    aux = false;
                }
                System.out.println(n);
                n = n - 2;  //Decrementa de dos en dos
            }
        }
    }
}
