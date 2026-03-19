public class BINGOCardMoreeBrendan {

   int[] min = {1, 16, 31, 46, 61};
   int[] max = {15, 30, 45, 60, 75};
   int[][] card = new int[5][5];

   public BINGOCardMoreeBrendan(){

      for (int col = 0; col < 5; col++) {
         for (int row = 0; row < 5; row++) {

            int rand = (int)(Math.random() * (max[col] - min[col] + 1)) + min[col];

            boolean duplicate = false;
            for (int i = 0; i < row; i++){
               if(card[i][col] == rand){
                  duplicate = true;
               }
            }

            if(duplicate){
               row--;
               continue;
            }

            card[row][col] = rand;
         }
      }

      // center free space
      card[2][2] = 0;
   }

   public void printCard(){

      System.out.println("B  I  N  G  O");

      for(int row = 0; row < card.length; row++){
         for(int col = 0; col < card[row].length; col++){
            System.out.printf("%2d ", card[row][col]);
         }
         System.out.println();
      }
   }

   public void markNumber(int num){
      for(int row = 0; row < 5; row++){
         for(int col = 0; col < 5; col++){
            if(card[row][col] == num){
               card[row][col] = 0;
            }
         }
      }
   }

   public boolean checkWin(){

      // check rows
      for(int row = 0; row < 5; row++){
         boolean win = true;
         for(int col = 0; col < 5; col++){
            if(card[row][col] != 0){
               win = false;
            }
         }
         if(win) return true;
      }

      // check columns
      for(int col = 0; col < 5; col++){
         boolean win = true;
         for(int row = 0; row < 5; row++){
            if(card[row][col] != 0){
               win = false;
            }
         }
         if(win) return true;
      }

      // check diagonal top-left to bottom-right
      boolean win = true;
      for(int i = 0; i < 5; i++){
         if(card[i][i] != 0) win = false;
      }
      if(win) return true;

      // check diagonal top-right to bottom-left
      win = true;
      for(int i = 0; i < 5; i++){
         if(card[i][4-i] != 0) win = false;
      }
      if(win) return true;

      return false;
   }

}