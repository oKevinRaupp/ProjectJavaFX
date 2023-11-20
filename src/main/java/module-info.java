module project.devkevin.projectjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens Test.contador;
    exports Test.contador;

    opens Test to javafx.fxml;
    exports Test;
}