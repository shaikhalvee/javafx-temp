package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.util.Constants;

public class FetchLogDetailsMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parameters parameters = (this).getParameters();
        System.out.println(parameters.getRaw());
        Constants.ip = parameters.getRaw().get(0);
        Constants.port = parameters.getRaw().get(1);

        Parent root = FXMLLoader.load(getClass().getResource("log_details.fxml"));
        primaryStage.setTitle("JavaFx Application for Request & Response");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
