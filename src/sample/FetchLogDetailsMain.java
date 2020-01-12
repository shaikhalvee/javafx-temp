package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FetchLogDetailsMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("log_details.fxml"));
        primaryStage.setTitle("JavaFx Application for Request & Response");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

//        Button btn1=new Button("Say, Hello World");
//        btn1.setOnAction(arg -> System.out.println("hello world"));
//        StackPane root=new StackPane();
//        root.getChildren().add(btn1);
//        Scene scene=new Scene(root,600,400);
//        primaryStage.setTitle("First JavaFX Application");
//        primaryStage.setScene(scene);
//        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
