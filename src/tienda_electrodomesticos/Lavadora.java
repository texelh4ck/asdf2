/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda_electrodomesticos;

/**
 *
 * @author Usuario
 */
public class Lavadora extends Equipos_eletrodomesticos {

    private String tipoCarga;
    private double capacidadCarga;
    private int cilosxMinutos;
    private double peso;

    public Lavadora(String tipoCarga, double capacidadCarga, int cilosxMinutos, double peso, String marca, int potencia, String modelo) {
        super(marca, potencia, modelo);
        this.tipoCarga = tipoCarga;
        this.capacidadCarga = capacidadCarga;
        this.cilosxMinutos = cilosxMinutos;
        this.peso = peso;
    }
    
    
    @Override
    public double precio() {
        var p = 250 + (capacidadCarga / cilosxMinutos);
        if(tipoCarga == "frontal"){
            p += 50;
        } else {
            p += p/2;
        }
        return p;
    }
    
    public double calcularEficiencia() {
        return (cilosxMinutos * capacidadCarga) / (potencia + peso);
    }

    
    
}
