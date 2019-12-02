package proyecto2.java.gui;

import ar.org.centro8.curso.java.utils.swing.Table;
import ar.org.centro8.curso.java.utils.swing.Validator;
import javax.swing.JOptionPane;
import proyecto2.java.connector.Connector;
import proyecto2.java.entities.Editoriales;
import proyecto2.java.interfaces.I_EditorialesRepository;
import proyecto2.java.interfaces.I_LibrosRepository;
import proyecto2.java.repositories.EditorialesRepository;
import proyecto2.java.repositories.LibrosRepository;

public class FormEditoriales extends javax.swing.JInternalFrame {
       I_EditorialesRepository er;
       I_LibrosRepository  lr;
    public FormEditoriales() {
        super(
                "Formulario de editoriales",      //titulo
                false,                           //resizable
                true,                           //closable
                false,                         //maximizable
                true                          //iconable
        );
        
        initComponents();
        er=new EditorialesRepository(Connector.getConnection());
        lr=new LibrosRepository(Connector.getConnection());
        cargar();
    }
    private void cargar() {
        new Table<Editoriales>().cargar(tblEditoriales, er.getAll());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        lblBuscarE = new javax.swing.JLabel();
        txtBuscarE = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEditoriales = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre.setText("Nombre:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar editorial");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lblBuscarE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBuscarE.setText("Buscar editorial:");

        txtBuscarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarEActionPerformed(evt);
            }
        });
        txtBuscarE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarEKeyReleased(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblEditoriales.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblEditoriales);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblBuscarE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBuscarE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblBuscarE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarE, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // Nombre**
        
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Evento agregar
        if(!validar()) return;
        Editoriales editoriales=new Editoriales(
                txtNombre.getText()
            );
        er.save(editoriales);
        JOptionPane.showMessageDialog(this, 
                "Se dio de alta una Editorial id: "+editoriales.getEditorial_id());
        limpiar();
        cargar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtBuscarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarEActionPerformed
        // Evento buscar
        String BuscarA=txtBuscarE.getText();
        if(BuscarA==null) BuscarA="";
        new Table<Editoriales>().cargar(tblEditoriales, er.getLikeNombre(BuscarA));
        
    }//GEN-LAST:event_txtBuscarEActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Evento eliminar
        int index=tblEditoriales.getSelectedRow();
        if(index==-1) return;
        Editoriales editoriales=er.getById(
                Integer.parseInt(tblEditoriales.getValueAt(index, 0)+""));
        if(!lr.getByEditoriales(editoriales).isEmpty()){
            JOptionPane.showMessageDialog(this, 
                    "No se puede borrar la editorial por que tiene libros!");
            return;
        }
        if(JOptionPane.showConfirmDialog(this, 
            "Desea borrar la editorial "+editoriales.getEditorial_id()+" "
                    +editoriales.getNombre()+" " +"?")!=0) 
            return;
        er.remove(editoriales);
        cargar();
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarEKeyReleased
        // Evento Buscar
        String BuscarE=txtBuscarE.getText();
        if(BuscarE==null) BuscarE="";
        new Table<Editoriales>().cargar(tblEditoriales, er.getLikeNombre(BuscarE));
    }//GEN-LAST:event_txtBuscarEKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBuscarE;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tblEditoriales;
    private javax.swing.JTextField txtBuscarE;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private boolean validar() {
     if(!new Validator(txtNombre).length(1, 25)) return false;
    
     return true;
    }

    private void limpiar() {
     txtNombre.setText("");
     txtNombre.requestFocus();
    }
    

    
}
