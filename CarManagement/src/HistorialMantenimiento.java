public class HistorialMantenimiento {
    private String fecha;
    private String descripcionServicio;
    private int kilometrajeEnServicio;
    private double costo;
    private String nombreMecanico;


    public HistorialMantenimiento(String fecha, String descripcionServicio, int kilometrajeEnServicio, double costo, String nombreMecanico) {
        this.fecha = fecha;
        this.descripcionServicio = descripcionServicio;
        this.kilometrajeEnServicio = kilometrajeEnServicio;
        this.costo = costo;
        this.nombreMecanico = nombreMecanico;
    }

    
    public String getFecha() {
        return fecha;
    }

    public String getDescripcionServicio() {
        return descripcionServicio;
    }

    public int getKilometrajeEnServicio() {
        return kilometrajeEnServicio;
    }

    public double getCosto() {
        return costo;
    }

    public String getNombreMecanico() {
        return nombreMecanico;
    }

   
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setDescripcionServicio(String descripcionServicio) {
        this.descripcionServicio = descripcionServicio;
    }

    public void setKilometrajeEnServicio(int kilometrajeEnServicio) {
        this.kilometrajeEnServicio = kilometrajeEnServicio;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setNombreMecanico(String nombreMecanico) {
        this.nombreMecanico = nombreMecanico;
    }
}
