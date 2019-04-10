package boundery;

import javafx.application.Application;
import javafx.stage.Stage;

public class BounderyInitial extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        window.setTitle("Gerenciador Biblioteca 2.0");



    }
}
