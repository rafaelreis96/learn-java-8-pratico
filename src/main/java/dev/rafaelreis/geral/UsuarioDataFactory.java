package dev.rafaelreis.geral;

import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;

public class UsuarioDataFactory {

    private UsuarioDataFactory(){ }

    public static List<Usuario> listaDeUsuarios(int quantidade) {
        Faker faker = new Faker();
        List<Usuario> usuarios = new ArrayList<>();
        for(int i=0; i < quantidade; i++) {
            Usuario usuario = Usuario.of(faker.name().fullName(), faker.number().numberBetween(0, 1000));
            usuarios.add(usuario);
        }

        return usuarios;
    }

}
