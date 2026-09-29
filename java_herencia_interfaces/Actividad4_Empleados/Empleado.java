public abstract class Empleado {
    protected String nombre;
    protected double sueldoBase;

    public Empleado(String nombre, double sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public abstract double calcularSueldo();

    public String getNombre() {
        return nombre;
    }
}
