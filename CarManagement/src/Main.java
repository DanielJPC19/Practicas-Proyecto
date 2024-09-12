
import java.util.ArrayList;

public class Main {
    // Lista de vehículos
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    // Método para agregar un vehículo a la lista
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    // Método para buscar vehículos por año y comparar
    public ArrayList<Vehiculo> buscarVehiculoPorAno(String ano, boolean mayor) {
        ArrayList<Vehiculo> resultados = new ArrayList<>();
        int anoFiltro = Integer.parseInt(ano);

        for (Vehiculo v : vehiculos) {
            int anoVehiculo = Integer.parseInt(v.getAno());

            if (mayor && anoVehiculo>anoFiltro) {
                resultados.add(v);
                
            } else if (!mayor && anoVehiculo < anoFiltro) {
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
        gestionVehiculos.agregarVehiculo(new Vehiculo("Toyota", "Corolla", "2015", 50000, "Bueno", "Gasolina"));
        gestionVehiculos.agregarVehiculo(new Vehiculo("Ford", "Focus", "2018", 30000, "Excelente", "Diesel"));
        gestionVehiculos.agregarVehiculo(new Vehiculo("Honda", "Civic", "2012", 60000, "Regular", "Gasolina"));

        // Buscar vehículos por año mayor a 2015
        ArrayList<Vehiculo> vehiculosMayores2015 = gestionVehiculos.buscarVehiculoPorAno("2015", true);
        System.out.println("Vehículos con año mayor a 2015:");
        for (Vehiculo v : vehiculosMayores2015) {
            System.out.println(v.getMarca() + " " + v.getModelo());
        }

        // Buscar vehículos por año menor a 2015
        ArrayList<Vehiculo> vehiculosMenores2015 = gestionVehiculos.buscarVehiculoPorAno("2015", false);
        System.out.println("Vehículos con año menor a 2015:");
        for (Vehiculo v : vehiculosMenores2015) {
            System.out.println(v.getMarca() + " " + v.getModelo());
        }

    }
}