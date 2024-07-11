package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class FinanceCalculator extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("finance_calculator.fxml"));
		primaryStage.setTitle("Calculadora Financiera");

		// Load icon from resources folder
		Image icon = new Image(getClass().getResourceAsStream("icon.png"));

		// Set the application icon
		primaryStage.getIcons().add(icon);

		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

		primaryStage.setScene(scene);

		// Establecer el tamaño fijo de la ventana
		primaryStage.setResizable(false);

		// Opcional: Establecer tamaño mínimo y máximo si es necesario
		primaryStage.setMinWidth(500);
		primaryStage.setMinHeight(400);
		primaryStage.setMaxWidth(500);
		primaryStage.setMaxHeight(400);

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
