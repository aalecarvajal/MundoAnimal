package mx.com.animales;

public class Main {
    public static void main(String[] args){
        Animal[] animales={
            new Perro("Bosco", 5),
            new Perro("Nala", 3),
            new Gato("Scar", 7),
            new Gato("Vozi", 1),
            new Vaca("Clara", 12),
            new Vaca("Bell", 8),
            new Caballo("Spirit", 23),
        };

        for (Animal animal:animales){
            animal.mostrarInformacion();
            animal.hacerSonido();

            Movible movible = (Movible) animal;
            movible.moverse();
        }




    }

}
