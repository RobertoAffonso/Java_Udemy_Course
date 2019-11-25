module com.roberto.ui {
    requires javafx.fxml;
    requires javafx.controls;
    requires com.roberto.db;

    exports com.roberto.ui to javafx.graphics, javafx.fxml;

    opens com.roberto.ui to javafx.fxml;
}
