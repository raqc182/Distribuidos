import java.util.Random;

class Ejercicio1 {
    public static void main(String[] args){
                
        int n=Integer.parseInt(args[0]);
        long inicio=System.nanoTime();
        StringBuilder sb=new StringBuilder();
        byte ck=0;
        int[] wrd=new int[n];
        int cont=0,p,i;
        Random rnd =new Random();

        for(i=0;i<n;i++){
            for(int j=0;j<3;j++){
                sb.append((char)(rnd.nextInt(26)+65));
            }
            sb.append((char)32);
        }

        p=sb.indexOf("IPN");

        while(p!=-1){
            wrd[cont]=p;
            cont++;
            p=sb.indexOf("IPN",p+1);
        }
        
        long fin=System.nanoTime();
        long nano=fin-inicio;
        System.out.println(nano);

        if(cont>0){
            System.out.println(cont);
            /*System.out.println("Se encontrola palabra IPN en la(s) posicion(es)");
            for(i=0;i<cont;i++){
                  System.out.print(" "+wrd[i]);
            }*/
        }
    }    
}
