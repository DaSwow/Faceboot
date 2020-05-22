/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faceboot;

import entidades.Comentario;
import entidades.Post;
import entidades.Usuario;
import implementations.ComentarioRepositoryImpl;
import implementations.PostRepositoryImpl;
import implementations.UsuarioRepositoryImpl;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import org.bson.types.ObjectId;
import persistence.ComentarioRepository;
import persistence.PostRepository;
import persistence.UsuarioRepository;

/**
 *
 * @author carls
 */
public class PantallaCrearComentario extends javax.swing.JFrame {

    Faceboot fb;

    public PantallaCrearComentario(Faceboot fb) {
        initComponents();
        this.fb = fb;
        poblarTablaUsuarios();
        poblarTablaPosts();
        poblarTablaComentarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        campoIdUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoComentario = new javax.swing.JTextField();
        botonCerrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPosts = new javax.swing.JTable();
        botonSeleccionarPost = new javax.swing.JButton();
        botonSeleccionarUsuario = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campoDuenioPost = new javax.swing.JTextField();
        campoIdPost = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        botonCrearComentario = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaComentarios = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        botonBorrarComentario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Lista Usuarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 26, -1, -1));

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(tablaUsuarios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 59, 261, 220));

        jLabel2.setText("Seleccione el usuario que realizara el comentario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        campoIdUsuario.setEditable(false);
        jPanel1.add(campoIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 220, -1));

        jLabel3.setText("Id");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        campoNombre.setEditable(false);
        jPanel1.add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 220, -1));

        jLabel5.setText("Comentario*");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, -1, -1));

        jLabel6.setText("* Obligatorio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 620, -1, -1));
        jPanel1.add(campoComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 550, 210, -1));

        botonCerrar.setText("Cerrar");
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(botonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1510, 630, -1, -1));

        jLabel7.setText("Seleccione el Post sobre el cual se realizara el comentario");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        tablaPosts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Mensaje"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaPosts);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 450, 300));

        botonSeleccionarPost.setText("Seleccionar");
        botonSeleccionarPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarPostActionPerformed(evt);
            }
        });
        jPanel1.add(botonSeleccionarPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, -1));

        botonSeleccionarUsuario.setText("Seleccionar");
        botonSeleccionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(botonSeleccionarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        jLabel8.setText("Id");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 10, -1));

        jLabel9.setText("Usuario dueño del Post");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, -1, -1));

        campoDuenioPost.setEditable(false);
        jPanel1.add(campoDuenioPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 150, -1));

        campoIdPost.setEditable(false);
        jPanel1.add(campoIdPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 260, -1));

        jLabel10.setText("Escriba su comentario");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, -1, -1));

        botonCrearComentario.setText("Crear");
        botonCrearComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearComentarioActionPerformed(evt);
            }
        });
        jPanel1.add(botonCrearComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, -1, -1));

        jLabel11.setText("Lista completa de comentarios");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, -1, -1));

        tablaComentarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Comentario", "Autor post", "Post", "Comentario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaComentarios);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 100, 770, -1));

        jLabel12.setText("Seleccione el Comentario que desea eliminar haciendo click sobre el y despues en Borrar");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 530, -1, -1));

        botonBorrarComentario.setText("Borrar Comentario");
        botonBorrarComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarComentarioActionPerformed(evt);
            }
        });
        jPanel1.add(botonBorrarComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 560, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSeleccionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarUsuarioActionPerformed
        if (tablaUsuarios.getSelectedRow() != (-1)) {

            UsuarioRepository ru = new UsuarioRepositoryImpl();

            campoIdUsuario.setText(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0).toString());
            campoNombre.setText(ru.find(new ObjectId(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0).toString())).getNombre());

        }
    }//GEN-LAST:event_botonSeleccionarUsuarioActionPerformed

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        fb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void botonSeleccionarPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarPostActionPerformed
        if (tablaPosts.getSelectedRow() != (-1)) {

            PostRepository rp = new PostRepositoryImpl();
            UsuarioRepository ru = new UsuarioRepositoryImpl();

            Post post = rp.find(new ObjectId(tablaPosts.getValueAt(tablaPosts.getSelectedRow(), 0).toString()));
            Usuario usuario = ru.find(post.getUsuario());

            campoIdPost.setText(tablaPosts.getValueAt(tablaPosts.getSelectedRow(), 0).toString());
            campoDuenioPost.setText(usuario.getNombre());

        }
    }//GEN-LAST:event_botonSeleccionarPostActionPerformed

    private void botonCrearComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearComentarioActionPerformed
        if (!campoIdPost.getText().equals("") && !campoIdUsuario.getText().equals("") && !campoIdUsuario.getText().equals("")) {

            ComentarioRepository rc = new ComentarioRepositoryImpl();
            PostRepository rp = new PostRepositoryImpl();
            UsuarioRepository ru = new UsuarioRepositoryImpl();
            Usuario autorPost = ru.find(new ObjectId(campoIdUsuario.getText()));
            Post postComentado = rp.find(new ObjectId(campoIdPost.getText()));
            ObjectId id = new ObjectId();

            Comentario comentario = new Comentario();
            comentario.setAutor(autorPost.getId());
            comentario.setPostComentado(postComentado.getId());
            comentario.setComentario(campoComentario.getText());
            comentario.setHora(LocalTime.now());
            comentario.setFecha(LocalDate.now());
            comentario.setId(id);

            rc.commit(comentario);

            ArrayList<Comentario> comentarios = postComentado.getComentarios();
            comentarios.add(comentario);
            postComentado.setComentarios(comentarios);

            rp.update(postComentado);

            ArrayList<Comentario> comentariosAutor = autorPost.getComentarios();
            comentariosAutor.add(comentario);
            autorPost.setComentarios(comentariosAutor);

            ru.update(autorPost);

            poblarTablaComentarios();
        }
    }//GEN-LAST:event_botonCrearComentarioActionPerformed

    private void botonBorrarComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarComentarioActionPerformed
        if (tablaComentarios.getSelectedRow() != (-1)) {

            ComentarioRepository rc = new ComentarioRepositoryImpl();
            Comentario comentario = rc.find(new ObjectId(tablaComentarios.getValueAt(tablaComentarios.getSelectedRow(), 0).toString()));

            rc.delete(comentario);
            poblarTablaComentarios();
        }
    }//GEN-LAST:event_botonBorrarComentarioActionPerformed

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
        DefaultTableModel tm = (DefaultTableModel) tablaPosts.getModel();
        int rowCount = tm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {

            tm.removeRow(i);

        }

        PostRepository rp = new PostRepositoryImpl();
        UsuarioRepository ru = new UsuarioRepositoryImpl();

        ArrayList<Post> posts = rp.getAll();

        for (int i = 0; i < posts.size(); i++) {
            tm = (DefaultTableModel) tablaPosts.getModel();
            Object[] objs = {posts.get(i).getId().toString(), posts.get(i).getMensaje()};
            tm.addRow(objs);
        }
    }

    private void poblarTablaComentarios() {
        DefaultTableModel tm = (DefaultTableModel) tablaComentarios.getModel();
        int rowCount = tm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {

            tm.removeRow(i);

        }

        ComentarioRepository rc = new ComentarioRepositoryImpl();
        PostRepository rp = new PostRepositoryImpl();
        UsuarioRepository ru = new UsuarioRepositoryImpl();

        ArrayList<Comentario> comentarios = rc.getAll();

        for (int i = 0; i < comentarios.size(); i++) {
            tm = (DefaultTableModel) tablaComentarios.getModel();
            Object[] objs = {
                comentarios.get(i).getId().toString(),
                ru.find(rp.find(rc.find(comentarios.get(i).getId()).getPostComentado()).getUsuario()).getNombre(),
                rp.find(comentarios.get(i).getPostComentado()).getMensaje(),
                comentarios.get(i).getComentario()};
            tm.addRow(objs);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrarComentario;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonCrearComentario;
    private javax.swing.JButton botonSeleccionarPost;
    private javax.swing.JButton botonSeleccionarUsuario;
    private javax.swing.JTextField campoComentario;
    private javax.swing.JTextField campoDuenioPost;
    private javax.swing.JTextField campoIdPost;
    private javax.swing.JTextField campoIdUsuario;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTable tablaComentarios;
    private javax.swing.JTable tablaPosts;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables
}
