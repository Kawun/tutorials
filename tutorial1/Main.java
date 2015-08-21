package tutorialfx.tutorial1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Created by Владислав on 04.08.2015.
 */
public class Main extends Application{

    public void init(){
        System.out.println("init");
    }
    public void stop(){
        System.out.println("stop");
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("MyWin");
        primaryStage.setWidth(300);
        primaryStage.setHeight(300);

        Pane root = new Pane();
        Button btn = new Button();
        btn.setText("Click me");
        btn.setTranslateX(140);
        btn.setTranslateY(140);

        btn.setPrefSize(70,20);
        Rectangle rect = new Rectangle(50,50);
        btn.setOnAction(event ->{
            rect.setFill(Color.RED);
            System.out.println("Hello!");
        });







        Scene scene = new Scene(root);

        root.getChildren().addAll(btn,rect);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
