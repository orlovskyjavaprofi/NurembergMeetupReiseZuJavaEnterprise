package gui.controllers;

import bussinesslogic.CustomCalculator;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainViewController
{
	@FXML
	private Button btn0;
	@FXML
	private Button btn1;
	@FXML
	private Button btn2;
	@FXML
	private Button btn3;
	@FXML
	private Button btn4;
	@FXML
	private Button btn5;
	@FXML
	private Button btn6;
	@FXML
	private Button btn7;
	@FXML
	private Button btn8;
	@FXML
	private Button btn9;
	@FXML
	private Button btnAddOps;
	@FXML
	private Button btnSubOps;
	@FXML
	private Button btnDivOps;
	@FXML
	private Button btnMultOps;
	@FXML
	private Button btnAssignValue;
	@FXML
	private TextField txtResultField;
	@FXML
	private Button btnCr;
	
    boolean addOpsActivated;
    boolean subOpsActivated;
    boolean devideOpsActivated;
    boolean multOpsActivated;
    Integer firstNumber;
    Integer secondNumber;
    
	@FXML
	private void initialize()
	{
		initOpsStates();
		clickNumberButtons();
		btnCr.setOnAction((event) -> {
			getTxtResultField().setText("");
		});
		btnOpsClicks();		
		btnAssignValue.setOnAction((event) -> {
			CustomCalculator calcObj;
			Integer result;
			
			calcOps();
		});
		
		txtResultField.setOnMouseClicked((event) -> {
			String defaultText="type here...";

			if(getTxtResultField().getText().equals(defaultText)) {
				getTxtResultField().setText("");
			}
		});
		
		
	}

	private void calcOps()
	{
		calcAddition();
		calcSubstraction();
		calcDevision();
		calcMultip();
	}

	private void calcMultip()
	{
		CustomCalculator calcObj;
		Integer result;
		if(multOpsActivated == true) {
		  setMultOpsActivated(false);
		  calcObj = createCustomCalcSetSecondNumber();
		  
		  result=calcObj.multOps(getFirstNumber(), getSecondNumber());
		  getTxtResultField().setText(String.valueOf(result.intValue()));
		}
	}

	private void calcDevision()
	{
		CustomCalculator calcObj;
		Integer result;
		if (devideOpsActivated == true){
		  setDevideOpsActivated(false);
		  calcObj = createCustomCalcSetSecondNumber();
			
		  result=calcObj.devideOps(getFirstNumber(), getSecondNumber());
		  getTxtResultField().setText(String.valueOf(result.intValue()));
		}
	}

	private void calcSubstraction()
	{
		CustomCalculator calcObj;
		Integer result;
		if(subOpsActivated == true) {
		  setSubOpsActivated(false);	
		  calcObj = createCustomCalcSetSecondNumber();
		  
		  result=calcObj.subOps(getFirstNumber(), getSecondNumber());
		  getTxtResultField().setText(String.valueOf(result.intValue()));
		}
	}

	private void calcAddition()
	{
		CustomCalculator calcObj;
		Integer result;
		if(addOpsActivated == true) {
		  
		  setAddOpsActivated(false);
		  calcObj = createCustomCalcSetSecondNumber();
		  
		  result=calcObj.addOps(getFirstNumber(), getSecondNumber());
		  getTxtResultField().setText(String.valueOf(result.intValue()));
		}
	}

	private void btnOpsClicks()
	{
		btnAddOps.setOnAction((event) -> {
			setAddOpsActivated(true);
			setFirstNumberAndCleanCalcDisplay();
		});
		
		btnSubOps.setOnAction((event) -> {
			setSubOpsActivated(true);
			setFirstNumberAndCleanCalcDisplay();
		});
		btnMultOps.setOnAction((event) -> {
			setMultOpsActivated(true);
			setFirstNumberAndCleanCalcDisplay();
		});
		btnDivOps.setOnAction((event) -> {
			setDevideOpsActivated(true);
			setFirstNumberAndCleanCalcDisplay();
		});
	}

	private void setFirstNumberAndCleanCalcDisplay()
	{
		setFirstNumber( Integer.parseInt(getTxtResultField().getText()));
		getTxtResultField().setText("");
	}

	private CustomCalculator createCustomCalcSetSecondNumber()
	{
		CustomCalculator calcObj;
		calcObj = new CustomCalculator();
		if (getTxtResultField().getText().isEmpty() == true)
		{
			getTxtResultField().setText("0");
			setSecondNumber(Integer.parseInt(getTxtResultField().getText()));
		} else
		{
			setSecondNumber(Integer.parseInt(getTxtResultField().getText()));
		}
		return calcObj;
	}

	private void initOpsStates()
	{
		setAddOpsActivated(false);
		setSubOpsActivated(false);
		setDevideOpsActivated(false);
		setMultOpsActivated(false);
	}

	private void clickNumberButtons()
	{
		
		btn0.setOnAction((event) -> {
			String text="";
			setCalcDisplayBtn0();
		});
		btn1.setOnAction((event) -> {
			String text="";
			setCalcDisplayBtn1();
		});
		btn2.setOnAction((event) -> {
			String text="";
			setCalcDisplayBtn2();
		});
		btn3.setOnAction((event) -> {
			String text="";
			setCalcDisplayBtn3();
		});
		btn4.setOnAction((event) -> {
			String text="";
			setCalcDisplayBtn4();
		});
		btn5.setOnAction((event) -> {
			String text="";
			setCalcDisplayBtn5();
		});
		btn6.setOnAction((event) -> {
			String text="";
			setCalcDisplayBtn6();
		});
		btn7.setOnAction((event) -> {
			String text="";
			setCalcDisplayBtn7();
		});
		btn8.setOnAction((event) -> {
			String text="";
			setCalcDisplayBtn8();
		});
		btn9.setOnAction((event) -> {
			String text="";
			setCalcDisplayBtn9();
		});
	}

	private void setCalcDisplayBtn9()
	{
		String text;
		if(getTxtResultField().getText().equals("type here...")) {
			getTxtResultField().setText("9");	
		}else {
		   text = getTxtResultField().getText();
		   getTxtResultField().setText(text+"9");
		}
	}

	private void setCalcDisplayBtn8()
	{
		String text;
		if(getTxtResultField().getText().equals("type here...")) {
			getTxtResultField().setText("8");	
		}else {
		   text = getTxtResultField().getText();
		   getTxtResultField().setText(text+"8");
		}
	}

	private void setCalcDisplayBtn7()
	{
		String text;
		if(getTxtResultField().getText().equals("type here...")) {
			getTxtResultField().setText("7");	
		}else {
		   text = getTxtResultField().getText();
		   getTxtResultField().setText(text+"7");
		}
	}

	private void setCalcDisplayBtn6()
	{
		String text;
		if(getTxtResultField().getText().equals("type here...")) {
			getTxtResultField().setText("6");	
		}else {
		   text = getTxtResultField().getText();
		   getTxtResultField().setText(text+"6");
		}
	}

	private void setCalcDisplayBtn5()
	{
		String text;
		if(getTxtResultField().getText().equals("type here...")) {
			getTxtResultField().setText("5");	
		}else {
		   text = getTxtResultField().getText();
		   getTxtResultField().setText(text+"5");
		}
	}

	private void setCalcDisplayBtn4()
	{
		String text;
		if(getTxtResultField().getText().equals("type here...")) {
			getTxtResultField().setText("4");	
		}else {
		   text = getTxtResultField().getText();
		   getTxtResultField().setText(text+"4");
		}
	}

	private void setCalcDisplayBtn3()
	{
		String text;
		if(getTxtResultField().getText().equals("type here...")) {
			getTxtResultField().setText("3");	
		}else {
		   text = getTxtResultField().getText();
		   getTxtResultField().setText(text+"3");
		}
	}

	private void setCalcDisplayBtn2()
	{
		String text;
		if(getTxtResultField().getText().equals("type here...")) {
			getTxtResultField().setText("2");	
		}else {
		   text = getTxtResultField().getText();
		   getTxtResultField().setText(text+"2");
		}
	}

	private void setCalcDisplayBtn1()
	{
		String text;
		if(getTxtResultField().getText().equals("type here...")) {
			getTxtResultField().setText("1");	
		}else {
		   text = getTxtResultField().getText();
		   getTxtResultField().setText(text+"1");
		}
	}

	private void setCalcDisplayBtn0()
	{
		String text;
		if(getTxtResultField().getText().equals("type here...")) {
			getTxtResultField().setText("0");	
		}else {
		   text = getTxtResultField().getText();
		   getTxtResultField().setText(text+"0");
		}
	}
	
	
	
	public Button getBtnCr()
	{
		return btnCr;
	}

	public void setBtnCr(Button btnCr)
	{
		this.btnCr = btnCr;
	}

	public Button getBtnMultOps()
	{
		return btnMultOps;
	}

	public void setBtnMultOps(Button btnMultOps)
	{
		this.btnMultOps = btnMultOps;
	}

	public Integer getFirstNumber()
	{
		return firstNumber;
	}

	public void setFirstNumber(Integer firstNumber)
	{
		this.firstNumber = firstNumber;
	}

	public Integer getSecondNumber()
	{
		return secondNumber;
	}

	public void setSecondNumber(Integer secondNumber)
	{
		this.secondNumber = secondNumber;
	}

	public boolean isMultOpsActivated()
	{
		return multOpsActivated;
	}

	public void setMultOpsActivated(boolean multOpsActivated)
	{
		this.multOpsActivated = multOpsActivated;
	}

	public boolean isAddOpsActivated()
	{
		return addOpsActivated;
	}

	public void setAddOpsActivated(boolean addOpsActivated)
	{
		this.addOpsActivated = addOpsActivated;
	}

	public boolean isSubOpsActivated()
	{
		return subOpsActivated;
	}

	public void setSubOpsActivated(boolean subOpsActivated)
	{
		this.subOpsActivated = subOpsActivated;
	}

	public boolean isDevideOpsActivated()
	{
		return devideOpsActivated;
	}

	public void setDevideOpsActivated(boolean devideOpsActivated)
	{
		this.devideOpsActivated = devideOpsActivated;
	}

	public TextField getTxtResultField()
	{
		return txtResultField;
	}

	public void setTxtResultField(TextField txtResultField)
	{
		this.txtResultField = txtResultField;
	}

	public Button getBtnAddOps()
	{
		return btnAddOps;
	}

	public void setBtnAddOps(Button btnAddOps)
	{
		this.btnAddOps = btnAddOps;
	}

	public Button getBtnSubOps()
	{
		return btnSubOps;
	}

	public void setBtnSubOps(Button btnSubOps)
	{
		this.btnSubOps = btnSubOps;
	}

	public Button getBtnDivOps()
	{
		return btnDivOps;
	}

	public void setBtnDivOps(Button btnDivOps)
	{
		this.btnDivOps = btnDivOps;
	}

	public Button getBtnAssignValue()
	{
		return btnAssignValue;
	}

	public void setBtnAssignValue(Button btnAssignValue)
	{
		this.btnAssignValue = btnAssignValue;
	}

	public Button getBtn0()
	{
		return btn0;
	}

	public void setBtn0(Button btn0)
	{
		this.btn0 = btn0;
	}

	public Button getBtn1()
	{
		return btn1;
	}

	public void setBtn1(Button btn1)
	{
		this.btn1 = btn1;
	}

	public Button getBtn2()
	{
		return btn2;
	}

	public void setBtn2(Button btn2)
	{
		this.btn2 = btn2;
	}

	public Button getBtn3()
	{
		return btn3;
	}

	public void setBtn3(Button btn3)
	{
		this.btn3 = btn3;
	}

	public Button getBtn4()
	{
		return btn4;
	}

	public void setBtn4(Button btn4)
	{
		this.btn4 = btn4;
	}

	public Button getBtn5()
	{
		return btn5;
	}

	public void setBtn5(Button btn5)
	{
		this.btn5 = btn5;
	}

	public Button getBtn6()
	{
		return btn6;
	}

	public void setBtn6(Button btn6)
	{
		this.btn6 = btn6;
	}

	public Button getBtn7()
	{
		return btn7;
	}

	public void setBtn7(Button btn7)
	{
		this.btn7 = btn7;
	}

	public Button getBtn8()
	{
		return btn8;
	}

	public void setBtn8(Button btn8)
	{
		this.btn8 = btn8;
	}

	public Button getBtn9()
	{
		return btn9;
	}

	public void setBtn9(Button btn9)
	{
		this.btn9 = btn9;
	}

}
