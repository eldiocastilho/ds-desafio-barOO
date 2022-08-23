package entities;

public class Bill {

	public static final double MVALTICKET = 10.00;
	public static final double FVALTICKET = 8.00;
	public static final double VALBEER = 5.00;
	public static final double VALSOFTDRINK = 3.00;
	public static final double VALBARBQ = 7.00;
	public static final double VALCOVER = 4.00;
	public static final double MINFEEDING = 30.00;

	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;

	public double cover() {
		double val = 0.0;
		if ( feeding() < MINFEEDING ) {
			return VALCOVER;
		} else {
			return val;
		}
	}

	public double feeding() {
		return (beer * VALBEER + barbecue * VALBARBQ + softDrink * VALSOFTDRINK);
	}

	public double ticket() {
		if (gender == 'M') {
			return MVALTICKET;
		} else {
			return FVALTICKET;
		}
	}
	
	public double total() {
		  return ( ticket() + cover() + feeding() );	
		}	

}
