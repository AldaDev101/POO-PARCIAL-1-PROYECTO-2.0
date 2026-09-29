import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Pajaro("Piolín", 2));
        animales.add(new Perro("Firulais", 3));
        animales.add(new Pajaro("Luna", 1));

        for (Animal animal : animales) {
            animal.hacerSonido();
            animal.comer();

            if (animal instanceof Volador) {
                Volador volador = (Volador) animal;
                volador.volar();
            }
            System.out.println();
        }
    }
}
