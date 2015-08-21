package tutorialfx.tutorial5;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * RADIOBUTTON
 */
public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        HBox buttons = new HBox(10);
        buttons.setAlignment(Pos.CENTER);
        HBox pic = new HBox();
        pic.setAlignment(Pos.CENTER);

        ToggleGroup group = new ToggleGroup();

        RadioButton rb1 = new RadioButton("Home");
        RadioButton rb2 = new RadioButton("Calendar");
        RadioButton rb3 = new RadioButton("Contact");


        rb1.setToggleGroup(group);
        rb2.setToggleGroup(group);
        rb3.setToggleGroup(group);


        rb1.setUserData("Home");
        rb2.setUserData("Calendar");
        rb3.setUserData("Contact");

        ImageView img = new ImageView();




        group.selectedToggleProperty().addListener(event ->{
            Image image = new Image(getClass().getResourceAsStream(group.getSelectedToggle().getUserData()+".png"));
            img.setImage(image);
            img.setFitHeight(300);
            img.setFitWidth(300);

        });






        rb2.setSelected(true);

        buttons.getChildren().addAll(rb1,rb2,rb3);
        pic.getChildren().add(img);
        root.setTop(buttons);
        root.setCenter(pic);
        Scene scene = new Scene(root,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
