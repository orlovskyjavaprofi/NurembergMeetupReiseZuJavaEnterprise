package BigNumbers;

import java.math.BigDecimal;

public class CaseBigNumbers
{
  public static void main(String args[]) {
	addGivenLongValueToBigDecimal();
  }

private static void addGivenLongValueToBigDecimal()
{
	Long number= Long.MAX_VALUE;
	System.out.println("Long number: "+number);
	BigDecimal bignumber =  BigDecimal.valueOf(number);
	bignumber = bignumber.add(BigDecimal.valueOf(99999));
	System.out.println("Result of bignumber: "+bignumber.toPlainString());
}
}
