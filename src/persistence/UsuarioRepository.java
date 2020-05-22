/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import entidades.Usuario;
import java.util.ArrayList;
import org.bson.types.ObjectId;

/**
 *
 * @author carls
 */
public interface UsuarioRepository extends Repository<Usuario> {

    @Override
    Usuario find(ObjectId id);

    @Override
    void update(Usuario entity);

    @Override
    void delete(Usuario entity);

    @Override
    void commit(Usuario entity);

    @Override
    ArrayList<Usuario> getAll();

}
