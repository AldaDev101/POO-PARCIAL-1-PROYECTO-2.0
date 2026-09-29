public class Main {
    public static void main(String[] args) {
        FiguraGeometrica circulo = new Circulo(5);
        FiguraGeometrica cuadrado = new Cuadrado(4);

        System.out.printf("Área del círculo: %.2f%n", circulo.calcularArea());
        System.out.printf("Área del cuadrado: %.2f%n", cuadrado.calcularArea());
    }
}
