module com.roberto.db {
    requires java.sql;
    requires sqlite.jdbc;
    requires transitive com.roberto.common;

    exports com.roberto.db to com.roberto.ui;
}
