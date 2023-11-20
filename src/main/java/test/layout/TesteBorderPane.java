package test.layout;

import javafx.scene.layout.BorderPane;

public class TesteBorderPane extends BorderPane {
    public TesteBorderPane(){
        Caixa c1 = new Caixa().comTexto("TOP");
        setTop(c1);

        Caixa c2 = new Caixa().comTexto("LEFT");
        setLeft(c2);

        Caixa c3 = new Caixa().comTexto("RIGHT");
        setRight(c3);

        Caixa c4 = new Caixa().comTexto("BOTTOM");
        setBottom(c4);

        Caixa c5 = new Caixa().comTexto("CENTER");
        setCenter(c5);


    }
}
