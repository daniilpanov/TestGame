package main;

import javax.swing.*;

public class Play
{
    private static Play ourInstance = new Play();
    
    public static Play getInstance()
    {
        return ourInstance;
    }
    
    private JFrame frame = Main.frame;
    private JPanel menu = Menu.menu,
            panel = new JPanel();
    
    private Play()
    {
        System.out.println("OK!!!");
    }
    
    public void showPlay()
    {
        menu.setVisible(false);
        panel.setVisible(true);
    }
    
    public void hidePlay()
    {
        menu.setVisible(true);
        panel.setVisible(false);
    }
}
