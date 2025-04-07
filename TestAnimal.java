public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();
        
        Animal sheep = registry.createSheep("Timmy");
        Animal cow = registry.createCow("Elsie");
        Animal horse = registry.createHorse("Cosmic Pegasus");
        
        sheep.makeSound();
        cow.makeSound();
        horse.makeSound();
    }
}