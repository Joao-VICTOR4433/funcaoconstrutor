package org.example;
import javax.swing.JOptionPane;
public class espanha {
    public static void main(String[]args){
        String name=
                JOptionPane.showInputDialog("Qual seu nome");
        String message=
                String.format("Welcome,"+name+"!");
        JOptionPane.showMessageDialog(null,message);

    }
}