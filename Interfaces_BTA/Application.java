
public class Application {

	public static void main(String[] args) {
		RationalNumber r1 = new RationalNumber(6, 8);
        RationalNumber r2 = new RationalNumber(1, 3);
        RationalNumber r3 = new RationalNumber(9999, 10000);
        RationalNumber r4 = new RationalNumber(9998, 10000);
        RationalNumber r5 = new RationalNumber(6, 8);
        RationalNumber r6 = new RationalNumber(12, 16);

        //testing the rational numbers from the RationalTester class
        if (r1.compareTo(r2) == 0)
            System.out.println("r1 and r2 are equal.");
        else
            System.out.println("r1 and r2 are NOT equal.");
        
        //testing larger numbers to make sure their values fall within the threshold
        if (r3.compareTo(r4) == 0)
            System.out.println("r3 and r4 are equal.");
        else
            System.out.println("r3 and r4 are NOT equal.");
        
        //testing rational numbers that reduce to be equal
        if (r5.compareTo(r6) == 0)
            System.out.println("r5 and r6 are equal.");
        else
            System.out.println("r5 and r6 are NOT equal.");
	}//end main
}//end class