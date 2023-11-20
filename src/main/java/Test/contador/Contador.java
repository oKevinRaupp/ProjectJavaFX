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
        labelTitulo.getStyleClass().add("titulo");
        Label labelNumero = new Label(Integer.toString(contador));
        labelNumero.getStyleClass().add("numero");

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

        VBox boxConteudo = new VBox();
        boxConteudo.setAlignment(Pos.CENTER);
        boxConteudo.getStyleClass().add("conteudo");
        boxConteudo.setSpacing(10);
        boxConteudo.getChildren().add(labelTitulo);
        boxConteudo.getChildren().add(labelNumero);
        boxConteudo.getChildren().add(boxBotoes);


        String css = getClass().getResource("/Test/contador/Contador.css").toExternalForm();

        Scene cenaPrincipal = new Scene(boxConteudo,400,400);
        cenaPrincipal.getStylesheets().add(css);
        cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Poppins");

        stage.setScene(cenaPrincipal);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
