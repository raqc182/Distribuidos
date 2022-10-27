import java.util.*;
import java.io.*;

class Ejercicio1 {
    public static void main(String[] args) throws FileNotFoundException {
        Map<Character, Integer> hm = new HashMap<Character, Integer>(); // Hashmap donde guardaremos los caracteres y su conteo
 
        // Definimos los objetos para abrir y leer archivo
        File file = new File("El_viejo_y_el_mar.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        String cadena; // Variable donde se guardara cada linea del archivo

        try{
            while((cadena = br.readLine()) != null){    // Leemos linea y seguimos si el archivo no se termina de leer
                for(int i = 0; i < cadena.length(); i++){
                    char caracter = cadena.charAt(i); // Iteramos cada caracter y lo guardamos en una var aux
                    if(!hm.containsKey(caracter)){  // Si el caracter no se encuentra en el HashMap lo guardamos y empieza el conteo
                        hm.put(caracter, 1);
                    }else{  // Si el caracter ya se encuentra en el HashMap, sumamos una aparicion mas
                        hm.put(caracter, hm.get(caracter) + 1);
                    }
                }

            }
        }catch(IOException e){
            e.printStackTrace();
        }

        for(Map.Entry<Character, Integer> me: hm.entrySet()){ // Imprimimos cada llave (caracter) y valor (apariciones) del HashMap
            System.out.println(me.getKey() + ":" + me.getValue());
        }

    }
}
