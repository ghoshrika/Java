import java.util.*;

class GuessNumber{
    private int randomNumber;
    private int numberOfAttempts = 0;
    private int guessNumber;

    //getter setter method for numberOfAttempts
    public int getNumberOfAttempts(){
        return numberOfAttempts;
    }
    public void setNumberOfAttempts(int numberOfAttempts){
        this.numberOfAttempts = numberOfAttempts;
    }

    // creating a constructor to generate random number
    GuessNumber(){
        Random r = new Random();
        this.randomNumber = r.nextInt(101);
    }

    //Method to take user input for the guessing number
    void takeInput(Scanner sc){
        System.out.println("Guess any number: ");
        guessNumber = sc.nextInt();
    }

    //Method to check if the gussing number is right or not
    boolean isCorrect(){
        numberOfAttempts++;
        if (guessNumber == randomNumber){
            System.out.println("Congratulations! Your Guess is Right.");
            System.out.println("You Gussed it in " + numberOfAttempts + " attempts.");
            return true;
        }
        else if(guessNumber > randomNumber){
            System.out.println("Your Guessed number is too high!");
        }
        else if(guessNumber < randomNumber){
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
