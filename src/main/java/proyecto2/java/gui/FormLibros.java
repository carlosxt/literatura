package proyecto2.java.gui;


import ar.org.centro8.curso.java.utils.swing.Table;
import ar.org.centro8.curso.java.utils.swing.Validator;
import javax.swing.JOptionPane;
import proyecto2.java.connector.Connector;
import proyecto2.java.entities.Autores;
import proyecto2.java.entities.Editoriales;
import proyecto2.java.entities.Libros;
import proyecto2.java.interfaces.I_AutoresRepository;
import proyecto2.java.interfaces.I_EditorialesRepository;
import proyecto2.java.interfaces.I_LibrosRepository;
import proyecto2.java.repositories.AutoresRepository;
import proyecto2.java.repositories.EditorialesRepository;
import proyecto2.java.repositories.LibrosRepository;

public class FormLibros extends javax.swing.JInternalFrame {
    private I_AutoresRepository ar;
    private I_EditorialesRepository er;
    private I_LibrosRepository lr;
    public FormLibros() {
        super(
                "Formulario de libros",    //titulo
                false,                      //resizable
                true,                       //closable
                false,                      //maximizable
                true                        //iconable
        );
        initComponents();
        
        ar=new AutoresRepository(Connector.getConnection());
        er=new EditorialesRepository(Connector.getConnection());
        lr=new LibrosRepository(Connector.getConnection());
        cargar();
    }
    public void cargar(){
        
        //cargar cmbEditorial
        cmbEditorial.removeAllItems();
        er.getAll().forEach(cmbEditorial::addItem);
        
        //cargar cmbAutor
        cmbAutor.removeAllItems();
        ar.getAll().forEach(cmbAutor::addItem);
     
        //Cargar tbl Libros
        new Table<Libros>().cargar(tblLibros, lr.getAll());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblNombre = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblEditorial = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btnAgregar = new javax.swing.JButton();
        cmbEditorial = new javax.swing.JComboBox<>();
        cmbAutor = new javax.swing.JComboBox<>();

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

        lblGenero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGenero.setText("Genero:");

        lblEditorial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEditorial.setText("Editorial:");

        lblAutor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAutor.setText("Autor:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBuscar.setText("Buscar libros:");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblLibros);

        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar libro");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        cmbEditorial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                .addComponent(lblAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                                .addComponent(txtNombre)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbEditorial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbAutor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(1, 1, 1))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbAutor)
                        .addGap(8, 8, 8)))
                .addGap(17, 17, 17)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
         String buscar=txtBuscar.getText();
        if(buscar==null) buscar="";
        new Table<Libros>().cargar(tblLibros, lr.getLikeNombre_libro(buscar));    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
         if(!validar()) return;
                
                Libros libros=new Libros(
                txtNombre.getText(), 
                txtGenero.getText(), 
                this.cmbEditorial.getItemAt(cmbEditorial.getSelectedIndex()).getEditorial_id(),
                cmbAutor.getItemAt(cmbAutor.getSelectedIndex()).getAutor_id()
                
        );
        lr.save(libros);
        JOptionPane.showMessageDialog(this, 
                "Se dio de alta un Libro id: "+libros.getLibro_id());
        limpiar();
        cargar();    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       //Evento eliminar
        int index=tblLibros.getSelectedRow();
        if(index==-1) return;
        Libros libros=lr.getById(
                Integer.parseInt(tblLibros.getValueAt(index, 0)+""));
        
        if(JOptionPane.showConfirmDialog(this, 
            "Confirmar eliminación de Libro "+libros.getLibro_id()+" "+libros.getNombre_libro()+" "
                    +libros.getGenero_libro()+" "+libros.getEditorial_id()+" "
                    +libros.getAutor_id()+"?")!=0) 
            return;
        lr.remove(libros);
        cargar();    }//GEN-LAST:event_btnEliminarActionPerformed
  
        public void limpiar(){
        txtNombre.setText("");
        txtGenero.setText("");
        txtNombre.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<Autores> cmbAutor;
    private javax.swing.JComboBox<Editoriales> cmbEditorial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblEditorial;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tblLibros;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private boolean validar() {
      if(!new Validator(txtNombre).length(1, 30)) return false;
      
      if(!new Validator(txtGenero).length(1,30))  return false;
    
      return true;
    }
}
