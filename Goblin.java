

public class Goblin extends Monster {
    private String color;


    public Goblin(String name, int health, int strength, int age, String color) {
        super(name, health, strength, age);
        this.color = color;
    }

    public Goblin(String name, int health, int strength, int age) {
        super(name, health, strength, age);
        this.color = "None";
    }

    

    public void setColor(String color){
        this.color = color; 
    }

    public String getColor(){
        return color;
    }   
    
    @Override
    public void damage() {
        System.out.println("This is " + getName() + ". It has" + getHealth() + " points of health and " + getStrength() + " points of strength. It's "+getAge() + ". Its color is " + color);
    }
}






    

