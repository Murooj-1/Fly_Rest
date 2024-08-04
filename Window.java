/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window extends JFrame {

    JLabel L1;

    public Window(String title, String Picture) {

        setTitle(title);
        setSize(2000, 2000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setVisible(true);
        setContentPane(new JLabel(new ImageIcon(Picture)));
        setLayout(new FlowLayout());
        L1 = new JLabel();
        add(L1);
        setSize(2000, 2000);

    }

}
