/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda_electrodomesticos;

/**
 *
 * @author Usuario
 */
public class Refrigerador extends Equipos_eletrodomesticos {
    private int numPuertas;
    private boolean dispensador;

    public Refrigerador(int numPuertas, boolean dispensador, double peso, String marca, int potencia, String modelo) {
        super(marca, potencia, modelo);
        this.numPuertas = numPuertas;
        this.dispensador = dispensador;
    }

    @Override
    public double precio() {
        double aux = 300 + (10 * numPuertas);
        if(dispensador)
            return aux +50;
        return aux;
    }

}
