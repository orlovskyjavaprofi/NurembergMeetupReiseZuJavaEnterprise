package exampleOfThis;

public class Dog
{
	private String dogBarkMessage;

	public static void main(String[] args)
	{
       Dog dogObj = new Dog();
       dogObj.dogBarkMessage ="Bark! Bark!";
       dogObj.printDogBark();
	}
	
	private void printDogBark() {
		System.out.println(this.dogBarkMessage);
	}

}
