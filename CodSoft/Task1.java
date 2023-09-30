import java.util.*;

class GuessNumber{
    public int randomNumber;
    public int numberOfAttempts = 0;
    public int playerGuess;

    //getter setter method for numberOfAttempts
    public void setNumberOfAttempts(int numberOfAttempts){
        this.numberOfAttempts = numberOfAttempts;
    }
    public int getNumberOfAttempts(){
        return numberOfAttempts;
    }

    // creating a constructor to generate random number
    GuessNumber(){
        int minNum = 1;
        int maxNum = 100;
        Random r = new Random();
        this.randomNumber = r.nextInt(maxNum - minNum + 1) + minNum;
    }

    //Method to take user input for the guessing number
    void takeInput(Scanner sc){
        System.out.println("Guess any number(1-100): ");
        playerGuess = sc.nextInt();
    }

    //Method to check if the gussing number is right or not
    boolean isCorrect(){
        numberOfAttempts++;
        if (playerGuess == randomNumber){
            System.out.println("Congratulations! Your Guess is Right.");
            System.out.println("You Gussed it in " + numberOfAttempts + " attempts.");
            return true;
        }
        else if(playerGuess > randomNumber){
            System.out.println("Your Guessed number is too high!");
        }
        else{
            System.out.println("Your Guessed number is too low!");
        }
        return false;
    }
}

public class Task1 {
    public static void main(String[] args) {
        GuessNumber gn = new GuessNumber();
        boolean result = false;
        Scanner sc = new Scanner(System.in);
        while(!result){
            gn.takeInput(sc);
            result = gn.isCorrect();
            //System.out.println(result);
        }
        sc.close();
    }
}
