module com.amalitech.textprocessingtool {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.amalitech.textprocessingtool to javafx.fxml;
    exports com.amalitech.textprocessingtool;
    exports com.amalitech.textprocessingtool.controller;
    opens com.amalitech.textprocessingtool.controller to javafx.fxml;
    exports com.amalitech.textprocessingtool.module;
    opens com.amalitech.textprocessingtool.module to javafx.fxml;
}