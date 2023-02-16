package vista;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import modelo.Producto;
import modelo.Cliente;
import modelo.Compra;
import modelo.Venta;
import observador.ObservadorAux;

/**
 *
 * @author Wilmer Farfán - Fabian Sánchez
 * @version 1.0
 */
public class Ventana extends javax.swing.JFrame {

    private int contClientes;
    private int contProductos;
    private double valorUnidad;
    private double cantidad;
    private double total;
    private String nombreProducto;  

    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnTotal.setEnabled(false);
    }

    public void consultar(int contClientes, int contProductos) {
        Producto producto = new Producto();
        Cliente cliente = new Cliente();

        cliente.setClienteID(contClientes);
        cliente.obtenerCliente();
        producto.setProductoID(contProductos);
        producto.obtenerProducto();

        txtCliente.setText(cliente.getNombre());
        txtProducto.setText(producto.getNombre());
        txtValorUnidad.setText(String.valueOf(producto.getValorUnidad()));
        txtCantidad.setText(String.valueOf(producto.getCantidad()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtValorUnidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        btnVender = new javax.swing.JButton();
        btnTotal = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        btnArqueo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Cliente:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Producto:");

        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Valor Unidad:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Cantidad:");

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarMouseClicked(evt);
            }
        });
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        btnVender.setText("Vender");
        btnVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVenderMouseClicked(evt);
            }
        });
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        btnTotal.setText("Total");
        btnTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTotalMouseClicked(evt);
            }
        });
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnComprar.setText("Comprar");
        btnComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprarMouseClicked(evt);
            }
        });
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        btnArqueo.setText("Arqueo");
        btnArqueo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnArqueoMouseClicked(evt);
            }
        });
        btnArqueo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArqueoActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(txtProducto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValorUnidad, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnArqueo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValorUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTotal)))
                .addGap(18, 18, 18)
                .addComponent(btnArqueo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMouseClicked

        Cliente cliente = new Cliente();

        if (contClientes >= cliente.listarClientes().size()) {
            contClientes = 0;
        }
        if (contProductos >= cliente.listarClientes().size()) {
            contProductos = 0;
        }
        contClientes++;
        contProductos++;

        consultar(contClientes, contProductos);
        btnVender.setEnabled(false);
        txtTotal.setText("");
        btnTotal.setEnabled(true);
        //btnComprar.setEnabled(false);        

    }//GEN-LAST:event_btnConsultarMouseClicked

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed

    }//GEN-LAST:event_txtTotalActionPerformed

    private void btnVenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVenderMouseClicked
        
        ObservadorAux aux = new ObservadorAux("ADMIN");
        Producto producto = new Producto();
        Cliente cliente = new Cliente();
        Compra compra = new Compra();           
        
        try {
            cliente.setClienteID(contClientes);
            cliente.getClienteID();
            producto.setProductoID(contProductos);
            producto.getProductoID();

            cliente.setNombre(txtCliente.getText());
            producto.setNombre(txtProducto.getText());
            producto.setValorUnidad(Double.parseDouble(txtValorUnidad.getText()));
            producto.setCantidad(Double.parseDouble(txtCantidad.getText()));
            producto.disminuirCantidadProducto(contProductos, Double.parseDouble(txtCantidad.getText()));

            btnTotalMouseClicked(evt);

            Venta venta = new Venta(producto.getProductoID(), cliente.getClienteID(), Double.parseDouble(txtCantidad.getText()), total);
            venta.addObserver(aux);
            venta.crearRegistroVenta();          

            JOptionPane.showMessageDialog(rootPane, "Venta Realizada Exitosamente. Se ha registrado en la base de datos.");            
            venta.hacerVenta();
            
            System.out.println("Venta Realizada Exitosamente. Se ha registrado en la base de datos.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Campos vacíos. Se debe calcular el valor total para registrar la venta.", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            System.out.println("ERROR: Campos vacios.");
        }

    }//GEN-LAST:event_btnVenderMouseClicked

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTotalMouseClicked
        valorUnidad = Double.parseDouble(txtValorUnidad.getText());
        cantidad = Double.parseDouble(txtCantidad.getText());
        total = valorUnidad * cantidad;

        // Para cambiar de notacion cientifica a numero normal
        DecimalFormat df = new DecimalFormat("#");
        df.setMaximumFractionDigits(3);

        txtTotal.setText(String.valueOf(df.format(total)));
        System.out.println("Calculo total de $" + df.format(total));
        btnVender.setEnabled(true);
    }//GEN-LAST:event_btnTotalMouseClicked

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTotalActionPerformed

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        txtCliente.setText("");
        txtProducto.setText("");
        txtCantidad.setText("");
        txtValorUnidad.setText("");
        txtTotal.setText("");
        System.out.println("Limpieza Exitosa");
        btnVender.setEnabled(true);
        btnTotal.setEnabled(false);
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprarMouseClicked
        ObservadorAux aux = new ObservadorAux("ADMIN");
        Producto producto = new Producto();
        Cliente cliente = new Cliente();
        Compra compra = new Compra();        
        compra.addObserver(aux);
                
        try {
            compra.setProductoID(contProductos);
            compra.setNombreProducto(txtProducto.getText());                       
            compra.setValorUnidad(Double.parseDouble(txtValorUnidad.getText()));
            compra.setCantidad(Double.parseDouble(txtCantidad.getText()));            

            producto.setProductoID(contProductos);
            producto.obtenerProducto();

            compra.calcularCPP(producto);
            compra.crearRegistroCompra(); 

            JOptionPane.showMessageDialog(rootPane, "Compra Realizada Exitosamente. Se ha registrado en la base de datos.");
            compra.hacerCompra();
            System.out.println("Compra Realizada Exitosamente. Se ha registrado en la base de datos.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Por favor rellene los campos vacíos.", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            System.out.println("ERROR: Campos Vacios.");
        }
    }//GEN-LAST:event_btnComprarMouseClicked

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnArqueoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArqueoMouseClicked
        JOptionPane.showMessageDialog(rootPane, "ATENCIÓN: MODO ARQUEO");
        //txtCantidad.setText("");
        //txtValorUnidad.setText("");
        Producto producto = new Producto();
        valorUnidad = Double.parseDouble(txtValorUnidad.getText());
        cantidad = Double.parseDouble(txtCantidad.getText());
        total = valorUnidad * cantidad;

        producto.setProductoID(contProductos);
        producto.setNombre(txtProducto.getText());
        producto.setValorUnidad(valorUnidad);
        producto.setCantidad(cantidad);
        producto.actualizarProducto();

        System.out.println("ARQUEO Realizado Exitosamente.");

    }//GEN-LAST:event_btnArqueoMouseClicked

    private void btnArqueoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArqueoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArqueoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArqueo;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnTotal;
    private javax.swing.JButton btnVender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtValorUnidad;
    // End of variables declaration//GEN-END:variables
}
