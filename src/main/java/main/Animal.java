package main;

public class Animal {
    private String species;
    private String name;
    private int age;

public Animal(String species, String name, int age) {
    this.species = species;
    this.name = name;
    this.age = age;
    }

   
public void setName(String name) {
    this.name = name;
}

public void setSpecies(String species) {
    this.species = species;
}

public void setAge(int age) {
    this.age = age;
}

public String getName() {
    return name;
}

public String getSpecies() {
    return species;
}

public int getAge() {
    return age;
}

public void listAnimals() {
    System.out.println(species+": "+name+", "+age+" vuotta");
}

public void runAnimals(int round) {
    for(int i=0; i<round; i++){
        System.out.println(name+" juoksee kovaa vauhtia!");
    }
}

}