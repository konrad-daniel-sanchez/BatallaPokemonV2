/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package presentacion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author danielsanchez
 */
public class AtaquePanel2 extends javax.swing.JPanel {

    /**
     * Creates new form AtaquePanel2
     */
    public AtaquePanel2() {
        initComponents();
        this.setPreferredSize(new Dimension(100, 100));
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

    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Capa primaria (base del ataque, en azul oscuro)
        g2d.setColor(new Color(0, 100, 255, 180)); // Azul oscuro, semi-transparente
        g2d.fillOval(20, 20, 60, 60);

        // Capa secundaria (parte más clara)
        g2d.setColor(new Color(0, 150, 255, 200)); // Azul más claro, semi-transparente
        g2d.fillOval(25, 25, 50, 50);

        // Capa central (azul celeste brillante)
        g2d.setColor(new Color(0, 200, 255, 220)); // Azul celeste, semi-transparente
        g2d.fillOval(30, 30, 40, 40);

        // Puntas del ataque (pequeñas llamas alrededor)
        g2d.setColor(new Color(0, 80, 255, 150)); // Azul muy claro, semi-transparente
        g2d.fillOval(35, 10, 15, 25);
        g2d.fillOval(50, 5, 20, 30);
        g2d.fillOval(65, 10, 15, 25);

        // Líneas adicionales para simular movimiento del ataque
        g2d.setColor(new Color(0, 50, 255, 180)); // Azul oscuro, semi-transparente
        g2d.drawLine(50, 50, 60, 15);
        g2d.drawLine(60, 50, 70, 15);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
