package br.com.cmd.app;

import br.com.cmd.jpa.Conexao;
import javafx.application.Application;
import javafx.stage.Stage;

public class StartCMD extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conexao conectar = new Conexao();
		conectar.getEntity();
		
		

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
