package tutorialfx.tutorial17;

import javafx.animation.ScaleTransition;
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
        rectangle.setOnMouseEntered(event -> {
            ScaleTransition st = new ScaleTransition(Duration.seconds(1),rectangle);
            st.setToX(2);
            st.setToY(2);
            st.play();
        });

        rectangle.setOnMouseExited(event -> {
            ScaleTransition st = new ScaleTransition(Duration.seconds(1),rectangle);
            st.setFromX(2);
            st.setFromY(2);
            st.setToX(1);
            st.setToY(1);
            st.play();
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
