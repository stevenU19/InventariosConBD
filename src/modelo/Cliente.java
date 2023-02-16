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

public class Cliente {

    private int clienteID;
    private String nombreCliente;

    public Cliente() {
        
    }    
    
    public Cliente(String nombre) {
        this.nombreCliente = nombre;
    }

    // ----------- Métodos Getter y Setter -----------  
    public int getClienteID() {
        return clienteID;
    }
    public void setClienteID(int idCliente) {
        this.clienteID = idCliente;
    }    
    

    public String getNombre() {
        return nombreCliente;
    }
    public void setNombre(String nombre) {
        this.nombreCliente = nombre;
    }
    
    //@Override para implementar con interfaces
    // Consultar a un cliente en la base de datos
    public Cliente obtenerCliente() {
        ConexionBD conexion = new ConexionBD();
        String SQL = "SELECT * FROM Inventarios.cliente WHERE clienteID=" + clienteID + ";";

        try {
            ResultSet rs = conexion.consultarBD(SQL);
            if (rs.next()) {
                clienteID = rs.getInt("clienteID");
                nombreCliente = rs.getString("nombreCliente");
            }
        } catch (Exception ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexion.cerrarConexion();
        }
        return this;
    }
    
    //Listado de los clientes
    public List<Cliente> listarClientes() {
        String SQL = "SELECT * FROM Inventarios.cliente";
        ConexionBD conexion = new ConexionBD();
        List<Cliente> listaClientes = new ArrayList<>();
        //int contadorClientes = 0;
        
        Cliente c = null;

        try {
            ResultSet rs = conexion.consultarBD(SQL);
            while (rs.next()) {
                c = new Cliente();                                   
                c.setClienteID(rs.getInt("clienteID"));
                c.setNombre(rs.getString("nombreCliente"));
                //contadorClientes++;
                listaClientes.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexion.cerrarConexion();
        }
        return listaClientes;
    }

}
