/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author truon
 */
public class DiaLog {
    // hiển thị thông báo
    
    public static void alert(Component parent, String message) {
        JOptionPane.showMessageDialog(parent, message,
                "Áo Sơ Mi Nam", JOptionPane.INFORMATION_MESSAGE);
    }
}
