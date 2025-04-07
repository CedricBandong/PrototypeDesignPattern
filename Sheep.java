public class Sheep implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String name;
    
    public Sheep() {
        this.legs = 4;
        this.sound = "Baaa";
        this.food = "Grass";
        this.name = "Unknown Sheep";
    }
    
    public Sheep(String name) {
        this();
        this.name = name;
    }
    
    @Override
    public Animal clone() {
        Sheep sheepClone = new Sheep();
        sheepClone.legs = this.legs;
        sheepClone.sound = this.sound;
        sheepClone.food = this.food;
        sheepClone.name = this.name;
        return sheepClone;
    }
    
    @Override
    public void makeSound() {
        System.out.println(getName() + " the Sheep says: " + sound);
    }
    
    @Override
    public String getType() {
        return "Sheep";
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    // Getters and setters
    public int getLegs() {
        return legs;
    }
    
    public void setLegs(int legs) {
        this.legs = legs;
    }
    
    public String getSound() {
        return sound;
    }
    
    public void setSound(String sound) {
        this.sound = sound;
    }
    
    public String getFood() {
        return food;
    }
    
    public void setFood(String food) {
        this.food = food;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name + " the Sheep";
    }
}