package Test;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TesteJavaFX extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Button botaoA = new Button("A");
        Button botaoB = new Button("B");

        botaoA.setOnAction(e -> System.exit(0));
        botaoB.setOnAction(e -> System.out.println("Teste"));

        VBox vBox = new VBox();
        vBox.getChildren().add(botaoA);
        vBox.getChildren().add(botaoB);
        vBox.setSpacing(10);
        vBox.setAlignment(Pos.CENTER);

        Scene cena = new Scene(vBox,100,130);

        stage.setScene(cena);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
