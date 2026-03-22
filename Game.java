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
       int defence = 1;

    //Player constructor
    public Player(String name, int health, int damage, int defence, double critMult, double critChance) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.defence = defence;
        this.critMult = critMult;
        this.critChance = critChance;
    } 
    
    //Player methods
    public void attackEnemy(Enemy enemy){
      enemy.health -= this.damage;
    }
}

//enemy class that stores all related information and actions
class Enemy {

    //All enemy variables
    boolean alive;
    String name;
    int health;
    int damage;
    String intro;
    boolean showEnemy = true;

    //Enemy constructor
    public Enemy(String name, int health, int damage, String intro) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.intro = intro;
    }
    
    //Enemy methods
    public void enemyAttack(Player player){
      player.health = player.health - (this.damage - player.defence);
    }
}

class Weapons {
   //Weapon variables
   
   //Weapon constructor
   
   //Weapon methods
}

class Items {
   //Item variables
   
   //Item constructor
   
   //Item methods
   
}

public class Game {  
    public static void main(String[] args) {
      
      boolean running = true;
      int action;
      
      Scanner sc = new Scanner(System.in);
        
        //PLAYER
        Player player = new Player("Brendan", 30, 5, 2, 1.1, 0.30);
        
        //ENEMY DATABASE
        Enemy[] enemies = new Enemy[3];
        enemies[0] = new Enemy("Demon", 5, 4, "With an ominous laugh reverberating through your body, you turn around come face to face with a ");
        enemies[1] = new Enemy("Onryo", 10, 1, "You feel an unnanounced wave of hatred wash over you and you know that you're dealing with an ");
        enemies[2] = new Enemy("Torii", 20, 0, "You see the shillouhette of something strange at the end of the hallway and you are faced with a ");
        
        //WEAPON DATABASE
        
        //ITEM DATABASE
        
        
        //CURRENT ENEMY
           
        while (running = true){
        //Present enemy
            int enemyIndex = (int)(Math.random() * enemies.length);
            if (enemies[enemyIndex].showEnemy == true) {
               System.out.println(enemies[enemyIndex].intro + enemies[enemyIndex].name + ", with " + enemies[enemyIndex].health + " health and " + enemies[enemyIndex].damage + " damage...");
               System.out.println();
            }
            enemies[enemyIndex].showEnemy = false;
        //Prompt user for action 
            System.out.println("What action do you want to take?");
            System.out.println();
               System.out.println("1. Attack  2. Defend  3. Items  ");
               System.out.println();
               action = sc.nextInt();
                 
                 //Player attacks
                  if (action == 1) {
                     System.out.println("You swing at the " + enemies[enemyIndex].name + " for " + player.damage + " damage.");
                     System.out.println();
                     player.attackEnemy(enemies[enemyIndex]);
                     System.out.println("The " + enemies[enemyIndex].name + " is now at " + enemies[enemyIndex].health + " health.");
                     System.out.println();
                  }
                 
                 //Player defends
                  else if (action == 2) {
                     System.out.println("You prepare your defence of " + player.defence + " against the " + enemies[enemyIndex].name + "'s attack");
                     System.out.println();
                     enemies[enemyIndex].enemyAttack(player); 
                        System.out.println("The " + enemies[enemyIndex].name + " attacks you with all its might, dealing " + enemies[enemyIndex].damage 
                        + " to you leaving you with " + player.health + " health remaining.");
                        System.out.println();
                  }
                  
                 //Player Items
            
            }
        
        
        
    }
}