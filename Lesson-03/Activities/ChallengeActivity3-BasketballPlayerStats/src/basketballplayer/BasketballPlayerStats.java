/* Challenge Activity 3 - Basketball Player Stats

This challenge activitiy should ask for the following inputs:
- a basketball player's name and the following "stats" (all integers)
- total free throws made / attempted
- total field goals made / attempted

and then display the player's "Stats"

player name, total points, free throw pct, field goal pct

For example:

Enter player's name: Tony
Free throws attempted: 4
Free throws made: 3
Field goals attempted: 10
Field goals made: 5

Tony's stats:
Points: 13 
FT %: 0.75
FG %: 0.50

 */
package basketballplayer;

import java.util.Scanner;


/**
 *
 * @author mafudge
 */
public class BasketballPlayerStats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Decalre variables
        String name;
        int throwsA, throwsM, goalsA, goalsM, points;
        double ftp, fgp;
        //Ask for variables from user
        Scanner input = new Scanner(System.in);
        //Get player name
        System.out.println("Enter player's name:");
        name = input.nextLine();
        //Get attempted throws
        System.out.println("Enter attempted throws");
        throwsA = input.nextInt();
        //Get throws made
        System.out.println("Enter throws made");
        throwsM = input.nextInt();
        //Get goals attempted
        System.out.println("Enter attempted goals");
        goalsA = input.nextInt();
        //Get goals made
        System.out.println("Enter goals made");
        goalsM = input.nextInt();
        //Compute           
        points = throwsM + (goalsM * 2);
        ftp = (double)throwsM / throwsA * 100;
        fgp = (double)goalsM / goalsA * 100;
        //Display
        System.out.printf("%s's stats:\n", name);
        System.out.printf("Free Throws percentage %.2f\n",ftp);
        System.out.printf("Free Goals %.2f\n", fgp);
        
        
        
        
    }
    
}
