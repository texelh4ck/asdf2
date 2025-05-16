/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda_electrodomesticos;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Tienda_Electrodomesticos {
    
    private ArrayList<Equipos_eletrodomesticos> equiposElectrodomesticos;

    public Tienda_Electrodomesticos() {
        equiposElectrodomesticos = new ArrayList<>();
    }
        
    public void adicionarEquipo(int numVelocidades, double capacidadVaso, String marca, int potencia, String modelo){
        Batidora e = new Batidora(numVelocidades, capacidadVaso, marca, potencia, modelo);
        equiposElectrodomesticos.add(e);
    }
    
    public void adicionarEquipo(String tipoCarga, double capacidadCarga, int cilosxMinutos, double peso, String marca, int potencia, String modelo){
        Lavadora e = new Lavadora(tipoCarga, capacidadCarga, cilosxMinutos, peso, marca, potencia, modelo);
        equiposElectrodomesticos.add(e);
    }
    
    public void adicionarEquipo(int numPuertas, boolean dispensador, double peso, String marca, int potencia, String modelo){
        Refrigerador e = new Refrigerador(numPuertas, dispensador, peso, marca, potencia, modelo);
        equiposElectrodomesticos.add(e);
    }

    public ArrayList<Equipos_eletrodomesticos> ListadoPrecio(double eficiencia) {
        ArrayList<Equipos_eletrodomesticos> e = new ArrayList<>();
        for (int i = 0; i < this.equiposElectrodomesticos.size(); i++) {
            IEficiencia eq = this.equiposElectrodomesticos.get(i);
            if(eq.calcularEficiencia() >= eficiencia){
                e.add(this.equiposElectrodomesticos.get(i));
            }
        }
        return e;
    }

    public String MayorGanacia() {
        int b = 0;
        int l = 0;
        int r = 0;
        for (int i = 0; i < this.equiposElectrodomesticos.size(); i++) {
            Equipos_eletrodomesticos eq = this.equiposElectrodomesticos.get(i);
            if(eq instanceof Batidora){
                b += eq.precio();
            } else if(eq instanceof Lavadora) {
                l += eq.precio();
            } else if (eq instanceof Refrigerador) {
                r += eq.precio();
            }
        }
        if(b > l && b > r) {
            return "Batidora";
        } else if (l > r) {
            return  "Lavadora";
        }
        return "Refrigerador";
    }

}
