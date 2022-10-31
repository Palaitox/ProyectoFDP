public class Vehiculo {

    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;

    Vehiculo vehiculos[] = new Vehiculo[10];
    int tamano = 10;
    int posAnadir = 0;

    public Vehiculo() {}

    public Vehiculo(int mo, String ma, double va, String co) {
        this.modelo = mo;
        this.marca = ma;
        this.color = co;
        this.valorComercial = va;
    }

    public Vehiculo(int mo, String ma, double va) {
        this(mo, ma, va, "Verde");
    }

    public int getModelo() {
        return this.modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public double getValorComercial() {
        return this.valorComercial;
    }

    public String getColor() {
        return this.color;
    }

    public void setModelo(int mo) {
        this.modelo = mo;
    }

    public void setMarca(String ma) {
        this.marca = ma;
    }

    public void setValorComercial(double va) {
        this.valorComercial = va;
    }

    public void setColor(String co) {
        this.color = co;
    }

    public String toString(){
        return "Modelo: " + this.modelo + " Marca: " + this.marca + " Valor Comercial: " + this.valorComercial + " Color: " + this.color + "\n";
    }

    public void anadirVehiculo(Vehiculo v){
        if(posAnadir < tamano){
            vehiculos[posAnadir] = v;
            posAnadir++;
        }else{
            System.out.println("No hay espacio para mas vehiculos");
        }
    }

    public String toStringVehiculos(){
        String s = "";
        for(int i = 0; i < posAnadir; i++){
            s += vehiculos[i].toString();
        }
        return s;
    }

    public int cantidadVehiculos(){
        return posAnadir;
    }

    public String toStringVehiculosVerdes(){
        String s = "";
        for(int i = 0; i < posAnadir; i++){
            if(vehiculos[i].getColor().equals("Verde") || vehiculos[i].getColor().equals("verde")){
                s += vehiculos[i].toString();
            }
        }
        return s;
    }

    public String toStringVehiculosEntre2000y2021(){
        String s = "";
        for(int i = 0; i < posAnadir; i++){
            if(vehiculos[i].getModelo() >= 2000 && vehiculos[i].getModelo() <= 2021){
                s += vehiculos[i].toString();
            }
        }
        return s;
    }
}