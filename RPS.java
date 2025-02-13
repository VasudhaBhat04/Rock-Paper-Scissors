import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "Y";

        do{
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
                System.out.println("Seriously a" + playerChoice + " bro?");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a tie!");
            }
            else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                       (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                       (playerChoice.equals("scissors") && computerChoice.equals("paper"))){
                System.out.println("You win!Yayyy...not a big deal but congrats");
            }
            else{
                System.out.println("You lose!! Hahahaha");
            }

            System.out.print("Enter Y to play again or press any character to Stop the game ");
            playAgain = scanner.nextLine().toUpperCase();

        }while(playAgain.equals("Y"));

        System.out.println("Thanks for playing ! Bye.Have a great time ahead.");

        scanner.close();
    }
}
