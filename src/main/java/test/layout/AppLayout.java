package test.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLayout extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Scene principal = new Scene(new TesteAnchorPane(),800,600);

        stage.setScene(principal);
        stage.setTitle("Gerenciado de Layout");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
