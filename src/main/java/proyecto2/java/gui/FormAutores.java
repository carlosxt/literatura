package proyecto2.java.gui;

import ar.org.centro8.curso.java.utils.swing.Table;
import ar.org.centro8.curso.java.utils.swing.Validator;
import javax.swing.JOptionPane;
import proyecto2.java.connector.Connector;
import proyecto2.java.entities.Autores;
import proyecto2.java.interfaces.I_AutoresRepository;
import proyecto2.java.interfaces.I_LibrosRepository;
import proyecto2.java.repositories.AutoresRepository;
import proyecto2.java.repositories.LibrosRepository;

public class FormAutores extends javax.swing.JInternalFrame {
    I_AutoresRepository ar;
    I_LibrosRepository lr;
    public FormAutores() {
        super(
                "Formulario de autores",     //titulo
                false,                      //resizable
                true,                       //closable
                false,                      //maximizable
                true                        //iconable
        );
        initComponents();
        
        ar=new AutoresRepository(Connector.getConnection());
        lr=new LibrosRepository(Connector.getConnection());
        cargar();
    }
    
    public void cargar(){
    //cargar tblAutores
        new Table<Autores>().cargar(tblAutores, ar.getAll());
    }
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        lblNacionalidad = new javax.swing.JLabel();
        lblNacimiento = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblDistinciones = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNacimiento = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        txtDistinciones = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        lblBuscarA = new javax.swing.JLabel();
        txtBuscarA = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAutores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre.setText("Nombre:");

        lblNacionalidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNacionalidad.setText("Nacionalidad:");

        lblNacimiento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNacimiento.setText("Año_nacimiento:");

        lblApellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblApellido.setText("Apellido:");

        lblDistinciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDistinciones.setText("Distinciones:");

        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar autores");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lblBuscarA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBuscarA.setText("Buscar autores:");

        txtBuscarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarAActionPerformed(evt);
            }
        });
        txtBuscarA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarAKeyReleased(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblAutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblAutores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                                    .addComponent(txtApellido)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNacimiento)
                                    .addComponent(txtNacionalidad)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDistinciones, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDistinciones)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 48, Short.MAX_VALUE)
                                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(65, 65, 65)))))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBuscarA, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addComponent(jSeparator1)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNacionalidad)
                    .addComponent(lblNacionalidad, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDistinciones)
                        .addGap(14, 14, 14)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDistinciones, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBuscarA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBuscarA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Evento Eliminar
        int index=tblAutores.getSelectedRow();
        if(index==-1) return;
        Autores autores=ar.getById(
                Integer.parseInt(tblAutores.getValueAt(index, 0)+""));
        if(!lr.getByAutores(autores).isEmpty()){
            JOptionPane.showMessageDialog(this, 
                    "No se puede borrar el autor por que tiene libros!");
            return;
        }
        if(JOptionPane.showConfirmDialog(this, 
            "Desea borrar el autor "+autores.getAutor_id()+" "+autores.getNombre()+" "
                    +autores.getApellido()+" "+autores.getNacionalidad()+" "
                    +autores.getDistinciones()+"?")!=0) 
            return;
        ar.remove(autores);
        cargar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Evento agregar
        if(!validar()) return;
        Autores autores=new Autores(
                txtNombre.getText(), 
                txtApellido.getText(), 
                Integer.parseInt(txtNacimiento.getText()),
                txtNacionalidad.getText(),
                txtDistinciones.getText()
               
        );
        ar.save(autores);
        JOptionPane.showMessageDialog(this, 
                "Se dio de alta un Autor id: "+autores.getAutor_id());
        limpiar();
        cargar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtBuscarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarAActionPerformed
       
    }//GEN-LAST:event_txtBuscarAActionPerformed

    private void txtBuscarAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarAKeyReleased
      // Evento buscar
        String BuscarA=txtBuscarA.getText();
        if(BuscarA==null) BuscarA="";
        new Table<Autores>().cargar(tblAutores, ar.getLikeNombre(BuscarA));
    }//GEN-LAST:event_txtBuscarAKeyReleased

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblBuscarA;
    private javax.swing.JLabel lblDistinciones;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tblAutores;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscarA;
    private javax.swing.JTextField txtDistinciones;
    private javax.swing.JTextField txtNacimiento;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
       txtNombre.setText("");
        txtApellido.setText("");
        txtNacimiento.setText("");
        txtNacionalidad.setText("");
        txtDistinciones.setText("");
        txtNombre.requestFocus();
    }

    private boolean validar() {
     if(!new Validator(txtNombre).length(3, 25)) return false;
     if(!new Validator(txtApellido).length(3, 25)) return false;
     if(!new Validator(txtNacimiento).isInteger(0, 2030)) return false;
     if(!new Validator(txtNacionalidad).length(3, 25)) return false;
     if(!new Validator(txtDistinciones).length(3, 25)) return false;
     
     return true;
    }

  
}
