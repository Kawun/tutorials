package tutorialfx.tutorial7;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


/**
 * CHECK BOX
 */
public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        VBox btns = new VBox(10);
        HBox rects = new HBox();

        CheckBox[] cbs = new CheckBox[]{
            new CheckBox("Red"),
            new CheckBox("Green"),
            new CheckBox("Blue")
        };

        Rectangle[] rectangles = new Rectangle[]{
                new Rectangle(100,100,Color.RED),
                new Rectangle(100,100,Color.GREEN),
                new Rectangle(100,100,Color.BLUE)
        };



        for(int i = 0; i < 3; i++){
            CheckBox cb = cbs[i];
            Rectangle rect = rectangles[i];
            btns.getChildren().add(cb);
            cb.selectedProperty().addListener(event->{
                if(cb.isSelected()){
                    rects.getChildren().add(rect);
                }
                else{
                    rects.getChildren().remove(rect);
                }

            });
        }





        root.setCenter(rects);
        root.setLeft(btns);
        Scene scene = new Scene(root,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
