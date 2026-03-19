import java.util.Scanner;

public class BINGOGameMoreeBrendan {

   public static void main(String[] args){

      Scanner input = new Scanner(System.in);

      BINGOCardMoreeBrendan card = new BINGOCardMoreeBrendan();

      System.out.println("Welcome to a game of BINGO!");
      System.out.println("Here is your card:");
      card.printCard();

      boolean winner = false;

      while(!winner){

         System.out.println("What would you like to do?");
         System.out.println("1)Enter a called number.");
         System.out.println("2)See current card.");

         int choice = input.nextInt();

         if(choice == 1){

            System.out.print("Enter the called number: ");
            int num = input.nextInt();

            card.markNumber(num);

            if(card.checkWin()){
               System.out.println("Looks like we've got a winner!");
               card.printCard();
               winner = true;
            } else {
               System.out.println("No winner yet!");
            }

         } else if(choice == 2){
            card.printCard();
         }

      }

      input.close();
   }

}