package fourthChallenge;

public class Carro{

    private String modelo;
    private double precio;
    private String marca;

    public Carro() {
    }

    public Carro(String modelo, double precio, String marca) {
        this.modelo = modelo;
        this.precio = precio;
        this.marca = marca;
    }


    public double getPrecio() {
        return precio;
    }

    public String mostrarDatos(){
        return "Marca: " + marca + " Modelo: " +modelo+" Precio:"+precio;
    }

}
