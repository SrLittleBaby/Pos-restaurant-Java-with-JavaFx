module com.srlittlebaby.pos_restaurante {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;

    opens com.srlittlebaby.pos_restaurante to javafx.fxml;
    exports com.srlittlebaby.pos_restaurante;
}