package secondChallenge;

import java.util.Scanner;

public class SalaryEmployee {

    public static int[] inputHours(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese las horas trabajadas por semana: ");
        int hour = input.nextInt();
        System.out.println("Ingrese el salario por hora: ");
        int salaryPerHour = Integer.valueOf(input.nextInt());
        System.out.println("Ingrese el numero de dias por el bono de vacations: ");
        int bonus = Integer.valueOf(input.nextInt());
        int [] arr = new int[]{hour, salaryPerHour, bonus};
        return arr;
    }

    public static int salary(int hoursPerWeek,int salaryPerHour,int bonusVacationsDays){
        int totalsalary= salaryPerHour*hoursPerWeek + bonusVacationsDays*salaryPerHour*8;
        return totalsalary;
    }
}
