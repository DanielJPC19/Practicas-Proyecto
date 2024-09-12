public class Vehiculo {
    public String marca;
    public String modelo;
    public int ano;
    public int kilometraje;
    public String estadoActual;
    public String tipoCombustible;

    public Vehiculo(String marca, String modelo, int ano, int kilometraje, String estadoActual, String tipoCombustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.kilometraje = kilometraje;
        this.estadoActual = estadoActual;
        setTipoCombustible(tipoCombustible);
    }

    public void setTipoCombustible(String tipoCombustible) {
        if (tipoCombustible.equals("Gasolina") || tipoCombustible.equals("Diesel") || tipoCombustible.equals("Eléctrico")) {
            this.tipoCombustible = tipoCombustible;
        } else {
            System.out.println("Tipo de combustible no válido.");
        }
    }
}
