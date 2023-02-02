package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
//import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Sona Drawing Program");
			
			//Generate the MenuBar
			MenuBar menuBar = new MenuBar();
			VBox vBox = new VBox(menuBar);
			Scene scene = new Scene(vBox,960,600);

			//To show "File" in menu box
			Menu menu = new Menu("File");
			menuBar.getMenus().add(menu);
			
			//To show "Edit" in menu box
			Menu menu1 = new Menu("Edit");
			menuBar.getMenus().add(menu1);
			
			//To show "Clear" in menu box
			Menu menu2 = new Menu("Clear");
			menuBar.getMenus().add(menu2);
			
			//To show "Dots" in menu box
			Menu menu3 = new Menu("Dots");
			menuBar.getMenus().add(menu3);
			
			//To show "Walls" in menu box
			Menu menu4 = new Menu("Walls");
			menuBar.getMenus().add(menu4);
			
			//To show "Help" in menu box
			Menu menu5 = new Menu("Help");
			menuBar.getMenus().add(menu5);
//			MenuItem menuItemFile = new MenuItem("store?");
// 			to get the file's items
//			menu.getItems().add(menuItemFile); 
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
