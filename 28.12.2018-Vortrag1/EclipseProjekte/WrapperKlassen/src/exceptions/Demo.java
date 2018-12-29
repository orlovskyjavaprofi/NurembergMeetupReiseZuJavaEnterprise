package exceptions;

public class Demo
{

	public static void main(String[] args) {
		String text = "";
		Demo demoObj= new Demo();
		validatingText(text, demoObj);
	}

	private static void validatingText(String text, Demo demoObj)
	{
		try
		{
			demoObj.checkText(text);
		} catch (MyException e)
		{
			e.printStackTrace();
		}
	}
	
	public void checkText(String inputText) throws MyException {
		if(inputText.isEmpty() == true) {
			throw new MyException("Text is Empty!");
		}
		
	}
}
