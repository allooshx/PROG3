module com.alaa.gethub_test {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.alaa.gethub_test to javafx.fxml;
    exports com.alaa.gethub_test;
}