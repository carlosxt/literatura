package proyecto2.java.gui;



public class Libros extends javax.swing.JFrame {
    public Libros() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblEditorial = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        txtGenero = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        lblBuscar = new javax.swing.JLabel();
        txtBuscarli = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(9, 236, 88));
        lblNombre.setText("Nombre:");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        lblGenero.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(9, 236, 88));
        lblGenero.setText("Genero:");
        getContentPane().add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 80, 30));

        lblEditorial.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblEditorial.setForeground(new java.awt.Color(9, 236, 88));
        lblEditorial.setText("Editorial:");
        getContentPane().add(lblEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        lblAutor.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblAutor.setForeground(new java.awt.Color(9, 236, 88));
        lblAutor.setText("Autor:");
        getContentPane().add(lblAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        btnAgregar.setBackground(new java.awt.Color(43, 34, 65));
        btnAgregar.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(21, 96, 47));
        btnAgregar.setText("Agregar libro");
        btnAgregar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 190, 40));

        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
            }
        });
        getContentPane().add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 330, 30));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 330, 30));

        txtEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditorialActionPerformed(evt);
            }
        });
        getContentPane().add(txtEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 330, 30));

        txtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorActionPerformed(evt);
            }
        });
        getContentPane().add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 330, 30));

        lblBuscar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblBuscar.setForeground(new java.awt.Color(9, 236, 88));
        lblBuscar.setText("Buscar libro:");
        getContentPane().add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        txtBuscarli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarliActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuscarli, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 280, 30));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 120, 30));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2/java/gui/libros.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 664));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
         
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditorialActionPerformed

    private void txtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutorActionPerformed

    private void txtBuscarliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarliActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblEditorial;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtBuscarli;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
