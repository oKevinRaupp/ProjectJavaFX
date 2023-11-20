package Test.Wizard;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application {

    private Stage window;
    private Scene cena1;
    private Scene cena2;
    private Scene cena3;
    @Override
    public void start(Stage stage) throws Exception {
        window = stage;

        criarCena1();
        criarCena2();
        criarCena3();

        window.setScene(cena1);
        window.setTitle("WizardTest");
        window.show();
    }

    private void criarCena1(){

        Button proximaCena = new Button("Ir p/ 2ª cena");
        proximaCena.setOnAction(event -> {
            window.setScene(cena2);
        });

        HBox hBox = new HBox();
        hBox.getChildren().add(proximaCena);
        hBox.setAlignment(Pos.CENTER);

        cena1 = new Scene(hBox,400,400);
    }
    private void criarCena2(){

        Button cenaAnterior = new Button("Voltar para 1º cena");
        cenaAnterior.setOnAction(event -> {
            window.setScene(cena1);
        });
        Button proximaCena = new Button("Ir p/ 3ª cena");
        proximaCena.setOnAction(event -> {
            window.setScene(cena3);
        });

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().add(cenaAnterior);
        hBox.getChildren().add(proximaCena);
        hBox.setSpacing(5);

        cena2 = new Scene(hBox,400,400);
    }
    private void criarCena3(){

        Button cenaAnterior = new Button("Voltar para 2º cena");
        cenaAnterior.setOnAction(event -> {
            window.setScene(cena2);
        });
        Button proximaCena = new Button("Fechar");
        proximaCena.setOnAction(event -> {
            System.exit(0);
        });

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().add(cenaAnterior);
        hBox.getChildren().add(proximaCena);
        hBox.setSpacing(5);

        cena3 = new Scene(hBox,400,400);
    }
    public static void main(String[] args) {
        launch();
    }
}
