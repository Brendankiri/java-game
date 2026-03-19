import java.util.Scanner;

//player class that stores all related information and actions
class Player {

    //All player variables
    boolean alive;
    String name;
    int health = 10;
    int damage = 1;
    double critMult = 1.1;
    double critChance = 0.30;

    //Player constructor
    public Player(String name, int health, int damage, double critMult, double critChance) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.critMult = critMult;
        this.critChance = critChance;
    }
    
    //Player methods
    
}

//enemy class that stores all related information and actions
class Enemy {

    //All enemy variables
    boolean alive;
    String name;
    int health;
    int damage;
    String intro;

    //Enemy constructor
    public Enemy(String name, int health, int damage, String intro) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.intro = intro;
    }
}

class Weapons {
   
}

class Items {
   
}

public class Game {  
    public static void main(String[] args) {

      boolean running = false;
      
      Scanner sc = new Scanner(System.in);
      
        Player player = new Player("Brendan", 30, 5, 1.1, 0.30);
   
        Enemy[] enemies = new Enemy[3];
        enemies[0] = new Enemy("Demon", 5, 4, "With an ominous laugh reverberating through your body, you turn around come face to face with a ");
        enemies[1] = new Enemy("Onryo", 10, 1, "You feel an unnanounced wave of hatred wash over you and you know that you're dealing with an ");
        enemies[2] = new Enemy("Torii", 20, 0, "You see the shillouhette of something strange at the end of the hallway and you are faced with a ");        
        
        while (running = true){
        
            int enemyIndex = (int)(Math.random() * enemies.length);
            System.out.println(enemies[enemyIndex].intro + enemies[enemyIndex].name + ", with " + enemies[enemyIndex].health + " health and " + enemies[enemyIndex].damage + " damage...");
         
            System.out.println("What action do you want to take?");
            
            }
        
        
        
    }
}