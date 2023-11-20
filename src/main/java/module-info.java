module project.devkevin.projectjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens project.devkevin.projectjavafx to javafx.fxml;
    exports project.devkevin.projectjavafx;

    opens Test to javafx.fxml;
    exports Test;
}