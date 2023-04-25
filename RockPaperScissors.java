import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

    //Task 1: See if the user wants to play. 
        String play = scan.nextLine();

    /*Task 2: Set up the game
    

       • if the answer is yes: 
             – print: Great!
             – print: rock - paper - scissors, shoot!
             – pick up user's choice.
             – get the computer choice (can only be done after task 3).
             – get the result (can only be done after task 4)
             – print everything (can only be done after task 5).

       • else:
             – print: Darn, some other time...!        
    */
    if (play.equalsIgnoreCase("Yes")){
        System.out.println("Great");
        System.out.println(" Rock, paper, scissors , shoot");
        String yourChoice = scan.next();
        String computerChoice = computerChoice();
        String result = result(yourChoice, computerChoice);
        printResult(yourChoice, computerChoice, result);
    } else{
              
        System.out.println("Darn, some other time.....!");
    }
        scan.close();
    }

    //Task 3  – Write a function where the computer picks a random choice.

    /**
     * Function name: computerChoice - picks randomly between rock paper and scissors
     * @return a choice (String).
     * 
     * Inside the function:
     *   1. Picks a random number between 0 and 2.
     *   2. if 0: returns the choice 'rock'
     *      if 1: returns the choice 'paper'
     *      if 2: returns the choice 'scissors'
     */

     public static String computerChoice(){
        double randomNumber = Math.random() * 3;  
        
        int integer = (int) randomNumber;


        switch (integer) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return "";  //default case not possible.

        }
     }



    //Task 4  – Write a function that compares the choices and returns the result.

    /**
     * Function name: result - It returns the result of the game.
     *  @param yourChoice (String)
     *  @param computerChoice (String) 
     *  @return result (String) 

     * Inside the function:
     *   
     *   1. result is "You win!" if:
     *
     *       You: "rock"      Computer: "scissors"
     *       You: "paper"     Computer: "rock"
     *       You: "scissors"  Computer: "paper"
     *
     *   2. result is "You lose" if:
     * 
     *       Computer: "rock"      You: "scissors"
     *       Computer: "paper"     You: "rock"
     *       Computer: "scissors"  You: "paper"
     *
     *   3. result is "It's a tie" if: Your choice equals computer choice.
     * 
     * 
     *   4. Otherwise, print "INVALID CHOICE" and exit the program.
     *
     *
     */

    public static String result(String yourChoice, String computerChoice) {
        String result = "";

        if (yourChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("scissors")) {
            result = "You win!";
        } else if (yourChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("paper")) {
            result = "You lose!";
        } else if (yourChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("rock")) {
            result = "You win!";
        } else if (yourChoice.equalsIgnoreCase("paper") && computerChoice.equals("scissors")) {
            result = "You lose!";
        } else if (yourChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("paper")) {
            result = "You win!";
        } else if (yourChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("rock")) {
            result = "You lose!";
        } else if (yourChoice.equals(computerChoice)) {
            result = "It's a tie!";
        } else {
            System.out.println("INVALID CHOICE");
            System.exit(0);
        }
        return result;
      }
      
 
     //Task 5  – Write a function that prints your choice, the computer's, and the result.

    /**
     * Name: printResult - It prints everything (your choice, computer choice, result)
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @param result (String)
     * 
     * Inside the function:
     * 
     *  1. prints everything:
     *      – prints: You chose:          <your choice>
     *      – prints: The computer chose: <computer choice>
     *      – prints: <result>
     */

     public static void printResult(String yourChoice, String computerChoice, String result){
        System.out.println("You chose:          " +yourChoice);
        System.out.println("The computer chose: " + computerChoice);
        System.out.println(result);
     }

}
