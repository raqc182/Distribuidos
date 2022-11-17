/* 
 *      PROYECTO 2 Segunda parte 
 * 
 *      Quintana Camacho Ruben Abiasaf  -  4CM16
 * 
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class Parte2 {

    static boolean checkPalindromo(String word){    // Recibimos la palabra formada
        int n = word.length();
        
        //Reemplazamos los acentos
        word = word.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");

        //Comparamos si la palabra es la misma de "izq-der" que de "der-izq"
        for(int i = 0; i < n; i++, n--){    
            if(word.charAt(i) != word.charAt(n-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        
        String archivo = args[0];   // Nombre del archivo
        ArrayList<String> palindromos = new ArrayList<>();  // Lista de palindromos encontrados

        // Abrimos y leemos el archivo
        File file = new File(archivo);
        BufferedReader br = new BufferedReader(new FileReader(file));

        String linea;   // Guarda cada linea del archivo
        String palabra = "";    // Construccion de la palabra

        int contador = 0;   // Conteo de veces que aparece un palindromo

        try{
            while((linea = br.readLine()) != null){   // Leeemos cada linea del archivo
                for(int i = 0; i < linea.length(); i++){   // Avanzamos en cada caracter
                    char caracter = linea.charAt(i);    
                    if(caracter != ' '){    // Mientras no haya espacio seguimos construyendo la palabra
                        palabra = palabra + caracter;
                    }else{      // Si hay espacio ya formamos la palabra y analizamos
                        if(checkPalindromo(palabra)){   // Si la palabra es palindromo la contamos
                            contador++;
                            if(!palindromos.contains(palabra)){ // Verificamos si la palabra ya la contemplamos
                                palindromos.add(palabra);
                            }
                        }
                        palabra = ""; // Si no es palindromo empezamos de nuevo
                    }
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println("Total palindromos: " + contador);   // Imprimimos el numero de palindromos del archivo
        System.out.println("Lista de plindromos: " + palindromos);    // Imprimimos los palindromos
    }
}
