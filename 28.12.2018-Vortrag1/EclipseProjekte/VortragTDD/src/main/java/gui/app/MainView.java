package gui.app;


import java.io.FileInputStream;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;


public class MainView extends Application
{
	private BorderPane mainViewBorderPane;
    private String title;
    private Scene mainViewScene;
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		primaryStage.setTitle(this.getTitle());
		primaryStage.setScene(this.getMainViewScene());
		primaryStage.show();
	}
	
    public MainView() throws IOException
	{
    	String pathToFxmlForm = pathToMainFxmlSetUp();
    	FXMLLoader fxmlLoader = new FXMLLoader();
    	fxmlLoader.setLocation(getClass().getResource(pathToFxmlForm));

    	
    	setMainViewBorderPane((BorderPane)fxmlLoader.load());
    	this.setTitle("Demo for JavaFX! Custom Calculator!");
		mainViewScene = new Scene(getMainViewBorderPane());
	}
    
	private String pathToMainFxmlSetUp()
	{
		String pathToFxmlForm = "/gui/viewsfxmls/MainView.fxml";
		return pathToFxmlForm;
	}
    
	public BorderPane getMainViewBorderPane()
	{
		return mainViewBorderPane;
	}

	public void setMainViewBorderPane(BorderPane mainViewBorderPane)
	{
		this.mainViewBorderPane = mainViewBorderPane;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public Scene getMainViewScene()
	{
		return mainViewScene;
	}

	public void setMainViewScene(Scene mainViewScene)
	{
		this.mainViewScene = mainViewScene;
	}

	
}
