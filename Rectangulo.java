class Rectangulo{
    //atributos
    double largo;
    double alto;
    //constructor SOBRCARGA
    Rectangulo(){}
    Rectangulo(double alto){}
    Rectangulo(int largo){}
    Rectangulo(double alto , double largo){
        this.alto = alto;
        this.largo = largo;
    }
    //metodos
    
    /**
     * @return the largo
     */
    public double getLargo() {
        return largo;
    }

    /**
     * @param largo the largo to set
     */
    public void setLargo(double largo) {
        this.largo = largo;
    }

    /**
     * @return the alto
     */
    public double getAlto() {
        return alto;
    }

    /**
     * @param alto the alto to set
     */
    public void setAlto(double alto) {
        this.alto = alto;
    }
    public double calcularArea(){
        return largo * alto;
    }
    public static void main(String[] args) {
        Rectangulo rec1 = new Rectangulo(10,20);

        rec1.setAlto(10);
        rec1.setLargo(20);

        System.out.println("el area es "+rec1.calcularArea());
    }
}