package br.com.projp2.projtask.Service;


import br.com.projp2.projtask.Model.User;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void sendNotification(User user, String message) {
        // Lógica para enviar a notificação para o usuário
        // Por exemplo, enviar um e-mail, uma mensagem push, um SMS, etc.
        System.out.println("Enviando notificação para o usuário: " + user.getUsername());
        System.out.println("Mensagem: " + message);
    }

}

