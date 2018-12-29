package casting;

public class example
{
  public static void main(String[] args) {
	  System.out.println("You cant cast Long to Byte!");
	  printResultCastingLongToByte();
	  System.out.println("\nBut you can cast Byte to Long!");
	  printResultCastingByteToLong();
  }

private static void printResultCastingByteToLong()
{
	Byte maxValue = Byte.MAX_VALUE;
	  System.out.println("Input Byte: "+ maxValue);
	  Long resultValue = (Long)maxValue.longValue();
	  System.out.println("Byte to Long result: "+ resultValue);
}

private static void printResultCastingLongToByte()
{
	  Long maxValue = Long.MAX_VALUE;
	  System.out.println("Input Long: "+ maxValue);
	  Byte resultValue = (Byte)maxValue.byteValue();
	  System.out.println("Long to Byte result: "+ resultValue);
}
}
