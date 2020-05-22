package faceboot;

public class Faceboot extends javax.swing.JFrame {

    public Faceboot() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonUsuario = new javax.swing.JButton();
        botonPosts = new javax.swing.JButton();
        botonCerrarPrograma = new javax.swing.JButton();
        botonComentairos = new javax.swing.JButton();
        botonTags = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonUsuario.setText("Manejar Usuarios");
        botonUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUsuarioActionPerformed(evt);
            }
        });

        botonPosts.setText("Manejar Posts");
        botonPosts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPostsActionPerformed(evt);
            }
        });

        botonCerrarPrograma.setText("Cerrar Programa");
        botonCerrarPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarProgramaActionPerformed(evt);
            }
        });

        botonComentairos.setText("Manejar Comentarios");
        botonComentairos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComentairosActionPerformed(evt);
            }
        });

        botonTags.setText("Buscar Posts por Tag");
        botonTags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTagsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonCerrarPrograma)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonTags)
                    .addComponent(botonComentairos)
                    .addComponent(botonPosts)
                    .addComponent(botonUsuario))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(botonUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonPosts, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonComentairos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonTags)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(botonCerrarPrograma)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUsuarioActionPerformed
        PantallaUsuario pcu = new PantallaUsuario(this);
        pcu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonUsuarioActionPerformed

    private void botonPostsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPostsActionPerformed
        PantallaPost pcu = new PantallaPost(this);
        pcu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonPostsActionPerformed

    private void botonCerrarProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarProgramaActionPerformed
       System.exit(0);
    }//GEN-LAST:event_botonCerrarProgramaActionPerformed

    private void botonComentairosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComentairosActionPerformed
       PantallaCrearComentario pm=new PantallaCrearComentario(this);
        pm.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_botonComentairosActionPerformed

    private void botonTagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTagsActionPerformed
       PantallaBusqueda pb=new PantallaBusqueda(this);
       this.setVisible(false);
       pb.setVisible(true);
    }//GEN-LAST:event_botonTagsActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Faceboot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrarPrograma;
    private javax.swing.JButton botonComentairos;
    private javax.swing.JButton botonPosts;
    private javax.swing.JButton botonTags;
    private javax.swing.JButton botonUsuario;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
