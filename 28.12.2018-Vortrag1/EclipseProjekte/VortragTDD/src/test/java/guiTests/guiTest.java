package guiTests;

import static org.junit.jupiter.api.Assertions.*;
import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.matcher.base.NodeMatchers.isVisible;
import static org.testfx.matcher.control.LabeledMatchers.hasText;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.matcher.control.TextInputControlMatchers;

import gui.app.MainView;
import javafx.stage.Stage;



class guiTest extends ApplicationTest
{
	MainView mainViewObj;
    String extractedTitle;
    
	@Override
	public void start(Stage stage) throws Exception
	{
		mainViewObj = new MainView();
		stage.setScene(mainViewObj.getMainViewScene());
		stage.setTitle(mainViewObj.getTitle());
		extractedTitle = stage.getTitle();
				
		stage.show();
		stage.toFront();
	}

	@Test
	void testingIfMainViewObjectExist() throws IOException
	{
		assertNotNull(mainViewObj);
	}
	
	@Test
	void testinIfTitleHasBeenShown()
	{ 
		String expectedResult = "Demo for JavaFX! Custom Calculator!";
		String actualResult = extractedTitle;
		
		assertEquals(expectedResult, actualResult, "the title of the stage is not set up!");
	}
	
	//click on Number and expect to see the number in editFeld
	@Test
	void clickBtn0Test() {
		clickOn("#btn0");
		verifyThat("#txtResultField",  TextInputControlMatchers.hasText("0"));
	}
	@Test
	void clickBtn1Test() {
		clickOn("#btn1");
		verifyThat("#txtResultField",  TextInputControlMatchers.hasText("1"));
	}
	@Test
	void clickBtn2Test() {
		clickOn("#btn2");
		verifyThat("#txtResultField",  TextInputControlMatchers.hasText("2"));
	}
	@Test
	void clickBtn3Test() {
		clickOn("#btn3");
		verifyThat("#txtResultField",  TextInputControlMatchers.hasText("3"));
	}
	@Test
	void clickBtn4Test() {
		clickOn("#btn4");
		verifyThat("#txtResultField",  TextInputControlMatchers.hasText("4"));
		
	}
	@Test
	void clickBtn5Test() {
		clickOn("#btn5");
		verifyThat("#txtResultField",  TextInputControlMatchers.hasText("5"));
	}
	
	@Test
	void clickBtn6Test() {
		clickOn("#btn6");
		verifyThat("#txtResultField",  TextInputControlMatchers.hasText("6"));
	}
	
	@Test
	void clickBtn7Test() {
		clickOn("#btn7");
		verifyThat("#txtResultField",  TextInputControlMatchers.hasText("7"));
	}
	
	@Test
	void clickBtn8Test() {
		clickOn("#btn8");
		verifyThat("#txtResultField",  TextInputControlMatchers.hasText("8"));
	}
	@Test
	void clickBtn9Test() {
		clickOn("#btn9");
		verifyThat("#txtResultField",  TextInputControlMatchers.hasText("9"));
	}
	@Test
	void clickBtnCrTest() {
		clickOn("#btnCr");
		verifyThat("#txtResultField",  TextInputControlMatchers.hasText(""));
	}
	
	
	@Test
	void checkIfAddOpsOk() {
		clickOn("#btn2");
		clickOn("#btnAddOps");
		clickOn("#btn4");
		clickOn("#btnAssignValue");
		verifyThat("#txtResultField",  TextInputControlMatchers.hasText("6"));
		
	}
	
	@Test
	void checkIfAddOps2Ok() {
		clickOn("#btn2");
		clickOn("#btn2");
		clickOn("#btnAddOps");
		clickOn("#btn4");
		clickOn("#btnAssignValue");
		verifyThat("#txtResultField",  TextInputControlMatchers.hasText("26"));
	}
	
