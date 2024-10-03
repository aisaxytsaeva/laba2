public class Main {
    public static void main(String[] args) {
        Mermaid seaMermaid = new Mermaid("Sea Mermaid", 120, 15, 25, "sea");
        seaMermaid.setAge(30);
        seaMermaid.damage();




        Goblin blueGoblin = new Goblin("Blue Goblin", 55, 30, 15);
        blueGoblin.damage();

        Dragon ancientDragon = new Dragon("Ancient Dragon", 12000, 50000, 300, "gold");
        ancientDragon.damage();

  

        System.out.println("Nonal number of monsters " + Monster.counter);
    
    }
    
}





       // 
        //
        //
