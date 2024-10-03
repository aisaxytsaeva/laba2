abstract class Monster {
    private String name; 
    private double health;
    private int strength;
    private int age;
    static int counter;


    public Monster() {
        name = "None";
        health = 0;
        strength = 0;
        age = 0;
        counter++;
    }

    
    public Monster(String name, double health, int strength, int age) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.age = age;
        counter++;
    }

    public Monster(String name, int age) {
        this.name = name;
        this. age = age;
        counter++;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getHealth() {
        return health;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    abstract public void damage();

   


    
}

