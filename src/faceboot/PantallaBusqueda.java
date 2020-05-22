package faceboot;

import entidades.Post;
import entidades.Usuario;
import implementations.PostRepositoryImpl;
import implementations.UsuarioRepositoryImpl;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.types.ObjectId;
import persistence.PostRepository;
import persistence.UsuarioRepository;

public class PantallaBusqueda extends javax.swing.JFrame {

    Faceboot fb;

    public PantallaBusqueda(Faceboot fb) {
        initComponents();
        this.fb = fb;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campoTag = new javax.swing.JTextField();
        botonBuscarTag = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPosts = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonCerrar.setText("Cerrar");
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(botonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 367, -1, -1));

        jLabel1.setText("Intrododuzca el tag a buscar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 48, -1, -1));
        jPanel1.add(campoTag, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 69, 138, -1));

        botonBuscarTag.setText("Buscar");
        botonBuscarTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarTagActionPerformed(evt);
            }
        });
        jPanel1.add(botonBuscarTag, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 106, -1, -1));

        jLabel2.setText("Posts relacionados");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 48, -1, -1));

        tablaPosts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Autor", "Post", "Tags"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPosts);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 69, -1, 259));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        fb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void botonBuscarTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarTagActionPerformed
        if (!campoTag.getText().equals("")) {

            PostRepository rp = new PostRepositoryImpl();

            DefaultTableModel tm = (DefaultTableModel) tablaPosts.getModel();
            int rowCount = tm.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {

                tm.removeRow(i);

            }
            
            
            UsuarioRepository ru = new UsuarioRepositoryImpl();

           

            ArrayList<Post> posts = rp.getAllWithTag(campoTag.getText());
            if(posts.isEmpty()){
            JOptionPane.showMessageDialog(this, "No se encontrá ningun post con este tag.");
            return;
            }
            
            for (int i = 0; i < posts.size(); i++) {
                tm = (DefaultTableModel) tablaPosts.getModel();
                Object[] objs = {ru.find(posts.get(i).getUsuario()).getNombre(), posts.get(i).getMensaje(), posts.get(i).getTags()};
                tm.addRow(objs);
            }

        }
    }//GEN-LAST:event_botonBuscarTagActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarTag;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JTextField campoTag;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPosts;
    // End of variables declaration//GEN-END:variables
}
