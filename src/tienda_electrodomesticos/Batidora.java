/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda_electrodomesticos;

/**
 *
 * @author Usuario
 */
public class Batidora extends Equipos_eletrodomesticos {

    private int numVelocidades;
    private double capacidadVaso;

    public Batidora(int numVelocidades, double capacidadVaso, String marca, int potencia, String modelo) {
        super(marca, potencia, modelo);
        this.numVelocidades = numVelocidades;
        this.capacidadVaso = capacidadVaso;
    }
    
    
    @Override
    public double precio() {
        return 30 + (2 * numVelocidades);
    }
    
    public double calcularEficiencia() {
        return (potencia * capacidadVaso) / numVelocidades;
    }

    
    
}
