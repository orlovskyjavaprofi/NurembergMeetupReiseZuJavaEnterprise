package ThreadExample;

public class PrintSign implements Runnable
{
	private  char sign;
    private volatile Integer amountOfTimes;
    
    public  PrintSign(char inputSign, Integer inputTimes) {
	  setSign( inputSign);
	  setAmountOfTimes(inputTimes);;
	 
	}
	
	@Override
	public synchronized void  run()
	{ 
		String threadName = Thread.currentThread().getName();
		System.out.println("\nCurrent running thread -> "+ threadName);
		printSignNAmoountTimes();
		System.out.println("\nCurrent ending thread -> "+ threadName);
	}

	private synchronized void printSignNAmoountTimes()
	{
		char actualSign = getSign();
		int number = getAmountOfTimes();
		String threadName = Thread.currentThread().getName();
		System.out.println("\nEntering print method and Current running thread -> "+ threadName);
		for (int i = 0; i <= number; i++)			
		{   
	
			System.out.print(actualSign);
		}	
	}

	public synchronized Integer getAmountOfTimes()
	{
		return amountOfTimes;
	}

	public synchronized void setAmountOfTimes(Integer amountOfTimes)
	{
		this.amountOfTimes = amountOfTimes;
	}

	public synchronized char getSign()
	{
		return sign;
	}

	public synchronized void setSign(char sign)
	{
		this.sign = sign;
	}

	
}
