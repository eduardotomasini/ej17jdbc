package org.example;

import java.util.ArrayList;

public class UserDAO extends ConexionDAO {

    public ArrayList<User> listarUsuarios() {
        ArrayList<User> usuarios = new ArrayList();
        try {
            String query = "SELECT id, clave, nombre, mail, edad FROM user";
            consultarBd(query);
            User usuario = null;
            while (resultado.next()) {
                usuario = new User();
                usuario.setId(resultado.getInt(1));
                usuario.setClave(resultado.getInt(2));
                usuario.setNombre(resultado.getString(3));
                usuario.setMail(resultado.getString(4));
                usuario.setEdad(resultado.getInt(5));
                usuarios.add(usuario);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            desconectarBd();
        }
        return usuarios;
    }

}