	@Test
	void checkIfSubOpsOk() {
		clickOn("#btn2");
		clickOn("#btnSubOps");
		clickOn("#btn4");
		clickOn("#btnAssignValue");
		verifyThat("#txtResultField",  TextInputControlMatchers.hasText("-2"));
	}
	@Test
	void checkIfSubOps2Ok() {
		clickOn("#btn2");
		clickOn("#btn2");
		clickOn("#btnSubOps");
		clickOn("#btn4");
		clickOn("#btnAssignValue");
		verifyThat("#txtResultField",  TextInputControlMatchers.hasText("18"));
	}
	
	@Test
	void checkIfMultOpsOk() {
		clickOn("#btn2");
		clickOn("#btnMultOps");
		clickOn("#btn4");
		clickOn("#btnAssignValue");
		verifyThat("#txtResultField",  TextInputControlMatchers.hasText("8"));
	}
	@Test
	void checkIfMultOps2Ok() {
		clickOn("#btn2");
		clickOn("#btn5");
		clickOn("#btnMultOps");
		clickOn("#btn4");
		clickOn("#btnAssignValue");
		verifyThat("#txtResultField",  TextInputControlMatchers.hasText("100"));
	}
	
	@Test
	void checkIfDivOpsOk() {
		clickOn("#btn2");
		clickOn("#btnDivOps");
		clickOn("#btn2");
		clickOn("#btnAssignValue");
		verifyThat("#txtResultField",  TextInputControlMatchers.hasText("1"));
	}
	@Test
	void checkIfDivOps2Ok() {
		clickOn("#btn1");
		clickOn("#btn2");
		clickOn("#btnDivOps");
		clickOn("#btn2");
		clickOn("#btnAssignValue");
		verifyThat("#txtResultField",  TextInputControlMatchers.hasText("6"));
	}
	@Test
	void checkIfByAddOpsSecondNumberNotInput() {
		clickOn("#btn1");
		clickOn("#btnAddOps");
		clickOn("#btnAssignValue");
		verifyThat("#txtResultField",  TextInputControlMatchers.hasText("1"));
	}
	@Test
	void checkIfBySubOpsSecondNumberNotInput() {
		clickOn("#btn1");
		clickOn("#btnSubOps");
		clickOn("#btnAssignValue");
		verifyThat("#txtResultField",  TextInputControlMatchers.hasText("1"));
	}
	@Test
	void checkIfByMultOpsSecondNumberNotInput() {
		clickOn("#btn1");
		clickOn("#btnMultOps");
		clickOn("#btnAssignValue");
		verifyThat("#txtResultField",  TextInputControlMatchers.hasText("0"));
	}
	
	@Test
	void checkIfByDivOpsSecondNumberNotInput() {
		clickOn("#btn1");
		clickOn("#btnMultOps");
		clickOn("#btnAssignValue");
		verifyThat("#txtResultField",  TextInputControlMatchers.hasText("0"));
	}
	
	@Test
	void testIfTypeIntoTextFieldAddOps() {
		clickOn("#txtResultField");
		write("22");
		clickOn("#btnAddOps");
		clickOn("#txtResultField");
		write("2");
		clickOn("#btnAssignValue");
		verifyThat("#txtResultField",  TextInputControlMatchers.hasText("24"));
	}
	
	@Test
	void testIfTypeIntoTextFieldSubOps() {
		clickOn("#txtResultField");
		write("22");
		clickOn("#btnSubOps");
		clickOn("#txtResultField");
		write("2");
		clickOn("#btnAssignValue");
		verifyThat("#txtResultField",  TextInputControlMatchers.hasText("20"));
	}
	
	@Test
	void testIfTypeIntoTextFieldMultOps() {
		clickOn("#txtResultField");
		write("22");
		clickOn("#btnMultOps");
		clickOn("#txtResultField");
		write("2");
		clickOn("#btnAssignValue");
		verifyThat("#txtResultField",  TextInputControlMatchers.hasText("44"));
	}

	@Test
	void testIfTypeIntoTextFieldDivOps() {
		clickOn("#txtResultField");
		write("22");
		clickOn("#btnDivOps");
		clickOn("#txtResultField");
		write("2");
		clickOn("#btnAssignValue");
		verifyThat("#txtResultField",  TextInputControlMatchers.hasText("11"));
	}
}
