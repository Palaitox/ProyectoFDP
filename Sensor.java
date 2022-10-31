public class Sensor {

    private String tipo;
    private double valor;

    Sensor sensores[] = new Sensor[8];
    int tamano = 8;
    int posAnadir = 0;

    public Sensor() {}

    public Sensor(String ti, double va) {
        this.tipo = ti;
        this.valor = va;
    }

    public String getTipo() {
        return this.tipo;
    }

    public double getValor() {
        return this.valor;
    }

    public void setTipo(String ti) {
        this.tipo = ti;
    }

    public void setValor(double va) {
        this.valor = va;
    }

    public String toString(){
        return "Tipo: " + this.tipo + " Valor: " + this.valor + "\n";
    }

    public void anadirSensor(Sensor s) {
        if (posAnadir < tamano) {
            sensores[posAnadir] = s;
            posAnadir++;
        }else{
            System.out.println("No hay espacio para mas sensores");
        }
    }

    public String toStringSensores(){
        String r = "";
        for(int i = 0; i < posAnadir; i++){
            r += sensores[i].toString();
        }
        return r;
    }

    public int cantidadSensores(){
        return posAnadir;
    }

    public String toStringSensoresTemperatura(){
        String r = "";
        for(int i = 0; i < posAnadir; i++){
            if(sensores[i].getTipo().equals("Temperatura") || sensores[i].getTipo().equals("temperatura")){
                r += sensores[i].toString();
            }
        }
        return r;
    }

    public String newArraySensoresTemperaturaOrdenados(){
        String r = "";
        Sensor sensoresTemperatura[] = new Sensor[8];
        int posAnadirSensoresTemperatura = 0;
        for(int i = 0; i < posAnadir; i++){
            if(sensores[i].getTipo().equals("Temperatura") || sensores[i].getTipo().equals("temperatura")){
                sensoresTemperatura[posAnadirSensoresTemperatura] = sensores[i];
                posAnadirSensoresTemperatura++;
            }
        }
        for(int i = 0; i < posAnadirSensoresTemperatura; i++){
            for(int j = 0; j < posAnadirSensoresTemperatura - 1; j++){
                if(sensoresTemperatura[j].getValor() > sensoresTemperatura[j + 1].getValor()){
                    Sensor aux = sensoresTemperatura[j];
                    sensoresTemperatura[j] = sensoresTemperatura[j + 1];
                    sensoresTemperatura[j + 1] = aux;
                }
            }
        }
        for(int i = 0; i < posAnadirSensoresTemperatura; i++){
            r += sensoresTemperatura[i].toString();
        }
        return r;
    }
}

