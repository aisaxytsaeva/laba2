

public class Mermaid extends Monster {
    private String location;
    public Mermaid(String name, int health, int strength, int age, String location) {
        super(name, health, strength, age);
        this.location = location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation(){
        return location;
    }

    @Override
    public void damage() {
        System.out.println("This is " + getName() + ". It has" + getHealth() + " points of health and " + getStrength() + " points of strength. It's "+getAge() + ". It's located in " + location);
    }
    public static void main(String[] args) {

    }

}

