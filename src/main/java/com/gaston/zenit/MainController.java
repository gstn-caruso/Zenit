package com.gaston.zenit;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;

public class MainController {

    public void initialize() {
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();

        canvas.setOnMouseDragged(e -> {
            double size = Double.parseDouble(brushSize.getText());
            double x = e.getX() - size / 2;
            double y = e.getY() - size / 2;

            if (eraser.isSelected()) {
                graphicsContext.clearRect(x, y, size, size);
            } else {
                graphicsContext.setFill(colorPicker.getValue());
                graphicsContext.fillRect(x, y, size, size);
            }
        });
    }

    @FXML
    private Canvas canvas;


    @FXML
    private ColorPicker colorPicker;

    @FXML
    private TextField brushSize;

    @FXML
    private CheckBox eraser;

    public void onSave() {
    }

    public void onExit() {
        Platform.exit();
    }
}
