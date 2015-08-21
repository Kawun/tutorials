package tutorialfx.tutorial15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();

        ProgressBar pb = new ProgressBar(0);
        ProgressIndicator pi = new ProgressIndicator(0);
        Slider slider = new Slider(0,50,0);


        slider.valueProperty().addListener((ov,old_val,new_val)->{
            pb.setProgress(new_val.doubleValue()/50);
            pi.setProgress(new_val.doubleValue()/50);
        });


GridPane.setConstraints(slider,0,0);
GridPane.setConstraints(pb,1,0);
GridPane.setConstraints(pi,2,0);


        root.getChildren().addAll(slider,pb,pi);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
