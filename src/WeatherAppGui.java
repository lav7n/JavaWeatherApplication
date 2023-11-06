import org.json.simple.JSONObject;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.json.JSONObject;

public class WeatherAppGui extends Application {
    private JSONObject weatherData;

    @Override
    public void start(Stage primaryStage) {
        // Set the title
        primaryStage.setTitle("Weather App");

        // Create a Pane as the root of the scene graph
        Pane root = new Pane();

        // Set the size of the scene (which will be the size of the stage)
        Scene scene = new Scene(root, 450, 650);

        // Add GUI components to the root
        addGuiComponents(root);

        // Configure the stage to end the program when it is closed
        primaryStage.setOnCloseRequest(event -> System.exit(0));

        // Set the scene on the stage and display it
        primaryStage.setScene(scene);
        primaryStage.setResizable(false); // Prevent any resize of our GUI
        primaryStage.show();
    }

private void addGuiComponents(Pane root){
    // Search field
    TextField searchTextField = new TextField();
    searchTextField.setLayoutX(15);
    searchTextField.setLayoutY(15);
    searchTextField.setPrefWidth(351);
    searchTextField.setPrefHeight(45);
    searchTextField.setFont(new Font("Dialog", 24));

    root.getChildren().add(searchTextField);

    // Weather image
    ImageView weatherConditionImage = new ImageView(new Image("file:src/assets/cloudy.png"));
    weatherConditionImage.setFitWidth(450);
    weatherConditionImage.setPreserveRatio(true);
    weatherConditionImage.setLayoutX(0);
    weatherConditionImage.setLayoutY(125);
    root.getChildren().add(weatherConditionImage);

    // Temperature text
    Label temperatureText = new Label("10 C");
    temperatureText.setLayoutX(0);
    temperatureText.setLayoutY(350);
    temperatureText.setPrefWidth(450);
    temperatureText.setPrefHeight(54);
    temperatureText.setFont(new Font("Dialog", 48));
    temperatureText.setAlignment(Pos.CENTER);
    root.getChildren().add(temperatureText);

    // Weather condition description
    Label weatherConditionDesc = new Label("Cloudy");
    weatherConditionDesc.setLayoutX(0);
    weatherConditionDesc.setLayoutY(405);
    weatherConditionDesc.setPrefWidth(450);
    weatherConditionDesc.setFont(new Font("Dialog", 32));
    weatherConditionDesc.setAlignment(Pos.CENTER);
    root.getChildren().add(weatherConditionDesc);

    // Humidity image
    ImageView humidityImage = new ImageView(new Image("file:src/assets/humidity.png"));
    humidityImage.setLayoutX(15);
    humidityImage.setLayoutY(500);
    root.getChildren().add(humidityImage);

    // Humidity text
    Label humidityText = new Label("Humidity 100%");
    humidityText.setLayoutX(90);
    humidityText.setLayoutY(500);
    humidityText.setFont(new Font("Dialog", 16));
    root.getChildren().add(humidityText);

    // Windspeed image
    ImageView windspeedImage = new ImageView(new Image("file:src/assets/windspeed.png"));
    windspeedImage.setLayoutX(220);
    windspeedImage.setLayoutY(500);
    root.getChildren().add(windspeedImage);

    // Windspeed text
    Label windspeedText = new Label("Windspeed 15km/h");
    windspeedText.setLayoutX(310);
    windspeedText.setLayoutY(500);
    windspeedText.setFont(new Font("Dialog", 16));
    root.getChildren().add(windspeedText);

    // Search button
    Button searchButton = new Button();
    searchButton.setLayoutX(375);
    searchButton.setLayoutY(13);
    searchButton.setPrefWidth(47);
    searchButton.setPrefHeight(45);
    searchButton.setCursor(Cursor.HAND);
    searchButton.setGraphic(new ImageView(new Image("file:src/assets/search.png")));
    searchButton.setOnAction(e -> {
        // Event handling code goes here
    });
    root.getChildren().add(searchButton);
}

    // used to create images in our gui components
    private ImageView loadImage(String resourcePath){
        try {
            // Read the image file from the path given
            Image image = new Image(new FileInputStream(resourcePath));

            // Returns an ImageView so that our component can render it
            return new ImageView(image);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Could not find resource: " + resourcePath);
        }
        
        return null;
    }
}









