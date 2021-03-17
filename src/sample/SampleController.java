package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class SampleController {
    public Label lblHW;
    public GridPane gridBackground;

    public void prikaziHelloWorld(ActionEvent actionEvent) {
        lblHW.setText("Hello world");
        gridBackground.setStyle("-fx-background-color: red");



    }
}
