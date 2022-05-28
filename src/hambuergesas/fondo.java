/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hambuergesas;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author madrid
 */
public class fondo extends javax.swing.JPanel {

    /**
     * Creates new form fondo
     */
    public fondo() {
        initComponents();
    }
    
    @Override
    public void paint(Graphics g){
        Dimension dimension=this.getSize();
        ImageIcon icono=new ImageIcon(getClass().getResource("/imagen/fondo2.jpg"));
        g.drawImage(icono.getImage(),0,0,dimension.width, dimension.height,null);//la ubicacion de la imagen en el eje 0x y 0y y el tamaño de ancho y alto
        this.setOpaque(false); //que los otros componentes se sobrepongan a la imagen 
        super.paintChildren(g);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}