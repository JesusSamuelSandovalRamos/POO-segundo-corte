import java.util.Scanner;
class Palindromo {
    private static String aux;
    private String palabra;

    /**
     * @return the palabra
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * @param palabra the palabra to set
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

   public String cambiarpalabra(){
       String palabracambiada = ""; 
       int longitud = palabra.length();
       while(longitud>0){
        palabracambiada += palabra.charAt(longitud-1); 
        longitud --;
       } 
       return palabracambiada;
   } 
   public void evaluarPalabras(String palabra2){
       if(palabra.equalsIgnoreCase(palabra2)){
        System.out.println("es un palindromo");
       }else{
           System.out.println("no es palindromo");
       } 

   }
   public static void main(String[] args) {
    Palindromo p = new Palindromo();
    Scanner scanner = new Scanner(System.in); 

    int opc = 0;
    while(opc !=3){
        System.out.println("-------Palindromos--------\n 1 pedir palabra"+ 
                                                    "\n 2 evaluar palabra"+ 
                                                    "\n 3 salir "); 

        opc = scanner.nextInt(); 

        switch (opc) {
            case 1:
            System.out.println("introduce la palabra");
                String string = aux = scanner.next();
                
                break; 
            case 2:
                p.setPalabra(aux);
                System.out.println(aux);
                 String cambiada = p.cambiarpalabra(); 
                 p.evaluarPalabras(cambiada);
                break;
            default:
                System.out.println("hey tu lee tu menu perro!");
                break;
        }
    }
    System.out.println("introduce la palabra");
    String aux = scanner.next();
    
    p.setPalabra(aux);

    String cambiada = p.cambiarpalabra(); 
    p.evaluarPalabras(cambiada);
}
}