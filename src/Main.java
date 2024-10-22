public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal", "Huge", 125);
        doAnimalStuff(animal, "Slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "Fast:"); // This invocation passes a `dog object` as the method
                                            // argument when the type was declared as an animal.
                                            // This works because Dog inherits from Animal

        Dog yorkie = new Dog();
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog ("Labrador Retriever", 65,
                "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish swimmy = new Fish("Goldfish", 0.25, 2,3);
        doAnimalStuff(swimmy,"fast");

    }


    public static void doAnimalStuff(Animal animal, String speed) {

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }

}
