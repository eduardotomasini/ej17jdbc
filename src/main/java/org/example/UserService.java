package org.example;

import java.util.ArrayList;

public class UserService {
    UserDAO usuariodao = new UserDAO();

    public void mostrarUsuarios() {
        System.out.println("Se muestra la lista..");
        ArrayList<User> usuarios = usuariodao.listarUsuarios();
        for (User usuario : usuarios) {
            System.out.println(usuario);
        }
    }

}
