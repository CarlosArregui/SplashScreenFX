package SP;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * 
 * @author Arregui
 * @version 1.0
 * @see main
 * 
 */
public class Main extends Application {
	Stage stage;

	@Override
	public void start(Stage primaryStage) {
		try {
			stage = primaryStage;
			mainWindow();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void mainWindow() {

		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("SplashScreen.fxml"));
			AnchorPane pane = loader.load();
			// Controller myc=loader.getController();
			// myc.main(stage,this);

			Scene scene = new Scene(pane);

			// adding Google fonts
			scene.getStylesheets().add("https://fonts.googleapis.com/css?family=Manga-Style");

			// adding Custom fonts
			Font.loadFont(getClass().getResourceAsStream("Manga Style.ttf"), 20);

			stage.initStyle(StageStyle.UNDECORATED);
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void closeStage() {
		stage.close();
	}

	public static void main(String[] args) {
		launch(args);
	}
}