/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sebasdev.u2lab1_ssrc;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class U2LAB1_SSRC {
    public static void main(String[] args) {
        /* SwingUtilities.invokeLater(()->{
            JFrame frame = new JFrame("Sistema");
            frame.getContentPane().add(new FormPersona());
            frame.pack();
            frame.setLocation(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });*/
       MenuPrincipal secion =new MenuPrincipal();
       secion.setVisible(true);
        //MenuPrincipal menu = new MenuPrincipal();
        //menu.setVisible(true);
    }
}