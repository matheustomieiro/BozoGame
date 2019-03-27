import java.util.Calendar;

public class Random {
	//Attributing values to variables.
	private long p = 2147483648L; 
	private long m = 843314861;
	private long a = 453816693;
	private long s = 1023;

	//Constructors for seed
	public Random(long seed) {
		s = seed;
	}
	
	public Random() {
		s = Calendar.getInstance().getTimeInMillis();
	}
	
	public double getRand() {
		//Initializing xii e attributing the value of equation for it. 
		double xii = (a+(m*s))%p;
		s = (long)xii;
		return (xii/p);
	}

	public int getIntRand(int max) {
		return (int)(((getRand())* (double)max));
	}
	
	public int getIntRand(int min, int max) {
		return (getIntRand(max)) + 1;
	}
	
	public int getIntRand() {
		return Math.abs(getIntRand(Integer.MAX_VALUE));
	}
	
	@Override
	public String toString() {
		return getIntRand() + "";
	}

}
