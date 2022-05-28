/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hambuergesas;

/**
 *
 * @author madrid
 */
public class Controlador {
    
    public double precio=0, hamburguesa=0, patatas=0,salsas=0;

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setHamburguesa(double hamburguesa) {
        this.hamburguesa = hamburguesa;
    }

    public void setPatatas(double patatas) {
        this.patatas = patatas;
    }

    public void setSalsas(double salsas) {
        this.salsas = salsas;
    }

    public double getPrecio() {
         precio = hamburguesa+patatas+salsas;
        return precio;
    }
   
}
