package boundery;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BounderyLogin extends Application {

    Stage window;
    Button btnLogin;
    TextField txtUsuario;
    PasswordField txtSenha;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Gerenciador Biblioteca 2.0");

        GridPane layoutLogin = new GridPane();
        layoutLogin.setPadding(new Insets(40));
        layoutLogin.setHgap(10);
        layoutLogin.setVgap(20);

        layoutLogin.add(new Label("LOGIN"),1,0);

        layoutLogin.add(new Label("Usuario"), 0, 1 );
        txtUsuario = new TextField();
        layoutLogin.add(txtUsuario, 1, 1);

        layoutLogin.add(new Label("Senha"), 0, 2);
        txtSenha = new PasswordField();
        layoutLogin.add(txtSenha, 1, 2);

        btnLogin = new Button("Logar");
        layoutLogin.add(btnLogin, 2, 3);

        Scene scn = new Scene(layoutLogin, 400, 400);
        window.setScene(scn);
        window.show();

    }
}
