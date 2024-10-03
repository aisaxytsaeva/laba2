

public class Dragon extends Monster{
    private String prize;

    public Dragon(String name, int health, int strength, int age, String prize) {
        super(name, health, strength, age);
        this.prize = prize;

    }

    public void setPrize(String prize){
        this.prize = prize; 
    }

    public String getPrize(){
        return prize;
    }

    @Override
    public void damage() {
        System.out.println("This is " + getName() + ". It has" + getHealth() + " points of health and " + getStrength() + " points of strength. It's "+getAge() + ". If you defeat it, you will get " + prize);
    }




}