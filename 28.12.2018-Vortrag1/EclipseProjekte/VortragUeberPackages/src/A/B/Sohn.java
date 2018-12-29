package A.B;

import A.Vater;

public class Sohn extends Vater
{
   public static void main(String[] args) {
	   Sohn sohnObj = new Sohn();
	   System.out.println(sohnObj.augenFarbe);
	   System.out.println(sohnObj.nasenTyp);
//	   System.out.println(sohnObj.gesichtTyp); geht nicht wegen Vater default!
//	   System.out.println(sohnObj.haarFarbe); geht nicht wegen Vater private!
	   
   }
}
