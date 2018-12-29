package app.main;

public class Main
{
	private Integer inputForNumber1;
	private Integer inputForNumber2;

	public Main()
	{
		inputForNumber1 = 0;
		inputForNumber2 = 6;
	}
	
	public static void main(String[] args)
	{
		Main workWithNumbersObj = new Main();
		workWithNumbersObj.printResultOfAddition();
	}
	private void printResultOfAddition()
	{
		String message = "claculating two numbers: ";
		System.out.println(message+inputForNumber1 + " + " +inputForNumber2+ " : "+
	                        calculateSum(inputForNumber1, inputForNumber2));
	}
	private Integer calculateSum(Integer num1, Integer num2)
	{
		return num1 + num2;
	}
	public Integer getInputForNumber1()
	{
		return inputForNumber1;
	}
	public Integer getInputForNumber2()
	{
		return inputForNumber2;
	}
	
}
