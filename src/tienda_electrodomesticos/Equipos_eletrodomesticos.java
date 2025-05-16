/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda_electrodomesticos;

/**
 *
 * @author Usuario
 */
public abstract class Equipos_eletrodomesticos implements IEficiencia {
    
    protected String marca;
    protected int potencia;
    protected String modelo;

    public Equipos_eletrodomesticos(String marca, int potencia, String modelo) {
        this.marca = marca;
        this.potencia = potencia;
        this.modelo = modelo;
    }
    
    public abstract double precio();



}
