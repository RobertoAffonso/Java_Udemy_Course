module com.roberto.ui {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.base;
    requires com.roberto.db;
    requires com.roberto.common;

    exports com.roberto.ui to javafx.graphics, javafx.fxml;

    opens com.roberto.ui to javafx.fxml;
}
