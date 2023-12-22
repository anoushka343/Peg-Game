import java.util.Scanner;
 public class Game
{
    public static void main(String[]args)
    {
        Board b = new Board();
        Scanner in = new Scanner(System.in);
        //Rules r = new Rules();
        System.out.println("This is the board that will be used for the game");
        System.out.println("the o represents the empty spot and the x's are the ones with pegs in them");
        System.out.println("Enter the peg number you would like to move and the number to which spot you would like to move it");
        
        
        System.out.println( " " + " " + " " + " " + " " + b.getPosition(0));
        System.out.println(" " + " " + " " + " " + " " + "0");
        System.out.println( " " + " " + " " + b.getPosition(1) + " " + " " + " " + b.getPosition(2));
        System.out.println(" " + " " + " " + "1" + " " + " " + " " + "2");
        System.out.println(" " + " " + b.getPosition(3) + " " + " "  + b.getPosition(4)+ " " + " "  + b.getPosition(5));
        System.out.println(" " + " " + "3" + " " + " " + "4" + "  " + " " + "5");
        System.out.println( " " + b.getPosition(6) + " " + " " + b.getPosition(7) + " " + " " + b.getPosition(8) + " " + " " + b.getPosition(9));
        System.out.println(" " + "6" + " " + " " + "7" + " " + " "  + "8" + " " + " " + "9");
        System.out.println(b.getPosition(10) + " " + " " + b.getPosition(11)+ " " + " " + b.getPosition(12) + " " + " "  + b.getPosition(13) + " " + " " + b.getPosition(14));
        System.out.println("10" + " " + "11" + " " + "12" + " "+ "13" + " " + "14");
        
        /*for(int i = 0; i <= 14; i++)
        {
            System.out.println( " " + b.getPosition(0));
            System.out.println(" " + "0");
            System.out.println( b.getPosition(1) + " " + " " +  b.getPosition(2));
        System.out.println("1" + " " + " " + "2");
        System.out.println( b.getPosition(3) + " " + b.getPosition(4)+ " " + b.getPosition(5));
        System.out.println("3" + " " + "4" + "  " + "5");
        System.out.println(b.getPosition(6) + " " + b.getPosition(7) + " " + b.getPosition(8) + " " + b.getPosition(9));
        System.out.println("6" + " " + "7" + " " + "8" + " " + "9");
        System.out.println(b.getPosition(10) + " " + b.getPosition(11)+ " " + b.getPosition(12) + " " + b.getPosition(13) + " " + b.getPosition(14));
        System.out.println("10" + " " + "11" + " " + "12" + " " + "13" + " " + "14");
        */
        
        }
    }

