package danilova.hometask;


public class FractionNumberImp implements FractionNumber {

	private int divident;
	private int divisor;
	
	public FractionNumberImp(int divident, int divisor) {
		this.divident = divident;
		this.divisor = divisor;
		
	}

	@Override
	public int getDivident() {
		return divident;
	}

	@Override
	public int getDivisor() {
		return divisor;
	}

	@Override
	public void setDivident(int divident) {
		this.divident = divident;
	}

	@Override
	public void setDivisor(int divisor) {
		this.divisor = divisor; 
	}
	
	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append(divident + "/" + divisor);
		return b.toString();
	}

	@Override
	public double value() {
		double h = divident/divisor;
		return h;
	}

}
