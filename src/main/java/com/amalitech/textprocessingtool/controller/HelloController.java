package com.amalitech.textprocessingtool.controller;

import com.amalitech.textprocessingtool.module.TextProcessingModule;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;

public class HelloController {
    @FXML
    private TextArea output_area;

    @FXML
    private TextArea regex_patterns;

    @FXML
    private TextArea text_data_input;

    @FXML
    private TextArea replacement_text;

    @FXML
    TextProcessingModule textProcessing = new TextProcessingModule();

    @FXML
    public void searchRegexPattern() {
        try {
            if (text_data_input.getText().isEmpty() || regex_patterns.getText().isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Message");
                alert.setHeaderText(null);
                alert.setContentText("Text data and regex pattern are required");
                alert.showAndWait();
            }

            String displaySearch = textProcessing.searchRegexPattern(text_data_input.getText(), regex_patterns.getText());
            output_area.setText(displaySearch);

        } catch (Exception exception) {
            output_area.setText("Something went wrong");
        }
    }

    @FXML
    public void matchTextWithRegex() {
        try {
            if (text_data_input.getText().isEmpty() || regex_patterns.getText().isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Message");
                alert.setHeaderText(null);
                alert.setContentText("Text data and regex pattern are required");
                alert.showAndWait();
            }

            String displayMatches = textProcessing.matchTextWithRegex(text_data_input.getText(), regex_patterns.getText());
            output_area.setText(displayMatches);

        } catch (Exception exception) {
            output_area.setText("Something went wrong");
        }
    }

    @FXML
    public void otherRegexPatterns() {
        try {
            if (text_data_input.getText().isEmpty() || regex_patterns.getText().isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Message");
                alert.setHeaderText(null);
                alert.setContentText("Text data and regex pattern are required");
                alert.showAndWait();
            }

            String output = textProcessing.otherRegexPatterns(text_data_input.getText(), regex_patterns.getText());
            output_area.setText(output);
        } catch (Exception exception) {
            output_area.setText("Something went wrong");
        }

    }

    @FXML
    public void replaceText() {
        if (text_data_input.getText().isEmpty() || replacement_text.getText().isEmpty() || regex_patterns.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Message");
            alert.setHeaderText(null);
            alert.setContentText("All input fields are required");
            alert.showAndWait();
        }

        try {
            String output = textProcessing.searchAndReplace(
                    text_data_input.getText(),
                    regex_patterns.getText(),
                    replacement_text.getText());

            output_area.setText(output);
        } catch (Exception exception) {
            output_area.setText("Something went wrong");
        }
    }
}
