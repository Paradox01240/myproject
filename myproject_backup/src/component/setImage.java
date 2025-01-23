package component;


import java.awt.AlphaComposite;
import java.awt.Dimension;
import java.awt.Graphics;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;

import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;



public class setImage extends JComponent {

    
    public Icon getImage() {
        return image;
    }

    
    public void setImage(Icon image) {
        this.image = image;
    }

 
   
    private Icon image;
    private BufferedImage bufferedImage;

    
   private void createImage() {
        if (getImage() != null) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                bufferedImage = new BufferedImage(width, height, bufferedImage.TYPE_INT_ARGB);
                Graphics2D g2 = bufferedImage.createGraphics();
                
                g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                Rectangle rec = getAutoSize(getImage());
                g2.drawImage(((ImageIcon) getImage()).getImage(), rec.x, rec.y, rec.width, rec.height, null);
               
                g2.dispose();
            }
        }
    }

 
    
    @Override
    public void setBounds(int i, int i1, int i2, int i3) {
        super.setBounds(i, i1, i2, i3);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createImage();
                repaint();
            }
            
        });
    }
    
    private Rectangle getAutoSize(Icon image) {
        int w = getWidth();
        int h = getHeight();
        int iw = image.getIconWidth();
        int ih = image.getIconHeight();
        double xScale = (double) w / iw;
        double yScale = (double) h / ih;
        double scale = Math.max(xScale, yScale);
        int width = (int) (scale * iw);
        int heigth = (int) (scale * ih);
        
        if (width < 1) {
            width = 1;
        }
        if (heigth < 1) {
            heigth = 1;
        }
        
        int x = (w - width) / 2;
        int y = (h - heigth) / 2;
        
        return new Rectangle(new Point(x, y), new Dimension(width, heigth));
    }
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        if (bufferedImage != null) {
            BufferedImage img = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = img.createGraphics();
           g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
           g2.fill(new RoundRectangle2D.Double(0,0, getWidth(),getHeight(),2,2));
           g2.setComposite(AlphaComposite.SrcIn);
           g2.drawImage(bufferedImage, 0, 0,null);
           g2.dispose();
           grphcs.drawImage(img, 0, 0, null);
           

        }
      
        super.paintComponent(grphcs);
    }
    
    
}
