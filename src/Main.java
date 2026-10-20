import java.util.Scanner;

class RockPaperScissors {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String playerA;
        String playerB;
        String again = "Y";

        while (again.equalsIgnoreCase("Y")) {

            // Player A
            System.out.print("Player A (R, P, S): ");
            playerA = input.nextLine();

            while (!playerA.equalsIgnoreCase("R") &&
                    !playerA.equalsIgnoreCase("P") &&
                    !playerA.equalsIgnoreCase("S")) {
                System.out.print("Invalid move. Try again: ");
                playerA = input.nextLine();
            }

            // Player B
            System.out.print("Player B (R, P, S): ");
            playerB = input.nextLine();

            while (!playerB.equalsIgnoreCase("R") &&
                    !playerB.equalsIgnoreCase("P") &&
                    !playerB.equalsIgnoreCase("S")) {
                System.out.print("Invalid move. Try again: ");
                playerB = input.nextLine();
            }

            // Check winner
            if (playerA.equalsIgnoreCase(playerB)) {
                System.out.println("It's a Tie!");
            }
            else if (playerA.equalsIgnoreCase("R") &&
                    playerB.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks Scissors. Player A wins!");
            }
            else if (playerA.equalsIgnoreCase("P") &&
                    playerB.equalsIgnoreCase("R")) {
                System.out.println("Paper covers Rock. Player A wins!");
            }
            else if (playerA.equalsIgnoreCase("S") &&
                    playerB.equalsIgnoreCase("P")) {
                System.out.println("Scissors cuts Paper. Player A wins!");
            }
            else if (playerB.equalsIgnoreCase("R") &&
                    playerA.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks Scissors. Player B wins!");
            }
            else if (playerB.equalsIgnoreCase("P") &&
                    playerA.equalsIgnoreCase("R")) {
                System.out.println("Paper covers Rock. Player B wins!");
            }
            else {
                System.out.println("Scissors cuts Paper. Player B wins!");
            }

            // Play again
            System.out.print("Play again? (Y/N): ");
            again = input.nextLine();
        }

        input.close();
    }
}
