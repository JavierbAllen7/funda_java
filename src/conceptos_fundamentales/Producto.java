package conceptos_fundamentales;

public class Producto {
    private String id;
    private String nombre;
    private double precio;

    // Constructor, getters and setters...

    @Override
    public String toString() {

        return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
    }
}
