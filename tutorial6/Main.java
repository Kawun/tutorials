package tutorialfx.tutorial6;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * ToggleButton
 */
public class Main extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();

        HBox buttons = new HBox();
        buttons.setAlignment(Pos.CENTER);

        ToggleGroup group = new ToggleGroup();



        ToggleButton tb1 = new ToggleButton("Green");
        ToggleButton tb2 = new ToggleButton("Blue");
        ToggleButton tb3 = new ToggleButton("Red");


        tb1.setToggleGroup(group);
        tb2.setToggleGroup(group);
        tb3.setToggleGroup(group);


        tb1.setUserData(Color.LIGHTGREEN);
        tb2.setUserData(Color.LIGHTBLUE);
        tb3.setUserData(Color.SALMON);


        Rectangle rect = new Rectangle(300,300);
        rect.setFill(Color.WHITE);
        rect.setStroke(Color.DARKGOLDENROD);
        rect.setStrokeWidth(2);
        rect.setArcHeight(50);
        rect.setArcWidth(50);


        group.selectedToggleProperty().addListener(event->{
            if(group.getSelectedToggle() !=null){
                rect.setFill((Color)group.getSelectedToggle().getUserData());
            }
            else {
                rect.setFill(Color.WHITE);
            }
        });



        tb1.setStyle("-fx-base: lightgreen");
        tb2.setStyle("-fx-base: lightblue");
        tb3.setStyle("-fx-base: salmon");

        tb2.setSelected(true);


        buttons.getChildren().addAll(tb1,tb2,tb3);
        root.setTop(buttons);
        root.setCenter(rect);
        Scene scene = new Scene(root,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
