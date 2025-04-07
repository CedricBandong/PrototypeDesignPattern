public class Horse implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String color;
    private String name;
    
    public Horse() {
        this.legs = 4;
        this.sound = "Neigh!";
        this.food = "Hay";
        this.color = "Brown";
        this.name = "Thunder";
    }
    
    @Override
    public Animal clone() {
        Horse horseClone = new Horse();
        horseClone.legs = this.legs;
        horseClone.sound = this.sound;
        horseClone.food = this.food;
        horseClone.color = this.color;
        horseClone.name = this.name;
        return horseClone;
    }
    
    @Override
    public void makeSound() {
        System.out.println(getName() + " the Horse says: " + sound);
    }
    
    @Override
    public String getType() {
        return "Horse";
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
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name + " the Horse";
    }
}
