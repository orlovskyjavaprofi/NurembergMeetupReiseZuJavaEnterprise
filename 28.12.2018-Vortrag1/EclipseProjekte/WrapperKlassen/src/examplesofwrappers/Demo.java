package examplesofwrappers;

public class Demo
{
  public static void main(String[] args) {
	  printResultOfBooleanWrapper();
	  printResultOfCharacterWrapper();
	  printResultOfByteWrapperObj();
	  printResultOfShortWrapperObj();
	  printResultOfLongWraperObj();
	  printResultOfFloatWrapperObj();
	  printResultOfDoubleWrapperObj();
  }

private static void printResultOfDoubleWrapperObj()
  {
  	Double maxValueDouble = Double.MAX_VALUE;
  	System.out.println("Max Double "+ maxValueDouble.floatValue());
  }
  
private static void printResultOfFloatWrapperObj()
{
	Float maxValueFloat = Float.MAX_VALUE;
	  System.out.println("Max Float "+ maxValueFloat.floatValue());
}

private static void printResultOfLongWraperObj()
{
	Long maxValueLong = Long.MAX_VALUE;
	  System.out.println("Max Long: "+ maxValueLong.longValue());
}

private static void printResultOfShortWrapperObj()
{
	Short maxValueShort = Short.MAX_VALUE;
	  System.out.println("Max Short: "+maxValueShort.shortValue());
}

private static void printResultOfByteWrapperObj()
{
	Byte maxValueofByte = Byte.MAX_VALUE;
	  System.out.println("Max Byte: "+maxValueofByte.byteValue());
}

private static void printResultOfCharacterWrapper()
{
	Character sign ='$';
	  System.out.println("Character: "+sign.charValue());
}

private static void printResultOfBooleanWrapper()
{
	Boolean isResult = true;
	  System.out.println("Boolean: "+isResult.booleanValue());
}


}
