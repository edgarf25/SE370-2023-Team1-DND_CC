import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.Cursor;




public class Main extends Application {

    @Override
    public void start(Stage primaryStage) 
    {
        try
        {
            Image cursor = new Image("/src/sword.png");
            Parent root = FXMLLoader.load(getClass().getResource("/Scenes/Welcome.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            scene.setCursor(new ImageCursor(cursor));
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
