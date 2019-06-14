package br.com.cmd.app;

import br.com.cmd.jpa.Conexao;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartCMD extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conexao conectar = new Conexao();
		conectar.getEntity();
		
		

	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("../view/UI_login.fxml"));
	    
        Scene scene = new Scene(root, 300, 275);
    
        stage.setTitle("Autenticação");
        stage.setScene(scene);
        stage.show();
		
	}

}
