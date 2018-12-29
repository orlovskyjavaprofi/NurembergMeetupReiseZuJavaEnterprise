package A.B.C;

import A.Vater;

public class Tochter extends Vater
{
	   public static void main(String[] args) {
		   Tochter tochterObj = new Tochter();
		   System.out.println(tochterObj.augenFarbe);
		   System.out.println(tochterObj.nasenTyp);
//		   System.out.println(tochterObj.gesichtTyp); geht nicht wegen Vater default!
//		   System.out.println(tochterObj.haarFarbe); geht nicht wegen Vater private!
		   
	   }
}
