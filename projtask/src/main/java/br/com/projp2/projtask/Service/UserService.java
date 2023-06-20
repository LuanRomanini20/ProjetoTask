package br.com.projp2.projtask.Service;


import br.com.projp2.projtask.Model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getCurrentUser() {
        // Lógica para obter o usuário atualmente autenticado
        // ...

        // Exemplo: Retornar um usuário fictício
        return new User("user123", "John Doe");
    }

}
