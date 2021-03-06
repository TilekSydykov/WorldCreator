package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class BookDescriptionController extends ControllerBase {
    MainController parent;

    @FXML
    private TextArea description;

    @FXML
    void Save(ActionEvent event) {
        parent.project.setBookDescription(description.getText());
        parent.fileSystem.saveProject(parent.project);
    }

    public void init(MainController context) {
        parent = context;
        description.setText(parent.project.getBookDescription());
    }

}