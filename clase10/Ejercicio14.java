import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio14 {
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);
        ArrayList<String> lista = new ArrayList<String>();
        ArrayList<String> listaOrdenada = new ArrayList<String>();

        for(int i = 0; i < n; i++) {    // Generamos n CURPS y los almacenamos
            lista.add(getCurp());
        }

        Iterator<String> itr = lista.iterator();    // Declaramos el iterador

        System.out.println(lista);
        int count=0;

        while(itr.hasNext()){
            //StringBuilder aux = new StringBuilder(3); 
            String crp = itr.next();

            if(!listaOrdenada.isEmpty()) {
                listaOrdenada.add(crp);
            }
            
            String aux = listaOrdenada.get(count);

            if(crp.compareTo(aux) < 0){ /*.substring(0, 3).compareTo(aux)*/
                listaOrdenada.set(count, crp);
                count++;

            }else if(crp.compareTo(aux) > 0) {
                listaOrdenada.set(count, aux);
                count++;
                
            }else{
                listaOrdenada.add(crp);
            }
        }

        System.out.println(listaOrdenada);
    }

    static String getCurp() {
        
        String letra = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numero = "0123456789";
        String sexo = "HM";
        String entidad[] = {"AS", "BC", "BS", "CC", "CS", "CH", "CL", "CM", "DF", "DG", 
        "GT", "GR", "HG", "JC", "MC", "MN", "MS", "NT", "NL", "OC", "PL", "QT", "QR", "SP", "SL", "SR", "TC", "TL", "TS", "VZ", "YN", "ZS"};
        int indice;

        StringBuilder sb = new StringBuilder(18);

        for(int i = 1; i < 5; i++){ // Agregamos formato de nombre, 4 primeros datos del CURP
            indice = (int)(letra.length()*Math.random());
            sb.append(letra.charAt(indice));
        }

        for(int i = 5; i < 11; i++) { // Agregamos formato de fecha de nacimiento, siguientes 6 datos del CURP
            indice = (int)(numero.length()*Math.random());
            sb.append(numero.charAt(indice));
        }

        indice = (int)(sexo.length()*Math.random()); // Agregamos formato de sexo
        sb.append(sexo.charAt(indice));

        sb.append(entidad[(int)(Math.random()*32)]); // AAgregamos entidad federativa

        for(int i = 14; i < 17; i++) {
            indice = (int)(letra.length()*Math.random());
            sb.append(letra.charAt(indice));
        }

        for (int i = 17; i < 19; i++) {
            indice = (int)(numero.length()*Math.random());
            sb.append(numero.charAt(indice));
        }

        return sb.toString();
    }
}
