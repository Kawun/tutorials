package tutorialfx.tutorial4;

/**
 * Created by Владислав on 06.08.2015.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Created by Владислав on 05.08.2015.
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();

        Button button = new Button();
        //button.setText("Click me!");

        Image image = new Image(getClass().getResourceAsStream("1.png"));
        ImageView img = new ImageView(image);
        img.setFitHeight(40);
        img.setFitWidth(40);

        button.setGraphic(img);

        DropShadow shadow = new DropShadow();
        shadow.setColor(Color.GREEN);
        shadow.setRadius(40);

        button.setStyle("-fx-base:#b6e7c9");


        button.setOnAction(event -> button.setEffect(shadow));




        root.getChildren().addAll(button);
        Scene scene = new Scene(root,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}