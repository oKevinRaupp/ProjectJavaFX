package test.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppLayout extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        VBox temp = new VBox();
        temp.getChildren().add(new Caixa().comTexto("1"));
        temp.getChildren().add(new Quadrado());

        Scene principal = new Scene(temp,800,600);

        stage.setScene(principal);
        stage.setTitle("Gerenciado de Layout");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
