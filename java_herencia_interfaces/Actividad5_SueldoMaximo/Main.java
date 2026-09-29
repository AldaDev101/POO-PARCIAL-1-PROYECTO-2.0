import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new Vendedor("Ana", 8000, 2500));
        empleados.add(new Gerente("Luis", 12000, 4000));
        empleados.add(new Vendedor("Sofía", 8500, 1800));
        empleados.add(new Gerente("Carlos", 11000, 3500));

        Empleado empleadoMayorSueldo = empleados.get(0);

        for (Empleado empleado : empleados) {
            if (empleado.calcularSueldo() > empleadoMayorSueldo.calcularSueldo()) {
                empleadoMayorSueldo = empleado;
            }
        }

        System.out.printf("Empleado con sueldo más alto: %s%n", empleadoMayorSueldo.getNombre());
        System.out.printf("Sueldo: $%.2f%n", empleadoMayorSueldo.calcularSueldo());
    }
}
