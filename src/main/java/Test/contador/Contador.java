package Test.contador;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {

    private int contador = 0;

    @Override
    public void start(Stage stage) throws Exception {

        Label labelTitulo = new Label("ContadorApp");
        Label labelNumero = new Label(Integer.toString(contador));

        Button botaoMais = new Button("+");
        botaoMais.setOnAction(e -> {
            contador++;
            labelNumero.setText(Integer.toString(contador));
        });
        Button botaoMenos = new Button("-");
        botaoMenos.setOnAction(e -> {
            contador--;
            labelNumero.setText(Integer.toString(contador));
        });

        HBox boxBotoes = new HBox();
        boxBotoes.setAlignment(Pos.CENTER);
        boxBotoes.setSpacing(10);
        boxBotoes.getChildren().add(botaoMais);
        boxBotoes.getChildren().add(botaoMenos);

        VBox vBoxPrincipal = new VBox();
        vBoxPrincipal.setAlignment(Pos.CENTER);
        vBoxPrincipal.setSpacing(10);
        vBoxPrincipal.getChildren().add(labelTitulo);
        vBoxPrincipal.getChildren().add(labelNumero);
        vBoxPrincipal.getChildren().add(boxBotoes);


        Scene cenaPrincipal = new Scene(vBoxPrincipal,400,400);

        stage.setScene(cenaPrincipal);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
