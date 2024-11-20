module com.amalitech.textprocessingtool {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.amalitech.textprocessingtool to javafx.fxml;
    exports com.amalitech.textprocessingtool;
}