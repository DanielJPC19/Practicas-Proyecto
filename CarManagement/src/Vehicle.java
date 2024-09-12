/*
 * Vehicle class that contains the attributes of a vehicle object and its constructor method.
 */
public class Vehicle {
    
    //Brand of the vehicle
    String brand;
    //Model of the vehicle
    String model;
    //Date of the vehicle fabrication
    String date;
    //Mileage of the vehicle
    int mileage;
    //Current state of the vehicle
    String currentState;
    //Fuel type of the vehicle
    String fuelType;

    /*
     * Constructor method of the Vehicle class.
     */
    public Vehicle(String brand, String model, String date, int mileage, String currentState, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.date = date;
        this.mileage = mileage;
        this.currentState = currentState;
        this.fuelType = fuelType;
    }

    /*
     * Method that returns the brand of the vehicle.
     */
    public String getBrand() {
        return brand;
    }

    /*
     * Method that returns the model of the vehicle.
     */
    public String getModel() {
        return model;
    }

    /*
     * Method that returns the date of the vehicle fabrication.
     */
    public String getDate() {
        return date;
    }

    /*
     * Method that returns the mileage of the vehicle.
     */
    public int getMileage() {
        return mileage;
    }

    /*
     * Method that returns the current state of the vehicle.
     */
    public String getCurrentState() {
        return currentState;
    }

    /*
     * Method that returns the fuel type of the vehicle.
     */
    public String getFuelType() {
        return fuelType;
    }

    /*
     * Method that sets the brand of the vehicle.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /*
     * Method that sets the model of the vehicle.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /*
     * Method that sets the date of the vehicle fabrication.
     */
    public void setDate(String date) {
        this.date = date;
    }

    /*
     * Method that sets the mileage of the vehicle.
     */
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    /*
     * Method that sets the current state of the vehicle.
     */
    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    /*
     * Method that sets the fuel type of the vehicle.
     */
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
