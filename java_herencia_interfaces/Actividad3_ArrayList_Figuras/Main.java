import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();

        figuras.add(new Circulo(3));
        figuras.add(new Cuadrado(4));
        figuras.add(new Triangulo(6, 5));
        figuras.add(new Rectangulo(7, 3));
        figuras.add(new Trapecio(8, 5, 4));

        double sumaAreas = 0;

        for (FiguraGeometrica figura : figuras) {
            sumaAreas += figura.calcularArea();
        }

        System.out.printf("Número de figuras: %d%n", figuras.size());
        System.out.printf("Suma total de áreas: %.2f%n", sumaAreas);
    }
}
