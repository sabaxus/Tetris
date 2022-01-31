package net.seb.javafx.tetris;

import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import net.seb.javafx.tetris.forms.Tetromino;
import net.seb.javafx.tetris.utils.Constants;

public class Main extends Application {


    private double time;
    private GraphicsContext graphicsContext;

    private int[][] grid = new int[(int)Constants.WIDTH][Constants.HEIGHT];

    private Parent createScene() {
        Pane pane = new Pane();
        pane.setPrefSize(Constants.WIDTH + 150, Constants.HEIGHT);

        Canvas canvas = new Canvas(Constants.WIDTH + 150, Constants.HEIGHT);
        graphicsContext = canvas.getGraphicsContext2D();


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


        Tetromino i = new Tetromino("t");
        pane.getChildren().addAll(i.getA(), i.getB(), i.getC(), i.getD());

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                time += 0.017;

                if (time >= 0.5) {
                    update(i);
                    //render();
                    time = 0;
                }
            }
        };
        timer.start();

        return pane;
    }



    private void update(Tetromino t) {
        Controller.drop(t);
    }



    @Override
    public void start(Stage stage) throws Exception{
        Scene scene = new Scene(createScene());

        stage.setTitle("Tetris");
        stage.setScene(scene);
        stage.show();








    }

    public static void main(String[] args) {
        launch(args);
    }
}
