import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        System.out.println("");
        Principal p = new Principal();
        p.mostrarMenu();
    }

    public void mostrarMenu(){
        Scanner sc = new Scanner(System.in);
        Vehiculo v = new Vehiculo();
        Sensor s = new Sensor();
        while(1>0){
            System.out.println("El menu es: ");
            System.out.println("");
            System.out.println("0. Finalizar programa");
            System.out.println("1. Ingresar vehiculo");
            System.out.println("2. Mostrar vehiculos");
            System.out.println("3. Cantidad de vehiculos");
            System.out.println("4. Mostrar vehiculos de color verde");
            System.out.println("5. Mostrar informacion vehiculos entre 2000 y 2021");
            System.out.println("6. Ingresar sensor");
            System.out.println("7. Mostrar sensores");
            System.out.println("8. Cantidad de sensores");
            System.out.println("9. Mostrar sensores de tipo temperatura");
            System.out.println("666. Mostrar sensores ordenados por valor de tipo temperatura");
            System.out.println("");
            System.out.println("Ingrese un numero: ");
            int opcion = sc.nextInt();
            switch(opcion){
                case 0:
                    System.out.println("Finalizando programa...");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Ingrese el modelo del vehiculo: ");
                    int modelo = sc.nextInt();
                    System.out.println("Ingrese la marca del vehiculo: ");
                    String marca = sc.next();
                    System.out.println("Ingrese el valor comercial del vehiculo: ");
                    double valorComercial = sc.nextDouble();
                    System.out.println("Ingrese el color del vehiculo: ");
                    String color = sc.next();
                    v.anadirVehiculo(new Vehiculo(modelo, marca, valorComercial, color));
                    break;
                case 2:
                    System.out.println(v.toStringVehiculos());
                    break;
                case 3:
                    System.out.println("Cantidad de vehiculos: " + v.cantidadVehiculos());
                    break;
                case 4:
                    System.out.println(v.toStringVehiculosVerdes());
                    break;
                case 5:
                    System.out.println(v.toStringVehiculosEntre2000y2021());
                    break;
                case 6:
                    System.out.println("Ingrese el tipo del sensor: ");
                    String tipo = sc.next();
                    System.out.println("Ingrese el valor del sensor: ");
                    double valor = sc.nextDouble();
                    s.anadirSensor(new Sensor(tipo, valor));
                    break;
                case 7:
                    System.out.println(s.toStringSensores());
                    break;
                case 8:
                    System.out.println("Cantidad de sensores: " + s.cantidadSensores());
                    break;
                case 9:
                    System.out.println(s.toStringSensoresTemperatura());
                    break;
                case 666:
                    System.out.println(s.newArraySensoresTemperaturaOrdenados());
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}