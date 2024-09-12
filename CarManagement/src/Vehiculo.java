/*
 * Vehicle class that contains the attributes of a vehicle object and its constructor method.
 */
public class Vehiculo {
    
    //Brand of the vehicle
    String marca;
    //Model of the vehicle
    String modelo;
    //Date of the vehicle fabrication
    String ano;
    //Mileage of the vehicle
    int kilometraje;
    //Current state of the vehicle
    String estadoActual;
    //Fuel type of the vehicle
    String tipoGasolina;

    /*
     * Constructor method of the Vehicle class.
     */
    public Vehiculo(String marca, String modelo, String año, int kilometraje, String estadoActual, String tipoGasolina) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.kilometraje = kilometraje;
        this.estadoActual = estadoActual;
        setTipoCombustible(tipoGasolina);
    }

    /*
     * Method that returns the brand of the vehicle.
     */
    public String getMarca() {
        return marca;
    }

    /*
     * Method that returns the model of the vehicle.
     */
    public String getModelo() {
        return modelo;
    }

    /*
     * Method that returns the date of the vehicle fabrication.
     */
    public String getAno() {
        return ano;
    }

    /*
     * Method that returns the mileage of the vehicle.
     */
    public int getKilometraje() {
        return kilometraje;
    }

    /*
     * Method that returns the current state of the vehicle.
     */
    public String getEstadoActual() {
        return estadoActual;
    }

    /*
     * Method that returns the fuel type of the vehicle.
     */
    public String getTipoGasolina() {
        return tipoGasolina;
    }

    /*
     * Method that sets the brand of the vehicle.
     */
    public void setMarca(String brand) {
        this.marca = brand;
    }

    /*
     * Method that sets the model of the vehicle.
     */
    public void setModelo(String model) {
        this.modelo = model;
    }

    /*
     * Method that sets the date of the vehicle fabrication.
     */
    public void setAno(String date) {
        this.ano = date;
    }

    /*
     * Method that sets the mileage of the vehicle.
     */
    public void setKilometraje(int mileage) {
        this.kilometraje = mileage;
    }

    /*
     * Method that sets the current state of the vehicle.
     */
    public void setEstadoActual(String currentState) {
        this.estadoActual = currentState;
    }

    /*
     * Method that sets the fuel type of the vehicle.
     */
    public void setTipoGasolina(String fuelType) {
        this.tipoGasolina = fuelType;
    }

    public void setTipoCombustible(String tipoCombustible) {
        if (tipoCombustible.equals("Gasolina") || tipoCombustible.equals("Diesel") || tipoCombustible.equals("Eléctrico")) {
            this.fuelType = tipoCombustible;
        } else {
            System.out.println("Tipo de combustible no válido.");
        }
    }
}
