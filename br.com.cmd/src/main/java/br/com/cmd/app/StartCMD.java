package br.com.cmd.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.cmd.jpa.Conexao;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartCMD extends Application {
	
	static final Logger LOG = LogManager.getLogger(StartCMD.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conexao conectar = new Conexao();
		conectar.getEntity();
		
	}

	@Override
	public void start(Stage stage) throws Exception {
		LOG.info("Iniciando app JavaFX");
		Parent root = FXMLLoader.load(getClass().getResource("../view/UI_login.fxml"));
	    
        Scene scene = new Scene(root, 300, 275);
    
        stage.setTitle("Autenticação");
        stage.setScene(scene);
        stage.show();
		
	}

}
