public class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;
    
    public AnimalRegistry() {
        sheepPrototype = new Sheep();
        cowPrototype = new Cow();
        horsePrototype = new Horse();
    }
    
    
    public Animal createSheep(String name) {
        Sheep sheep = (Sheep) sheepPrototype.clone();
        sheep.setName(name);
        return sheep;
    }
    
    
    public Animal createCow(String name) {
        Cow cow = (Cow) cowPrototype.clone();
        cow.setName(name);
        return cow;
    }
    
    
    public Animal createHorse(String name) {
        Horse horse = (Horse) horsePrototype.clone();
        horse.setName(name);
        return horse;
    }
}