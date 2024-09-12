
import java.util.ArrayList;

public class Main {
    // Lista de vehículos
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    // Método para agregar un vehículo a la lista
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    // Método para buscar vehículos por año
    public ArrayList<Vehiculo> buscarVehiculoPorAno(String ano1, String ano2) {
        ArrayList<Vehiculo> resultados = new ArrayList<>();
        for (Vehiculo v : vehiculos) {
            if (v.getAno().compareTo(ano1) >= 0 && v.getAno().compareTo(ano2) <= 0) {
                resultados.add(v);
            }
        }
        return resultados;
    }

    public void imprimirVehiculos() {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }

    public static void main(String[] args) {
        Main gestionVehiculos = new Main();

        // Agregar vehículos
        gestionVehiculos.agregarVehiculo(new Vehiculo("Toyota", "Corolla", "2015", 50000, "Bueno", "Gasolina",1600,"Amarillo"));
        gestionVehiculos.agregarVehiculo(new Vehiculo("Chevrolet", "Spark", "2016", 20000, "Excelente", "Gasolina",1200,"Azul"));
        gestionVehiculos.agregarVehiculo(new Vehiculo("Ford", "Focus", "2018", 30000, "Excelente", "Diesel",900,"Rojo"));

        // Buscar vehículos por año
        ArrayList<Vehiculo> vehiculos2015 = gestionVehiculos.buscarVehiculoPorAno("2015", "2020");
        System.out.println("Vehículos entre el 2015 y 2020:");
        for (Vehiculo v : vehiculos2015) {
            System.out.println(v.getMarca() + " " + v.getModelo());
        }

    }
}