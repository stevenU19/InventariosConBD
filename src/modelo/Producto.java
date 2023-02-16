
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.ConexionBD;

/**
 *
 * @author Wilmer Farfán - Fabian Sánchez
 * @version 1.0
 */

public class Producto {
    
    private int productoID;
    private String nombreProducto;
    private double valorUnidad;
    private double cantidad;

    public Producto() {
        
    }   

    public Producto(int productoID) {
        this.productoID = productoID;
    }      
    
    public Producto(String nombre, double valorUnidad, double cantidad) {
        this.nombreProducto = nombre;
        this.valorUnidad = valorUnidad;
        this.cantidad = cantidad;
    }
    
    // ----------- Métodos Getter y Setter -----------  
    public int getProductoID() {
        return productoID;
    }
    public void setProductoID(int idProducto) {
        this.productoID = idProducto;
    }    
    

    public String getNombre() {
        return nombreProducto;
    }
    public void setNombre(String nombre) {
        this.nombreProducto = nombre;
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
    
    // ---------------- FUNCIONES ----------------
    
    public boolean insertarProductoBD() {
        boolean exito = false;
        ConexionBD conexion = new ConexionBD();
        String sql = "INSERT INTO inventarios.producto\n" 
                +"(nombreProducto, valorUnidad, cantidad)\n" 
                +"VALUES('"+this.nombreProducto+"', "+this.valorUnidad+", "+this.cantidad+");";
        if (conexion.setAutoCommitBD(false)) {
            if (conexion.insertarBD(sql)) {
                conexion.commitBD();
                conexion.cerrarConexion();
                exito = true;
            } else {
                conexion.rollbackBD();
                conexion.cerrarConexion();
            }
        } else {
            conexion.cerrarConexion();
        }

        return exito;
    }
    
    //@Override para implementar con interfaces
    public Producto obtenerProducto() {
        ConexionBD conexion = new ConexionBD();
        String SQL = "SELECT * FROM Inventarios.producto WHERE productoID=" + productoID + ";";

        try {
            ResultSet rs = conexion.consultarBD(SQL);
            if (rs.next()) {
                nombreProducto = rs.getString("nombreProducto");
                valorUnidad = rs.getDouble("valorUnidad");
                cantidad = rs.getDouble("cantidad");
            }
        } catch (Exception ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexion.cerrarConexion();
        }
        return this;
    }
        
    //@Override para implementar con interfaces
    public boolean actualizarProducto() {
        boolean exito = false;
        String SQL = "UPDATE inventarios.producto\n" 
                +"SET nombreProducto='"+this.nombreProducto+"', valorUnidad="+this.valorUnidad+", cantidad="+this.cantidad+"\n" 
                +"WHERE productoID="+this.productoID+";";        
        ConexionBD conexion = new ConexionBD();
        if (conexion.setAutoCommitBD(false)) {
            if (conexion.actualizarBD(SQL)) {
                conexion.commitBD();
                exito = true;
            } else {
                conexion.rollbackBD();
                conexion.cerrarConexion();
            }
        } else {
            conexion.cerrarConexion();
        }
        return exito;
    }
    
    //@Override para implementar con interfaces
    public boolean disminuirCantidadProducto(int id, double c) {
        boolean exito = false;      
        double cant = obtenerCantidad(id) - c;
        String SQL = "UPDATE inventarios.producto\n" 
                +"SET cantidad="+cant+"\n" 
                +"WHERE productoID="+id+";";        
        
        ConexionBD conexion = new ConexionBD();
        if (conexion.setAutoCommitBD(false)) {
            if (conexion.actualizarBD(SQL)) {
                conexion.commitBD();
                exito = true;
            } else {
                conexion.rollbackBD();
                conexion.cerrarConexion();
            }
        } else {
            conexion.cerrarConexion();
        }
        return exito;
    }
    
    //@Override para implementar con interfaces
    public boolean aumentarCantidadProducto(int id, double c) {
        boolean exito = false;      
        double cant = obtenerCantidad(id) + c;

        String SQL = "UPDATE inventarios.producto\n" 
                +"SET cantidad="+cant+"\n" 
                +"WHERE productoID="+id+";";     
             
        ConexionBD conexion = new ConexionBD();
        if (conexion.setAutoCommitBD(false)) {
            if (conexion.actualizarBD(SQL)) {
                conexion.commitBD();
                exito = true;
            } else {
                conexion.rollbackBD();
                conexion.cerrarConexion();
            }
        } else {
            conexion.cerrarConexion();
        }
        return exito;
    }
    
    //Consultar la cantidad de producto a la BD
    public double obtenerCantidad(int id) {
        ConexionBD conexion = new ConexionBD();
        String SQL = "SELECT * FROM Inventarios.producto WHERE productoID=" + id + ";";

        try {
            ResultSet rs = conexion.consultarBD(SQL);
            if (rs.next()) {
                cantidad = rs.getDouble("cantidad");
            }
        } catch (Exception ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexion.cerrarConexion();
        }
        return cantidad;
    }
    
    
}
