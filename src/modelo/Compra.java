/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import observador.Observer;
import persistencia.ConexionBD;

/**
 *
 * @author Wilmer Farfán - Fabian Sánchez
 * @version 1.0
 */

public class Compra {
    
    private List<Observer> observers;
    
    private int compraID;
    private int productoID;
    private String nombreProducto;
    private double valorUnidad;
    private double cantidad;
    
    private double cpp;
    private double cpp2;

    public Compra(int compraID, String nombreProducto, double valorUnidad, double cantidad) {
        this.compraID = compraID;
        this.nombreProducto = nombreProducto;
        this.valorUnidad = valorUnidad;
        this.cantidad = cantidad;
    }

    public Compra() {
        this.observers = new ArrayList<>();
    }

    public int getCompraID() {
        return compraID;
    }
    public void setCompraID(int compraID) {
        this.compraID = compraID;
    }

    public int getProductoID() {
        return productoID;
    }
    public void setProductoID(int productoID) {
        this.productoID = productoID;
    }   
    
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getValorUnidad() {
        return valorUnidad;
    }
    public void setValorUnidad(double valorUnidad) {
        this.valorUnidad = valorUnidad;
    }

    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    // ProductoBD = producto ya existente en la BD / productoNuevo = producto auxiliar  
    public void calcularCPP(Producto productoBD) {
        productoBD.getProductoID();
        productoBD.obtenerProducto();
        cpp = ((productoBD.getCantidad() * productoBD.getValorUnidad()) + (cantidad * valorUnidad));
        cpp2 = (productoBD.getCantidad() + cantidad);
        cpp = cpp/cpp2;
        
        productoBD.setCantidad(cpp2);
        productoBD.setValorUnidad(cpp);
        //Insercion a la base de datos
        productoBD.actualizarProducto();
    }   

      
    //@Override para implementar con interfaces
    public boolean crearRegistroCompra() {
        boolean exito = false;
        ConexionBD conexion = new ConexionBD();
        String SQL = "INSERT INTO inventarios.compra\n" 
                +"(productoID, nombreProducto, valorUnidad, cantidad)\n" 
                +"VALUES("+this.productoID+", '"+this.nombreProducto+"', "+this.valorUnidad+", "+this.cantidad+");";        
        
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
        System.out.println("Se ha realizado una nueva compra");
        return exito;
    }
    
    public void hacerCompra() {
        String message = "Compra realizada: " + getNombreProducto() + ". Cantidad: " + getCantidad();
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
