package net.seb.javafx.tetris;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import net.seb.javafx.tetris.forms.Form;
import net.seb.javafx.tetris.utils.Constants;

public class Window {


    public static Scene createScene() {
        Pane pane = new Pane();


        Line line = new Line(Constants.WIDTH, 0, Constants.WIDTH, Constants.HEIGHT);

        // Create Score and lines completed text
        Text scoreText = new Text("Score: ");
        scoreText.setStyle("-fx-font: 20 arials");
        scoreText.setY(50);
        scoreText.setX(Constants.WIDTH + 5);

        Text linesCompleted = new Text("Lines: ");
        linesCompleted.setStyle("-fx-font: 20 arials");
        linesCompleted.setY(100);
        linesCompleted.setX(Constants.WIDTH + 5);
        linesCompleted.setFill(Color.GREEN);


        pane.getChildren().addAll(line, scoreText, linesCompleted);
        Form i = new Form("t", 3);
        pane.getChildren().addAll(i.getA(), i.getB(), i.getC(), i.getD());

        Scene scene = new Scene(pane, Constants.WIDTH + 150, Constants.HEIGHT);

        return scene;
    }
}
