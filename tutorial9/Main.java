package tutorialfx.tutorial9;


/**
 * PasswordField
 */
import  javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane root = new GridPane();

        PasswordField pass = new PasswordField();
        pass.setPromptText("Enter your password");
        GridPane.setConstraints(pass, 0,0);


        Label label = new Label();
        GridPane.setConstraints(label,0,1);



        Button btn = new Button("Your pass");
        GridPane.setConstraints(btn,1,0);

        btn.setOnAction(event->{
            System.out.println(pass.getText());
        });

        pass.setOnAction(event -> {
            if(!pass.getText().equals("123456")){
                label.setText("Your password is incorrect");
                label.setTextFill(Color.RED);
            }
            else{
                label.setText("Your password has been confirmed!");
                label.setTextFill(Color.GREEN);
            }

            pass.clear();

        });



        root.getChildren().addAll(pass,btn,label);
        Scene scene = new Scene(root, 400,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
