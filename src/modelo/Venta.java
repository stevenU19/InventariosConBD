
package modelo;

/**
 *
 * @author Wilmer Farfán - Fabian Sánchez
 * @version 1.0
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import observador.Observer;
import persistencia.ConexionBD;

public class Venta {
    
    private List<Observer> observers;
    
    private int ventaID;
    private int productoID;
    private int clienteID;
    private double cantidad;
    private double total;

    public Venta(int productoID, int clienteID, double cantidad, double total) {
        this.productoID = productoID;
        this.clienteID = clienteID;
        this.cantidad = cantidad;
        this.total = total;
        this.observers = new ArrayList<>();
    }    

    public Venta(int idVenta) {
        this.ventaID = idVenta;
    }

    public Venta() {
        this.observers = new ArrayList<>();
    }

    // ----------- Métodos Getter y Setter -----------  
    public int getIdVenta() {
        return ventaID;
    }
    public void setIdVenta(int idVenta) {
        this.ventaID = idVenta;
    }

    public int getVentaID() {
        return ventaID;
    }
    public void setVentaID(int ventaID) {
        this.ventaID = ventaID;
    }

    public int getProductoID() {
        return productoID;
    }
    public void setProductoID(int productoID) {
        this.productoID = productoID;
    }

    public int getClienteID() {
        return clienteID;
    }
    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }

    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

    
    
    //@Override para implementar con interfaces
    public boolean crearRegistroVenta() {
        boolean exito = false;
        ConexionBD conexion = new ConexionBD();
        String SQL = "INSERT INTO inventarios.venta\n" 
                + "(productoID, clienteID, cantidad, total)\n" 
                + "VALUES("+this.productoID+", "+this.clienteID+", "+this.cantidad+", "+this.total+");";      
        
        if (conexion.setAutoCommitBD(false)) {
            if (conexion.insertarBD(SQL)) {
                conexion.commitBD();
                conexion.cerrarConexion();
                exito = true;
            } else {
                conexion.cerrarConexion();
            }

        } else {
            conexion.cerrarConexion();
        }
        System.out.println("Se ha creado una nueva venta");
        return exito;
    }
    
    public void hacerVenta() {
        String message = "Venta realizada: " + getVentaID() + ". Cantidad: " + getTotal();
        notifyObservers(message);
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
    
}
