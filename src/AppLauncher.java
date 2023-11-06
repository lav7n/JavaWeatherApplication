import javafx.application.Application;
import javafx.stage.Stage;

public class AppLauncher extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Create an instance of your WeatherAppGui which is a JavaFX application
            WeatherAppGui weatherAppGui = new WeatherAppGui();
            weatherAppGui.start(primaryStage); // Start the JavaFX application
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args); // Launch the JavaFX application
    }
}
