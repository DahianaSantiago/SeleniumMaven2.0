package thirdChallenge;

import secondChallenge.SalaryEmployee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Cuadrilatero cuadrilatero;
        float lado1, lado2;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el lado1: ");
        lado1 = input.nextFloat();
        System.out.println("Ingrese el lado2: ");
        lado2 = input.nextFloat();

        if (lado1==lado2){ //cuadrado
            cuadrilatero = new Cuadrilatero(lado1);
        }else{
            cuadrilatero = new Cuadrilatero(lado1,lado2);}

        System.out.println("El perimetro es: " + cuadrilatero.getPerimetro() + " y el area es: " + cuadrilatero.getArea());
    }


}
