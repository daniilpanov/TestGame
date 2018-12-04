package play;

import javax.swing.*;
import java.awt.*;

public class Sprite
{
    public int x, y,
            width, height;
    public Image sprite;
    private JComponent parent;
    private Graphics g;
    
    public Sprite (Image sprite, int x, int y, JComponent parent, Graphics g)
    {
        this.sprite = sprite;
        this.width = sprite.getWidth(null);
        this.height = sprite.getHeight(null);
        this.x = x;
        this.y = y;
        this.parent = parent;
        this.g = g;
    }
    
    /* This method DON'T WORK!
    public void drawSprite()
    {
        g.drawImage(sprite, x, y, null);
    }*/
    
    public void updateSprite()
    {
        this.parent.repaint();
    }
    
    public void updateImageSprite(Image sprite)
    {
        if (sprite == null)
        {
            deleteSprite();
        }
        else
        {
            this.sprite = sprite;
            this.updateSprite();
        }
    }
    
    public void deleteSprite()
    {
        sprite = null;
        updateSprite();
    }
}
