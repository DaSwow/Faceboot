package faceboot;

import entidades.Post;
import entidades.Usuario;
import implementations.PostRepositoryImpl;
import implementations.UsuarioRepositoryImpl;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;
import org.bson.types.ObjectId;
import persistence.PostRepository;
import persistence.UsuarioRepository;

public class PantallaPost extends javax.swing.JFrame {

    Faceboot fb;

    public PantallaPost(Faceboot fb) {
        initComponents();
        poblarTablaUsuarios();
        poblarTablaPosts();
        this.fb = fb;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonCerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        botonSeleccionarUsuario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoNombreUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaTags = new javax.swing.JList<>();
        campoMensaje = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoTag = new javax.swing.JTextField();
        botonAgregarTag = new javax.swing.JButton();
        botonAgregarPost = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        listarPosts = new javax.swing.JButton();
        campoId = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaPosts = new javax.swing.JTable();
        botonBorrarPost = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        botonBorrarTag = new javax.swing.JButton();
        botonVerTags = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Seleccione el Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        botonCerrar.setText("Cerrar");
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(botonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 580, -1, -1));

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 300, 180));

        botonSeleccionarUsuario.setText("Seleccionar");
        botonSeleccionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(botonSeleccionarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jLabel2.setText("Id");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));
        jPanel1.add(campoNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 160, -1));

        jLabel4.setText("Usuario que realizara el post");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        jLabel5.setText("Mensaje*");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, -1));

        jScrollPane2.setViewportView(listaTags);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 110, 110, 273));
        jPanel1.add(campoMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 220, -1));

        jLabel6.setText("Tags");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 40, -1, -1));

        jLabel7.setText("Tags");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));
        jPanel1.add(campoTag, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 220, -1));

        botonAgregarTag.setText("Agregar");
        botonAgregarTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarTagActionPerformed(evt);
            }
        });
        jPanel1.add(botonAgregarTag, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, -1, -1));

        botonAgregarPost.setText("Agregar Post");
        botonAgregarPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarPostActionPerformed(evt);
            }
        });
        jPanel1.add(botonAgregarPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 440, -1, -1));

        jLabel8.setText("Posts del Usuario");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        listarPosts.setText("Listar Posts de Este Usuario ↑");
        listarPosts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarPostsActionPerformed(evt);
            }
        });
        jPanel1.add(listarPosts, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));
        jPanel1.add(campoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 250, 20));

        tablaPosts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "Hora", "Mensaje"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaPosts);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 750, 300));

        botonBorrarPost.setText("Borrar");
        botonBorrarPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarPostActionPerformed(evt);
            }
        });
        jPanel1.add(botonBorrarPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 420, -1, -1));

        jLabel9.setText("*Obligatorio");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 580, -1, -1));

        jLabel10.setText("Seleccione el post a borrar");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, -1, -1));

        botonBorrarTag.setText("Borrar Tag");
        botonBorrarTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarTagActionPerformed(evt);
            }
        });
        jPanel1.add(botonBorrarTag, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 390, -1, -1));

        botonVerTags.setText("Ver ");
        botonVerTags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerTagsActionPerformed(evt);
            }
        });
        jPanel1.add(botonVerTags, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, -1, -1));

        jLabel11.setText("Seleccione un Post y despues en Ver para ver sus Tags");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1189, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSeleccionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarUsuarioActionPerformed
        if (tablaUsuarios.getSelectedRow() != (-1)) {

            campoId.setText((String) tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0).toString());
            campoNombreUsuario.setText((String) tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 1));

        }
    }//GEN-LAST:event_botonSeleccionarUsuarioActionPerformed

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        this.setVisible(false);
        fb.setVisible(true);
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void botonAgregarPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPostActionPerformed
        if (!campoId.getText().equalsIgnoreCase("") && !campoMensaje.getText().equalsIgnoreCase("")) {

            PostRepository rp = new PostRepositoryImpl();

            Post post = new Post();

            post.setUsuario(new ObjectId(campoId.getText()));
            post.setMensaje(campoMensaje.getText());
            post.setHora(LocalTime.now());
            post.setFecha(LocalDate.now());
            ObjectId id = new ObjectId();
            post.setId(id);
            ArrayList<String> listaG = new ArrayList(listaTags.getModel().getSize());
            for (int i = 0; i < listaTags.getModel().getSize(); i++) {
                listaG.add(listaTags.getModel().getElementAt(i));
            }
            if (!listaG.isEmpty()) {
                post.setTags(listaG);
            }
            rp.commit(post);

            //Agregar post al usuario
            UsuarioRepository ru = new UsuarioRepositoryImpl();
            Usuario usuario = ru.find(new ObjectId(campoId.getText()));
            ArrayList<String> userPosts = usuario.getPosts();
            userPosts.add(id.toString());
            usuario.setPosts(userPosts);
            ru.update(usuario);

            poblarTablaPosts();
        }
    }//GEN-LAST:event_botonAgregarPostActionPerformed

    private void botonAgregarTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarTagActionPerformed
        if (!campoTag.getText().equals("")) {
            DefaultListModel<String> model = new DefaultListModel<>();
            ListModel m = listaTags.getModel();
            if (m.getSize() == 0) {
                model.add(0, campoTag.getText());
            } else {
                for (int i = 0; i < m.getSize(); i++) {
                    model.add(i, (String) m.getElementAt(i));
                    if ((i + 1) == model.getSize()) {
                        model.add(i + 1, campoTag.getText());
                    }
                }
            }
            listaTags.setModel(model);
        }
    }//GEN-LAST:event_botonAgregarTagActionPerformed

    private void listarPostsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarPostsActionPerformed
        poblarTablaPosts();


    }//GEN-LAST:event_listarPostsActionPerformed

    private void botonBorrarPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarPostActionPerformed
        if (tablaPosts.getSelectedRow() != (-1)) {
            PostRepository rp = new PostRepositoryImpl();
            Post post = rp.find(new ObjectId(tablaPosts.getValueAt(tablaUsuarios.getSelectedRow(), 0).toString()));
            rp.delete(post);

            poblarTablaPosts();
        }
    }//GEN-LAST:event_botonBorrarPostActionPerformed

    private void botonBorrarTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarTagActionPerformed
        if (listaTags.getSelectedIndex() >= 0) {
            ListModel m = listaTags.getModel();
            DefaultListModel<String> model = new DefaultListModel<>();
            for (int i = 0; i < m.getSize(); i++) {
                model.add(i, (String) m.getElementAt(i));
            }
            model.remove(listaTags.getSelectedIndex());
            listaTags.setModel(model);
        }

    }//GEN-LAST:event_botonBorrarTagActionPerformed

    private void botonVerTagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerTagsActionPerformed
        if (tablaPosts.getSelectedRow() != (-1)) {
            DefaultListModel modelo1 = new DefaultListModel();
            PostRepository rp = new PostRepositoryImpl();

            Post post = rp.find(new ObjectId(tablaPosts.getValueAt(tablaPosts.getSelectedRow(), 0).toString()));

            for (String tags : post.getTags()) {
                modelo1.addElement(tags);
            }

            listaTags.setModel(modelo1);
        }
    }//GEN-LAST:event_botonVerTagsActionPerformed

    private void poblarTablaUsuarios() {
        DefaultTableModel tm = (DefaultTableModel) tablaUsuarios.getModel();
        int rowCount = tm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {

            tm.removeRow(i);

        }

        UsuarioRepository ru = new UsuarioRepositoryImpl();

        ArrayList<Usuario> users = ru.getAll();

        for (int i = 0; i < users.size(); i++) {
            tm = (DefaultTableModel) tablaUsuarios.getModel();
            Object[] objs = {users.get(i).getId().toString(), users.get(i).getNombre()};
            tm.addRow(objs);
        }
    }

    private void poblarTablaPosts() {
        if (!campoId.getText().equalsIgnoreCase("")) {

            DefaultTableModel tm = (DefaultTableModel) tablaPosts.getModel();
            int rowCount = tm.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {

                tm.removeRow(i);

            }

            PostRepository rp = new PostRepositoryImpl();
            UsuarioRepository ru = new UsuarioRepositoryImpl();

            Usuario usuario = ru.find(new ObjectId(campoId.getText()));

            ArrayList<Post> posts = rp.getAllFromUser(usuario);

            for (int i = 0; i < posts.size(); i++) {
                tm = (DefaultTableModel) tablaPosts.getModel();
                Object[] objs = {posts.get(i).getId().toString(), posts.get(i).getFecha(), posts.get(i).getHora(), posts.get(i).getMensaje()};
                tm.addRow(objs);
            }

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarPost;
    private javax.swing.JButton botonAgregarTag;
    private javax.swing.JButton botonBorrarPost;
    private javax.swing.JButton botonBorrarTag;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonSeleccionarUsuario;
    private javax.swing.JButton botonVerTags;
    private javax.swing.JLabel campoId;
    private javax.swing.JTextField campoMensaje;
    private javax.swing.JTextField campoNombreUsuario;
    private javax.swing.JTextField campoTag;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listaTags;
    private javax.swing.JButton listarPosts;
    private javax.swing.JTable tablaPosts;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables
}
