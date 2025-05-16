/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda_electrodomesticos;

/**
 *
 * @author Usuario
 */
public abstract class Equipos_pesados extends Equipos_eletrodomesticos {
    
    protected double peso;

    public Equipos_pesados(double peso, String marca, int potencia, String modelo) {
        super(marca, potencia, modelo);
        this.peso = peso;
    }
    
    
}
