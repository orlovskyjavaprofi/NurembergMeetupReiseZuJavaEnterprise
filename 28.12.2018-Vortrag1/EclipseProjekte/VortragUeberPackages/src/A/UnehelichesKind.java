package A;

public class UnehelichesKind extends Vater
{
    public static void main(String[] args) {
    	UnehelichesKind kindObj = new UnehelichesKind();
    	System.out.println(kindObj.gesichtTyp);  //das geht weil die klasse erbt und in gleicher Paket!
    }
}
