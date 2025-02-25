 /*
      Write a medthod to display the multiplication table
   */
   
   public static void multiplicationTable()
   { 
      
      System.out.print(String.format("%3s", "X"));
      for (int i=1; i<=10; i++)
         System.out.print(String.format("%4s", i));
      System.out.println();
      
      for (int row=0; row <= 10; row++)
      {
         System.out.print(String.format("%3s", (row+1 + "")));
         for (int col=1; col <= 10; col++)
         {
            System.out.print(String.format("%4d", ((col)*(row+1))));
         }  
         System.out.println();
      }   
   }

