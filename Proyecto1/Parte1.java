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
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Parte1 {

    public static String[] getFiles(String dir_path) {  // Metodo para obtener todos los nombres de los archivos por leer
        String[] arr_res = null;

        File f = new File(dir_path);

        if(f.isDirectory()){
            List<String> res = new ArrayList<>();
            File[] arr_content = f.listFiles();

            for (int i = 0; i < arr_content.length; i++) {
                if(arr_content[i].isFile()){
                    res.add(arr_content[i].toString()); // Una vez teniendo el nombre lo guardamos en un array
                }
            }
            arr_res = res.toArray(new String[0]);
        }else{
            System.err.println("¡Path no valido!");
        }
        return arr_res; // Retornamos los nombres de los archivos por leer
    }

    public static void main(String[] args) throws FileNotFoundException {   
        
        String path = "LIBROS_TXT/";   // Path principal donde se encuentran los libros
        HashSet<String> hs = new HashSet<String>();    // HashSet donde guardaremos todas las palabras bien escritas

        String[] archivos = getFiles(path);     // Obtenemos los nombres de los archivos en un array
        String cadena;
        StringBuilder sb = new StringBuilder(); // Para formar palabras, las iremos construyendo caracter a caracter

        if(archivos != null){     // Empezamos la lectura de archivos
            for(int i = 0; i < archivos.length; i++){   // Para cada archivo existente
                //System.out.println(archivos[i]); // Imprimir paths
                File file = new File(archivos[i]);
                BufferedReader br = new BufferedReader(new FileReader(file));   // Leemos archivo

                try{
                    while((cadena = br.readLine()) != null){        // Obtenermos las lineas del archivo
                        for(int j = 0; j < cadena.length(); j++){
                            char caracter = cadena.charAt(j);   // Leemos la linea caracter por caracter
                            if(caracter != ' '){
                                sb.append(caracter);    // Formamos la palabra mientras no haya espacio
                            }else{
                                String aux = sb.toString();

                                // Reemplazamos y eliminamos caracteres especiales para filtrar solo palabras
                                aux = aux.toLowerCase().replace(",", "").replace(".", "").replace("-", "").replace("?", "").replace("¿", "").replace("¡", "")
                                .replace("!", "").replace(":", "").replace(";", "").replace("(", "").replace(")", "").replace("á", "a").replace("é", "e")
                                .replace("í", "").replace("ó", "o").replace("ú", "u").replace("*", "");

                                // Verificamos si la palabra se encuentra en el HashSet
                                if(!hs.contains(aux)){  
                                    hs.add(aux);
                                }
                                sb.delete(0, sb.length());  // Ponemos en ceros la string que contruimos
                            }
                        }
                    }
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
        // System.out.println(hs);  // Imprimimos el HashSet

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la palabra que desea revisar: ");
        String word;
        
        while((word = sc.nextLine()) != ""){    // Leemos la entrada de datos
            if(hs.contains(word)){  // Si la palabra se encuentra en el Set entonces esta bien escrita
                System.out.println("La palabra " + "'" + word + "'"  + " esta bien escrita");
            }else{
                System.out.println("La palabra " + "'" + word + "'"  + " esta mal escrita");
            }
        }
    }
}
