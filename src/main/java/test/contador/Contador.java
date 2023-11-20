package test.contador;

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
            atualizarLabelNumero(labelNumero);
        });
        botaoMais.getStyleClass().add("botoes");

        Button botaoMenos = new Button("-");
        botaoMenos.setOnAction(e -> {
            contador--;
            atualizarLabelNumero(labelNumero);
        });
        botaoMenos.getStyleClass().add("botoes");

        HBox boxBotoes = new HBox();
        boxBotoes.setAlignment(Pos.CENTER);
        boxBotoes.setSpacing(10);
        boxBotoes.getChildren().add(botaoMenos);
        boxBotoes.getChildren().add(botaoMais);

        VBox boxConteudo = new VBox();
        boxConteudo.setAlignment(Pos.CENTER);
        boxConteudo.getStyleClass().add("conteudo");
        boxConteudo.setSpacing(10);
        boxConteudo.getChildren().add(labelTitulo);
        boxConteudo.getChildren().add(labelNumero);
        boxConteudo.getChildren().add(boxBotoes);


        String css = getClass().getResource("/test/contador/Contador.css").toExternalForm();

        Scene cenaPrincipal = new Scene(boxConteudo,400,400);
        cenaPrincipal.getStylesheets().add(css);
        cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Poppins");

        stage.setScene(cenaPrincipal);
        stage.show();
    }
    
    private void atualizarLabelNumero(Label label) {
    	label.setText(Integer.toString(contador));
    	
    	label.getStyleClass().remove("verde");
    	label.getStyleClass().remove("vermelho");
    	
    	if(contador > 0 ) {
    		label.getStyleClass().add("verde");
    	} else if(contador < 0){
    		label.getStyleClass().add("vermelho");
    	}
    	
    }

    public static void main(String[] args) {
        launch();
    }
}
