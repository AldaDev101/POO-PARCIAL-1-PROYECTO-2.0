public class Gerente extends Empleado {
    private double bonoFijo;

    public Gerente(String nombre, double sueldoBase, double bonoFijo) {
        super(nombre, sueldoBase);
        this.bonoFijo = bonoFijo;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + bonoFijo;
    }
}
