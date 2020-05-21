package faceboot;

import com.mongodb.client.MongoCollection;
import implementations.DocumentoRepositoryImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.types.ObjectId;
import persistence.DocumentoRepository;

/**
 *
 * @author carls
 */
public class PantallaUsuario extends javax.swing.JFrame {

    Faceboot fb;
    public PantallaUsuario(Faceboot fb) {
        initComponents();
        this.fb=fb;
        poblarTablaUsuarios();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonCerrar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        labelNombre = new javax.swing.JLabel();
        labelEdad = new javax.swing.JLabel();
        labelSexo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelPeliculas = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        campoEdad = new javax.swing.JTextField();
        campoSexo = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoGenero = new javax.swing.JTextField();
        campoPelicula = new javax.swing.JTextField();
        campoFecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        botonEditar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botonAgregarGenero = new javax.swing.JButton();
        botonAgregarPelicula = new javax.swing.JButton();
        botonEliminarGenero = new javax.swing.JButton();
        botonEliminarPelicula = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaGeneros = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPeliculas = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelID = new javax.swing.JLabel();
        botonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonCerrar.setText("Cerrar");
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(botonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 480, -1, -1));

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, -1, -1));

        labelNombre.setText("Nombre*");
        jPanel1.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

        labelEdad.setText("Edad*");
        jPanel1.add(labelEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        labelSexo.setText("Sexo*");
        jPanel1.add(labelSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, -1));

        jLabel1.setText("Gustos de Generos Musicales");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));

        labelPeliculas.setText("Peliculas Favoritas");
        jPanel1.add(labelPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, -1));

        labelFecha.setText("Fecha de Nacimiento(dd/mm/yyyy)*");
        jPanel1.add(labelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));
        jPanel1.add(campoEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 113, -1));
        jPanel1.add(campoSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 113, -1));
        jPanel1.add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 113, -1));
        jPanel1.add(campoGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 113, -1));
        jPanel1.add(campoPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, 113, -1));
        jPanel1.add(campoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 113, -1));

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Sexo", "FechaNacimiento", "Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 440, 265));

        botonEditar.setText("Editar");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });
        jPanel1.add(botonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        jLabel2.setText("Seleccione uno para editar y seleccione guardar, de lo contrario al no haber seleccion se creara uno nuevo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jLabel3.setText("Gustos Musicales");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 60, -1, -1));

        jLabel4.setText("Peliculas Favoritas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 60, -1, -1));

        botonAgregarGenero.setText("Agregar");
        botonAgregarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarGeneroActionPerformed(evt);
            }
        });
        jPanel1.add(botonAgregarGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, -1, -1));

        botonAgregarPelicula.setText("Agregar");
        botonAgregarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarPeliculaActionPerformed(evt);
            }
        });
        jPanel1.add(botonAgregarPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, -1, -1));

        botonEliminarGenero.setText("Eliminar");
        botonEliminarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarGeneroActionPerformed(evt);
            }
        });
        jPanel1.add(botonEliminarGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 410, -1, -1));

        botonEliminarPelicula.setText("Eliminar");
        jPanel1.add(botonEliminarPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 410, -1, -1));

        jScrollPane4.setViewportView(listaGeneros);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 100, 130, 300));

        jScrollPane2.setViewportView(listaPeliculas);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 100, 150, 300));

        jLabel5.setText("* Obligatorio");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, -1, -1));

        jLabel6.setText("ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, -1));
        jPanel1.add(labelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 310, 20));

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarGeneroActionPerformed
        if (!campoGenero.getText().equalsIgnoreCase("")) {
            //  listaGeneros.add(campoGenero.getText());
            DefaultListModel<String> model = new DefaultListModel<>();
            ListModel m = listaGeneros.getModel();
            if (m.getSize() == 0) {
                model.add(0, campoGenero.getText());
            } else {
                for (int i = 0; i < m.getSize(); i++) {
                    model.add(i, (String) m.getElementAt(i));
                    if ((i + 1) == model.getSize()) {
                        model.add(i + 1, campoGenero.getText());
                    }
                }
            }
            listaGeneros.setModel(model);
        }
    }//GEN-LAST:event_botonAgregarGeneroActionPerformed

    private void botonEliminarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarGeneroActionPerformed
        if (listaGeneros.getSelectedIndex() >= 0) {
            ListModel m = listaGeneros.getModel();
            DefaultListModel<String> model = new DefaultListModel<>();
            for (int i = 0; i < m.getSize(); i++) {
                model.add(i, (String) m.getElementAt(i));
            }
            model.remove(listaGeneros.getSelectedIndex());
            listaGeneros.setModel(model);
        }

    }//GEN-LAST:event_botonEliminarGeneroActionPerformed

    private void botonAgregarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPeliculaActionPerformed
        if (!campoPelicula.getText().equalsIgnoreCase("")) {
            //  listaGeneros.add(campoGenero.getText());
            DefaultListModel<String> model = new DefaultListModel<>();
            ListModel m = listaPeliculas.getModel();
            if (m.getSize() == 0) {
                model.add(0, campoPelicula.getText());
            } else {
                for (int i = 0; i < m.getSize(); i++) {
                    model.add(i, (String) m.getElementAt(i));
                    if ((i + 1) == model.getSize()) {
                        model.add(i + 1, campoPelicula.getText());
                    }
                }
            }

            listaPeliculas.setModel(model);

        }
    }//GEN-LAST:event_botonAgregarPeliculaActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed

        if (tablaUsuarios.getSelectedRow() < 0 || labelID.getText().equalsIgnoreCase("")) {

            if (!(campoNombre.getText().equals("")) && !(campoSexo.getText().equals("")) && !(campoEdad.getText().equals("")) && !(campoFecha.getText().equals(""))) {
                DocumentoRepository dru = new DocumentoRepositoryImpl("usuarios");
           

                Document usuario = new Document()
                      
                        .append("nombre", campoNombre.getText())
                        .append("edad", Integer.parseInt(campoEdad.getText()))
                        .append("sexo", campoSexo.getText())
                        .append("fecha_nacimiento", campoFecha.getText());

                List<String> listaG = new ArrayList(listaGeneros.getModel().getSize());
                for (int i = 0; i < listaGeneros.getModel().getSize(); i++) {
                    listaG.add(listaGeneros.getModel().getElementAt(i));
                }
                if (!listaG.isEmpty()) {
                    usuario.append("generos_musicales_favoritos", listaG);
                }

                List<String> listaP = new ArrayList(listaPeliculas.getModel().getSize());
                for (int i = 0; i < listaPeliculas.getModel().getSize(); i++) {
                    listaP.add(listaPeliculas.getModel().getElementAt(i));
                }
                if (!listaP.isEmpty()) {
                    usuario.append("peliculas_favoritas", listaP);
                }

             dru.commit(usuario);

            }
        } else {
            DocumentoRepository dru = new DocumentoRepositoryImpl("usuarios");

            Document usuario = new Document()
                    .append("_id", new ObjectId(labelID.getText()))
                    .append("nombre", campoNombre.getText())
                    .append("edad", Integer.parseInt(campoEdad.getText()))
                    .append("sexo", campoSexo.getText())
                    .append("fecha_nacimiento", campoFecha.getText());

            List<String> listaG = new ArrayList(listaGeneros.getModel().getSize());
            for (int i = 0; i < listaGeneros.getModel().getSize(); i++) {
                listaG.add(listaGeneros.getModel().getElementAt(i));
            }
            if (!listaG.isEmpty()) {
                usuario.append("generos_musicales_favoritos", listaG);
            }

            List<String> listaP = new ArrayList(listaPeliculas.getModel().getSize());
            for (int i = 0; i < listaPeliculas.getModel().getSize(); i++) {
                listaP.add(listaPeliculas.getModel().getElementAt(i));
            }
            if (!listaP.isEmpty()) {
                usuario.append("peliculas_favoritas", listaP);
            }

            dru.update(usuario);

        }
        poblarTablaUsuarios();
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        if (tablaUsuarios.getSelectedRow() != (-1)) {
            DocumentoRepository dru = new DocumentoRepositoryImpl("usuarios");
            ObjectId id = (ObjectId) tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 4);
            Document usuario = dru.find(id);
            labelID.setText(usuario.getObjectId("_id").toString());
            campoNombre.setText(usuario.getString("nombre"));
            campoEdad.setText(String.valueOf(usuario.getInteger("edad")));
            campoSexo.setText(usuario.getString("sexo"));

            campoFecha.setText(usuario.getString("fecha_nacimiento"));
            List<String> listaGen = usuario.getList("generos_musicales_favoritos", String.class);
            List<String> listaPel = usuario.getList("peliculas_favoritas", String.class);
            DefaultListModel modelo1 = new DefaultListModel();
            DefaultListModel modelo2 = new DefaultListModel();
            if (listaGen != null && !listaGen.isEmpty()) {
                for (int i = 0; i < listaGen.size(); i++) {
                    modelo1.add(i, listaGen.get(i));
                }
            }
            if (listaPel != null && !listaPel.isEmpty()) {

                for (int i = 0; i < listaPel.size(); i++) {
                    modelo2.add(i, listaPel.get(i));
                }
            }
            listaGeneros.setModel(modelo1);
            listaPeliculas.setModel(modelo2);

        }
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        if (tablaUsuarios.getSelectedRow() != (-1)) {
            DocumentoRepository dru = new DocumentoRepositoryImpl("usuarios");
            ObjectId id = (ObjectId) tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 4);
            Document usuario = dru.find(id);
          
            List<String> listaGen = usuario.getList("generos_musicales_favoritos", String.class);
            List<String> listaPel = usuario.getList("peliculas_favoritas", String.class);
            DefaultListModel modelo1 = new DefaultListModel();
            DefaultListModel modelo2 = new DefaultListModel();
            if (listaGen != null && !listaGen.isEmpty()) {
                for (int i = 0; i < listaGen.size(); i++) {
                    modelo1.add(i, listaGen.get(i));
                }
            }
            if (listaPel != null && !listaPel.isEmpty()) {

                for (int i = 0; i < listaPel.size(); i++) {
                    modelo2.add(i, listaPel.get(i));
                }
            }
            listaGeneros.setModel(modelo1);
            listaPeliculas.setModel(modelo2);
            dru.delete(usuario);
            poblarTablaUsuarios();
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
     fb.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_botonCerrarActionPerformed

    public void poblarTablaUsuarios() {

        DefaultTableModel tm = (DefaultTableModel) tablaUsuarios.getModel();
        int rowCount = tm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {

            tm.removeRow(i);

        }

        DocumentoRepository usure = new DocumentoRepositoryImpl("usuarios");

        ArrayList<ArrayList> lista = usure.getAll();
        ArrayList<String> nombres = lista.get(0);
        ArrayList<Integer> edades = lista.get(1);
        ArrayList<String> sexos = lista.get(2);
        ArrayList<String> fechasNacimiento = lista.get(3);
        ArrayList<ObjectId> ids = lista.get(4);

        Iterator<String> cn = nombres.iterator();
        Iterator<Integer> ce = edades.iterator();
        Iterator<String> cs = sexos.iterator();
        Iterator<String> cf = fechasNacimiento.iterator();
        Iterator<ObjectId> ci = ids.iterator();

        DefaultTableModel tableModel = new DefaultTableModel();

        List<String> listaNombres = new ArrayList<>();
        while (cn.hasNext()) {
            listaNombres.add(cn.next());
        }

        List<Integer> listaEdades = new ArrayList<>();
        while (ce.hasNext()) {
            listaEdades.add(ce.next());
        }

        List<String> listaSexos = new ArrayList<>();
        while (cs.hasNext()) {
            listaSexos.add(cs.next());
        }

        List<String> listaFechas = new ArrayList<>();
        while (cf.hasNext()) {
            listaFechas.add(cf.next());
        }

        List<ObjectId> listaIds = new ArrayList<>();
        while (ci.hasNext()) {
            listaIds.add(ci.next());
        }

        for (int i = 0; i < listaNombres.size(); i++) {
            tableModel = (DefaultTableModel) tablaUsuarios.getModel();
            Object[] objs = {listaNombres.get(i), listaEdades.get(i), listaSexos.get(i), listaFechas.get(i), listaIds.get(i)};
            tableModel.addRow(objs);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarGenero;
    private javax.swing.JButton botonAgregarPelicula;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonEliminarGenero;
    private javax.swing.JButton botonEliminarPelicula;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField campoEdad;
    private javax.swing.JTextField campoFecha;
    private javax.swing.JTextField campoGenero;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoPelicula;
    private javax.swing.JTextField campoSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelEdad;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPeliculas;
    private javax.swing.JLabel labelSexo;
    private javax.swing.JList<String> listaGeneros;
    private javax.swing.JList<String> listaPeliculas;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables
}
