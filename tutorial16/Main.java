package tutorialfx.tutorial16;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();

        Rectangle rectangle = new Rectangle(100,100,Color.RED);
        rectangle.setY(100);
        rectangle.setX(100);

        rectangle.setOnMouseClicked(event->{
            RotateTransition rt = new RotateTransition(Duration.seconds(1),rectangle);
            rt.setByAngle(180);
            rt.setCycleCount(2);
           // rt.setAutoReverse(true);
            rt.play();
        });



        root.getChildren().addAll(rectangle);
        Scene scene = new Scene(root, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
