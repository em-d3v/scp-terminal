module org.scp.scp.terminal {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.scp.scp.terminal to javafx.fxml;
    exports org.scp.scp.terminal;
}
