/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamer.fish;

import java.awt.BorderLayout;

/**
 *
 * @author andre
 */
public class GamerFish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestFrame f = new TestFrame();
        f.setLayout(new BorderLayout());    // allows the panel to auto-fill the frame        
        TestPanel p = new TestPanel();                        
        f.add(p);
        f.pack();        
        f.setSize(900, 900);                // must set last, otherwise pack resizes the frame
        f.setVisible(true);
        // TODO code application logic here
    }
    
}
