public class Cow implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String name;
    
    public Cow() {
        this.legs = 4;
        this.sound = "Mooo";
        this.food = "Grass";
        this.name = "Bessie";
    }
    
    @Override
    public Animal clone() {
        Cow cowClone = new Cow();
        cowClone.legs = this.legs;
        cowClone.sound = this.sound;
        cowClone.food = this.food;
        cowClone.name = this.name;
        return cowClone;
    }
    
    @Override
    public void makeSound() {
        System.out.println(getName() + " the Cow says: " + sound);
    }
    
    @Override
    public String getType() {
        return "Cow";
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
        return name + " the Cow";
    }
}