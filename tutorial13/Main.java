package tutorialfx.tutorial13;

import  javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(70);

        SepiaTone sepiaEffect = new SepiaTone();

        Image image = new Image(getClass().getResourceAsStream("2.jpg"));
        ImageView city = new ImageView(image);
        city.setFitHeight(450);
        city.setFitWidth(580);
        city.setEffect(sepiaEffect);
        GridPane.setConstraints(city,0,0);
        GridPane.setColumnSpan(city, 3);
        grid.getChildren().add(city);

        Slider opacitySlider = new Slider(0,1,1);
        Slider sepiaSlider = new Slider(0,1,1);
        Slider sizeSlider = new Slider(0,1,1);


        Label opacityLabel = new Label("Opacity");
        Label sepiaLabel = new Label("Sepia");
        Label sizeLabel = new Label("Size");

        Label opacityValue = new Label(Double.toString(opacitySlider.getValue()));
        Label sepiaValue = new Label(Double.toString(sepiaSlider.getValue()));
        Label sizeValue = new Label(Double.toString(sizeSlider.getValue()));


        GridPane.setConstraints(opacityLabel,0,1);
        GridPane.setConstraints(sepiaLabel,0,2);
        GridPane.setConstraints(sizeLabel,0,3);

        GridPane.setConstraints(opacityValue,2,1);
        GridPane.setConstraints(sepiaValue,2,2);
        GridPane.setConstraints(sizeValue,2,3);


        opacitySlider.valueProperty().addListener((ov,old_val,new_val)->{
            city.setOpacity(new_val.doubleValue());
            opacityValue.setText(String.format("%.2f",new_val));
        });
        GridPane.setConstraints(opacitySlider,1,1);
        sepiaSlider.valueProperty().addListener((ov,old_val,new_val)->{
            sepiaEffect.setLevel(new_val.doubleValue());
            sepiaValue.setText(String.format("%.2f",new_val));
        });
        GridPane.setConstraints(sepiaSlider,1,2);
        sizeSlider.valueProperty().addListener((ov,old_val,new_val)->{
            city.setScaleX(new_val.doubleValue());
            city.setScaleY(new_val.doubleValue());
            sizeValue.setText(String.format("%.2f",new_val));
        });
        GridPane.setConstraints(sizeSlider,1,3);





        grid.getChildren().addAll(opacityLabel,opacitySlider,opacityValue);
        grid.getChildren().addAll(sepiaLabel,sepiaSlider,sepiaValue);
        grid.getChildren().addAll(sizeLabel,sizeSlider,sizeValue);


        Scene scene = new Scene(grid, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}