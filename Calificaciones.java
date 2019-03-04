import java.util.Scanner;
class Calificaciones{
   private double Promedio;
    private double numcalificaciones;
    /**
     * @return the promedio
     */
    public double getPromedio() {
        return Promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(double promedio) {
        Promedio = promedio;
    }  

    /**
     * @return the numCalificaciones
     */
    public double getNumCalificaciones() {
        return numcalificaciones;
    }

    /**
     * @param numCalificaciones the numCalificaciones to set
     */
    public void setNumCalificaciones(double numCalificaciones) {
        this.numcalificaciones = numCalificaciones;
    } 

    public void calcularPromedio(double sumaria){
       Promedio = sumaria / numcalificaciones;
    } 
    public static void main(String[] args) {
        Calificaciones c = new Calificaciones();
    
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("cuantas calificaciones vas  a presentar");
    
        int n = scanner.nextInt();
    
        c.setNumCalificaciones(n);
        double sumatoria = 0;
        for(int i=0; i <= c.getNumCalificaciones() ; i++ );{
            int i;

            System.out.println("ingresa la calificacion" + (i + 1));
            double aux = scanner.nextDouble();
            sumatoria = sumatoria + aux;
        } 
        c.calcularPromedio(sumatoria);
    
        System.out.println("promedio es"+ c.getPromedio());
    }

} 

