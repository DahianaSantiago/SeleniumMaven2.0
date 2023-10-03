package firstChallenge;


import java.util.Objects;
import java.util.Scanner;

public class Questions {

    public static void questions() {
        String question = "";
        String choiceOne = " Mars  ";
        String choiceTwo = " Jupiter";
        String choiceThree = " Venus";
        String correctAnswer = "Jupiter";
        String answer = "";
        boolean b = true;
        int counter = 0;

        do {
        System.out.println("Which is the biggest planet in the milky way? "+ choiceOne + " or "
                + choiceTwo + " or " + choiceThree);
        System.out.println("Your answer is:   ");
        Scanner input = new Scanner(System.in);
        answer = input.next();
            if (correctAnswer.equals(answer)) {
                System.out.println("You're right!!");
                b=false;
            } else {
                System.out.println("Sorry, try again! You only have "+ (3-counter) +" attemps");
                counter = counter+1;
            }
        }while(b==true && counter<4);

    }
}
