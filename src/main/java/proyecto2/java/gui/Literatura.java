package proyecto2.java.gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Literatura extends javax.swing.JFrame {
    public Literatura() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuVentanas = new javax.swing.JMenu();
        mniAutores = new javax.swing.JMenuItem();
        mniEditoriales = new javax.swing.JMenuItem();
        mniLibros = new javax.swing.JMenuItem();
        mnuOpciones = new javax.swing.JMenu();
        mniAcerca = new javax.swing.JMenuItem();
        mniSalir = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuVentanas.setText("Ventanas");

        mniAutores.setText("Autores");
        mniAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAutoresActionPerformed(evt);
            }
        });
        mnuVentanas.add(mniAutores);

        mniEditoriales.setText("Editoriales");
        mniEditoriales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEditorialesActionPerformed(evt);
            }
        });
        mnuVentanas.add(mniEditoriales);

        mniLibros.setText("Libros");
        mniLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLibrosActionPerformed(evt);
            }
        });
        mnuVentanas.add(mniLibros);

        jMenuBar1.add(mnuVentanas);

        mnuOpciones.setText("Opciones");

        mniAcerca.setText("Acerca de");
        mniAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAcercaActionPerformed(evt);
            }
        });
        mnuOpciones.add(mniAcerca);

        mniSalir.setText("Salir");
        mniSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSalirActionPerformed(evt);
            }
        });
        mnuOpciones.add(mniSalir);

        jMenuBar1.add(mnuOpciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAutoresActionPerformed
        // Evento FormAutores
        FormAutores autores=new FormAutores();
        desktop.add(autores);
        autores.setVisible(true);
    }//GEN-LAST:event_mniAutoresActionPerformed

    private void mniEditorialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEditorialesActionPerformed
        // Evento FormEditoriales
        FormEditoriales editoriales=new FormEditoriales();
        desktop.add(editoriales);
        editoriales.setVisible(true);
    }//GEN-LAST:event_mniEditorialesActionPerformed

    private void mniLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLibrosActionPerformed
        // Evento FormLibros
        FormLibros libros=new FormLibros();
        desktop.add(libros);
        libros.setVisible(true);
    }//GEN-LAST:event_mniLibrosActionPerformed

    private void mniAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAcercaActionPerformed
        // Evento Acerca
        JOptionPane.showMessageDialog(this, "Acá podrás encontrar y conocer sobre tus autores favoritos" );
    }//GEN-LAST:event_mniAcercaActionPerformed

    private void mniSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalirActionPerformed
        // Evento Salir
        System.exit(0);
    }//GEN-LAST:event_mniSalirActionPerformed
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Literatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mniAcerca;
    private javax.swing.JMenuItem mniAutores;
    private javax.swing.JMenuItem mniEditoriales;
    private javax.swing.JMenuItem mniLibros;
    private javax.swing.JMenuItem mniSalir;
    private javax.swing.JMenu mnuOpciones;
    private javax.swing.JMenu mnuVentanas;
    // End of variables declaration//GEN-END:variables
}
