package com.example.awtExample;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Roberto Affonso, created on 04/01/18
 **/

public class MyWindow extends Frame {

    public MyWindow(String title) throws HeadlessException {
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(1);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
        g.setFont(sansSerifLarge);
        g.drawString("The complete", 60, 60);
        g.setFont(sansSerifSmall);
        g.drawString("lolololol", 60, 100);
    }
}
