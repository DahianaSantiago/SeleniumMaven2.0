package fourthChallenge;

import thirdChallenge.Cuadrilatero;

import java.util.Scanner;

public class Main {

    public static int indiceCarroMasBarato(Carro carros[]){
        double precio;
        int indice=0;

        precio = carros[0].getPrecio();

        for (int i =1;i<carros.length;i++){
            if (carros[i].getPrecio() < precio);{
                precio= carros[i].getPrecio();
                indice=i;
            }
        }
        return indice ;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numeroCarros;
        int i =0;

        System.out.println("Cuantos carro va a ingresar: ");
        numeroCarros = input.nextInt();
        //Se crean los objetos para los carros en un arreglo

       Carro carros[] = new Carro[numeroCarros];

       for (i=0;i<numeroCarros;i++);{
            System.out.println("Ingrese las caracteristicas del carro "+ (i+1) + ": ");
            System.out.println("Ingrese la marca: ");
            marca = input.next();
            System.out.println("Ingrese el modelo: ");
            modelo = input.next();
            System.out.println("Ingrese el precio:");
            precio = input.nextFloat();

            carros[i] = new Carro(marca,precio,modelo);
        }

        System.out.println("hola cambio");



    }


}
