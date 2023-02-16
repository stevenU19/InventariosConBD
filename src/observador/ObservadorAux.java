/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observador;

import javax.swing.JOptionPane;

/**
 *
 * @author RYZEN 5 5600G
 */
public class ObservadorAux implements Observer {

    private String name;

    public ObservadorAux(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        JOptionPane.showMessageDialog(null, name + " ha recibido una notificación: " + message);
        System.out.println(name + " ha recibido una notificación: " + message);
    }

}
