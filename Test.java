package groupProject;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Test extends Application {
    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 200);
        stage.setScene(scene);

        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();

        //set Stage boundaries to visible bounds of the main screen
        stage.setMaximized(true);
        stage.setX(primaryScreenBounds.getMinX());
        stage.setY(primaryScreenBounds.getMinY());
        stage.setWidth(primaryScreenBounds.getWidth());
        stage.setHeight(primaryScreenBounds.getHeight());
        System.out.println(primaryScreenBounds.getMinX());
        System.out.println(primaryScreenBounds.getMinY());
        System.out.println(primaryScreenBounds.getWidth());
        System.out.println(primaryScreenBounds.getHeight());
        stage.show();
        
    }
    public static void main(String[] args) {
        launch(args);
    }
}