package bussinesslogic;

public class CustomCalculator
{

	public Integer devideOps(Integer num1, Integer num2)
	{
		Integer result = 0;
		if(num2.intValue() == 0){			
		}else{
			result = num1 / num2;
		}
		
		return result;
	}

	public Integer addOps(Integer num1, Integer num2)
	{
		return num1+num2;
	}

	public Integer subOps(Integer num1, Integer num2)
	{
		return num1 - num2;
	}

	public Integer multOps(Integer num1, Integer num2)
	{
		return num1*num2;
	}

}
