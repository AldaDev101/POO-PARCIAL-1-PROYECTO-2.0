import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new Vendedor("Ana", 8000, 2500));
        empleados.add(new Gerente("Luis", 12000, 4000));
        empleados.add(new Vendedor("Sofía", 8500, 1800));

        for (Empleado empleado : empleados) {
            System.out.printf("%s - Sueldo: $%.2f%n", empleado.getNombre(), empleado.calcularSueldo());
        }
    }
}
