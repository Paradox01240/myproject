/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package component;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;

/**
 *
 * @author Tharusha
 */
public class Card2 extends javax.swing.JPanel {
 /**
     * @return the dig1
     */
    public int getDig1() {
        return dig1;
    }

    /**
     * @param dig1 the dig1 to set
     */
    public void setDig1(int dig1) {
        this.dig1 = dig1;
    }
 public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    private Color color1;
    private Color color2;
    private int dig1 = 0;

    public Card2() {
        initComponents();
        color1 = new Color(41, 194, 33, 68);
        color2 = new Color(164, 255, 2, 70);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        model_Card1 = new component.Model_Card();

        setOpaque(false);

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
protected void paintComponent(Graphics grphcs) {
    Graphics2D g2 = (Graphics2D) grphcs;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    // Radial Gradient with Green Tones
    int centerX = getWidth() / 2;
    int centerY = getHeight() / 2;
    float radius = Math.min(getWidth(), getHeight());
    RadialGradientPaint radialPaint = new RadialGradientPaint(
        centerX, centerY, radius,
        new float[]{0.0f, 1.0f},
        new Color[]{new Color(144, 238, 144), new Color(34, 139, 34)}  // Light Green to Dark Green
    );
    g2.setPaint(radialPaint);
    g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);

    // Shadow Effect
    g2.setColor(new Color(0, 100, 0, 80));  // Dark Green Shadow
    g2.fillRoundRect(10, 10, getWidth() - 20, getHeight() - 20, 20, 20);

    // Adding a glossy effect
    GradientPaint glossyEffect = new GradientPaint(
        0, 0, new Color(255, 255, 255, 120),
        0, getHeight() / 2, new Color(255, 255, 255, 0)
    );
    g2.setPaint(glossyEffect);
    g2.fillRoundRect(0, 0, getWidth(), getHeight() / 2, 20, 20);

    // Adding wave pattern at the top
    g2.setColor(new Color(255, 255, 255, 80));
    int waveHeight = 30;
    int[] xPoints = {0, getWidth(), getWidth(), 0};
    int[] yPoints = {waveHeight, 0, getHeight() / 3, getHeight() / 2 - waveHeight};
    g2.fillPolygon(xPoints, yPoints, 4);

    // Adding a second, smaller wave for depth
    g2.setColor(new Color(255, 255, 255, 60));
    int[] xPoints2 = {0, getWidth(), getWidth(), 0};
    int[] yPoints2 = {waveHeight + 10, 10, getHeight() / 3 + 10, getHeight() / 2 - waveHeight + 10};
    g2.fillPolygon(xPoints2, yPoints2, 4);

    super.paintComponent(grphcs);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.Model_Card model_Card1;
    // End of variables declaration//GEN-END:variables
}
