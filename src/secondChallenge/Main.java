package secondChallenge;

import firstChallenge.Questions;

import static secondChallenge.SalaryEmployee.*;

public class Main {

    public static void main(String[] args) {


        int [] array = SalaryEmployee.inputHours();
        double result = salary( array[0], array[1],array[2]);
        System.out.println("El salario total es: "+ result);
        System.out.println("cambio");
    }
}
