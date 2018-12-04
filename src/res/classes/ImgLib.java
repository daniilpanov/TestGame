package res.classes;

import javax.swing.*;
import java.awt.*;

public class ImgLib
{
    private static final String PATH = "res/img/";
    public static Image
            bullet = getImage("bullet");
            
    private static Image getImage(String name)
    {
        return new ImageIcon(PATH + name + ".png").getImage();
    }
}
