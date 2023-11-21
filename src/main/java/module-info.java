module project.devkevin.projectjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens test.contador;
    exports test.contador;

    opens test.wizard;
    exports test.wizard;

    opens test.layout;
    exports test.layout;

    opens test to javafx.fxml;
    exports test;

    opens test.fxml;
    exports test.fxml;

}