package component;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class dialogform extends javax.swing.JPanel {

    /**
     * @return the color1
     */
    public Color getColor1() {
        return color1;
    }

    /**
     * @param color1 the color1 to set
     */
    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    /**
     * @return the color2
     */
    public Color getColor2() {
        return color2;
    }

    /**
     * @param color2 the color2 to set
     */
    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    /**
     * @return the borderColor
     */
    public Color getBorderColor() {
        return borderColor;
    }

    /**
     * @param borderColor the borderColor to set
     */
    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

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

    /**
     * @return the BasicStroke
     */
    public int getBasicStroke() {
        return BasicStroke;
    }

    /**
     * @param BasicStroke the BasicStroke to set
     */
    public void setBasicStroke(int BasicStroke) {
        this.BasicStroke = BasicStroke;
    }

    private Color baseColor = new Color(144, 238, 144); // Eco-green base color
    private Color hoverColor = new Color(102, 205, 170); // Lighter green on hover

    private Color color1 = new Color(34, 139, 34, 28);
    private Color color2 = new Color(173, 255, 47);
    private Color borderColor = new Color(144, 238, 144);
    private int dig1 = 0;
    private int BasicStroke = 2;

    public dialogform() {
        initComponents();
        setBackground(new Color(34, 139, 34, 0)); // Transparent background

        // Hover effect
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                baseColor = hoverColor;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                baseColor = new Color(144, 238, 144);
                repaint();
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        super.paintComponent(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Background Gradient
        GradientPaint gradient = new GradientPaint(
                0, 0, getColor2(), // Lighter green
                0, getHeight(), getColor1() // Darker green
        );
        g2.setPaint(gradient);

        int arcWidth = getHeight();  // Full height for fully rounded corners
        int arcHeight = getHeight();

        // Draw the rounded rectangle
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), arcWidth, arcHeight);

        // Draw inner shadow
        g2.setColor(new Color(0, 100, 0, 30));  // Dark green shadow
        g2.fillRoundRect(3, 3, getWidth() - 6, getHeight() - 6, arcWidth - 6, arcHeight - 6);

        // Draw border (optional)
        g2.setStroke(new BasicStroke(getBasicStroke()));
        g2.setColor(getBorderColor());  // Border color
        g2.drawRoundRect(1, 1, getWidth() - 2, getHeight() - 2, arcWidth, arcHeight);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
