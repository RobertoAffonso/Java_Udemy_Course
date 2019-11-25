module com.roberto.common {
    requires javafx.base;

    exports com.roberto.common;

    opens com.roberto.common to javafx.base;
}
