package test.fxml;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.controlsfx.control.Notifications;

public class LoginController {
    @FXML
    private TextField textEmail;
    @FXML
    private PasswordField textPassword;

    public void entrar(){
        boolean emailOk = textEmail.getText().equals("seu@email.com");
        boolean senhaOk = textPassword.getText().equals("2345678");

        if(emailOk && senhaOk){
            Notifications.create().title("Login Kevin aplicação").text("Login efetuado com sucesso!").showInformation();

        }else{
            Notifications.create().title("Login Kevin aplicação").text("Login não efetuado. Usuario/Senha invalido!").showError();
        }
    }
}
