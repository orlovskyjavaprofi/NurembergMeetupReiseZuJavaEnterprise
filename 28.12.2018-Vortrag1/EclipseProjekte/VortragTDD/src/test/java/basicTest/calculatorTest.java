package basicTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import bussinesslogic.CustomCalculator;

class calculatorTest
{
    CustomCalculator calcObj; 
   
   @BeforeEach
   public void init() {
	   calcObj = new CustomCalculator(); 
   }
	

	@Test
	public void testIfCalcObjectNotExist() {
		assertNotNull(calcObj);
	}
	
	@Disabled
	@Test
	public void testIfCalcCanNotDevide0() {
		Integer num1=1;
		Integer num2=0;
		Throwable exception = assertThrows(ArithmeticException.class, () -> {
			calcObj.devideOps(num1, num2);
        });
        assertEquals("/ by zero", exception.getMessage());
	}
	
	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3,4,5,6,7,8,9,10 })
	public void testIfCalcDevidePosNumbers(int argument) {
		assertNotNull(calcObj.devideOps(argument, argument+1));
	}
	
	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3,4,5,6,7,8,9,10 })
	public void testIfCalcCanAdd(int argument) {
		assertNotNull(calcObj.addOps(argument, argument+1));
	}
	
	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3,4,5,6,7,8,9,10 })
	public void testIfCalcCanSub(int argument) {
		assertNotNull(calcObj.subOps(argument, argument+1));
	}
	
	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3,4,5,6,7,8,9,10 })
	public void testIfCalcCanMult(int argument) {
		assertNotNull(calcObj.multOps(argument, argument+1));
	}

}
