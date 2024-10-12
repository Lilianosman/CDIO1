

public class cdio1 {
    public static void main(String[] args) {
       
        var PlayerOneScore = 0;
        var PlayerTwoScore = 0;

       
        while ((PlayerOneScore < 40) && (PlayerTwoScore < 40)){
           
            int OnePlayersDiceOne = Dice();
            int OnePlayersDiceTwo = Dice();
            

            if ((OnePlayersDiceOne == 1) && (OnePlayersDiceTwo == 1)){
                System.out.println("first dice: " + OnePlayersDiceOne + " second dice: " + OnePlayersDiceTwo);
                PlayerOneScore = 0;
                System.out.println("goodluck next time");
            }
            else {
                 System.out.println("first dice: " + OnePlayersDiceOne + " second dice: " + OnePlayersDiceTwo);
                int sum1 = OnePlayersDiceOne + OnePlayersDiceTwo;
                PlayerOneScore += sum1;
            }
            
            System.out.println("Player One Score: " + PlayerOneScore);
            System.out.println();
            
            if (PlayerOneScore >= 40 ){

        
                System.out.println("player one has won the game w a score of " + PlayerOneScore);
            
                break; 
            }
            
            int TwoPlayersDiceOne = Dice();
            int TwoPlayersDiceTwo = Dice();

            if ((TwoPlayersDiceOne == 1) && (TwoPlayersDiceTwo == 1)){
               System.out.println("first dice: " + TwoPlayersDiceOne + " second dice: " + TwoPlayersDiceTwo);
                PlayerTwoScore = 0;
                System.out.println("goodluck next time");
            }
            else {
                System.out.println("first dice: " + TwoPlayersDiceOne + " second dice: " + TwoPlayersDiceTwo);
                int sum2 = TwoPlayersDiceOne + TwoPlayersDiceTwo;
                PlayerTwoScore += sum2;
            }
            System.out.println("Player Two Score: " + PlayerTwoScore);
            System.out.println();

            
            
            
            
            if (PlayerTwoScore >= 40 ){

                System.out.println("player two has won the game w a score of " + PlayerTwoScore);

                break; 
            }

        }

    }

    public static int Dice() {
        int dice = (int)(Math.random() * 6 + 1);   
        return dice;
    }

}