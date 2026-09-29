public class Vendedor extends Empleado {
    private double comision;

    public Vendedor(String nombre, double sueldoBase, double comision) {
        super(nombre, sueldoBase);
        this.comision = comision;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + comision;
    }
}
