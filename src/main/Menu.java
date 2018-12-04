package main;

import play.Play;

import javax.swing.*;
import java.awt.*;

public class Menu extends JPanel
{
    private JFrame frame = Main.frame;
    private JButton b_start = new JButton("Start");
    
    public static JPanel menu;
    
    public Menu()
    {
        this.setLayout();
        this.addActionListener();
        
        frame.getContentPane().add(this, BorderLayout.CENTER);
        
        menu = this;
    }
    
    private void setLayout()
    {
        GroupLayout layout = new GroupLayout(this);
        
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        
        layout.setHorizontalGroup(layout.createSequentialGroup().addComponent(b_start));
        
        layout.linkSize(SwingConstants.CENTER, b_start);
        
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup()
                        .addComponent(b_start)));
        
        setLayout(layout);
    }
    
    private void addActionListener()
    {
        b_start.addActionListener(e ->
                Play.getInstance().showPlay());
    }
}
