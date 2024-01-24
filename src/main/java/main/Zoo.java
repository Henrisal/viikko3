package main;
import java.util.ArrayList;


public class Zoo {
    private String name;
    private ArrayList<Animal> animals = new ArrayList<>();

public Zoo(String name) {
    this.name = name;

}

public void setName(String name) {
    this.name = name;
}

public String getName() {
    return name;
}

public void addAnimal(String species, String name, int age) {
    animals.add(new Animal(species, name, age));
}

public void listAnimals() {
    System.out.println(name+" pitää sisällään seuraavat eläimet:");
    for (Animal animal : animals) {
        System.out.println(animal.getSpecies() + ": " + animal.getName() + ", " + animal.getAge() + " vuotta");
    }
}

public void runAnimals(int round) {
    for (Animal animal : animals) {
        animal.runAnimals(round);
    }
}

}