package danilova.hometask;

public class FractionNumberOperationImp implements FractionNumberOperation {
	public int divisor;
	public int divident;

	@Override
	public FractionNumber add(FractionNumber a, FractionNumber b) {
		int divident = a.getDivident()*b.getDivisor()+b.getDivident()*a.getDivisor();
		int divisor = a.getDivisor()*b.getDivisor();
		if (Math.abs(divident)>Math.abs(divisor)) {
		for (int i=Math.abs(divisor); i>1; i--) {
			if ((Math.abs(divisor)%i == 0)&&(Math.abs(divident)%i == 0)) {
				if ((divident<0)&&(divisor<0)) {
				divisor =Math.abs(divisor) / i;
				divident = Math.abs(divident) / i;
			}else {
				divisor /= i;
				divident /= i;
				}
			}
				}	}	
		if (Math.abs(divident)<Math.abs(divisor)){
			for (int i=Math.abs(divident); i>1; i--) {
				if ((Math.abs(divisor)%i == 0)&&(Math.abs(divident)%i == 0)) {
					if ((divident<0)&&(divisor<0)) {
					divisor =Math.abs(divisor) / i;
					divident = Math.abs(divident) / i;
				}else {
					divisor /= i;
					divident /= i;
					}
				}
			}
		}
		
		FractionNumber fractionNumber = new FractionNumberImp(divident, divisor);
		return fractionNumber;
	}

	@Override
	public FractionNumber div(FractionNumber a, FractionNumber b) {
		int divident = a.getDivident()*b.getDivisor();
		int divisor = b.getDivident()*a.getDivisor();
		if (divisor == 0) {System.out.println("Divisor is zero!");}
		if (Math.abs(divident)>Math.abs(divisor)) {
			for (int i=Math.abs(divisor); i>1; i--) {
				if ((Math.abs(divisor)%i == 0)&&(Math.abs(divident)%i == 0)) {
					if ((divident<0)&&(divisor<0)) {
					divisor =Math.abs(divisor) / i;
					divident = Math.abs(divident) / i;
				}else {
					divisor /= i;
					divident /= i;
					}
				}
					}	}	
			if (Math.abs(divident)<Math.abs(divisor)){
				for (int i=Math.abs(divident); i>1; i--) {
					if ((Math.abs(divisor)%i == 0)&&(Math.abs(divident)%i == 0)) {
						if ((divident<0)&&(divisor<0)) {
						divisor =Math.abs(divisor) / i;
						divident = Math.abs(divident) / i;
					}else {
						divisor /= i;
						divident /= i;
						}
					}
				}
			}
		FractionNumber fractionNumber = new FractionNumberImp(divident, divisor);
		return fractionNumber;
	}

	@Override
	public FractionNumber mul(FractionNumber a, FractionNumber b) {
		int divident = a.getDivident()*b.getDivident();
		int divisor = b.getDivisor()*a.getDivisor();
		if (Math.abs(divident)>Math.abs(divisor)) {
			for (int i=Math.abs(divisor); i>1; i--) {
				if ((Math.abs(divisor)%i == 0)&&(Math.abs(divident)%i == 0)) {
					if ((divident<0)&&(divisor<0)) {
					divisor =Math.abs(divisor) / i;
					divident = Math.abs(divident) / i;
				}else {
					divisor /= i;
					divident /= i;
					}
				}
					}	}	
			if (Math.abs(divident)<Math.abs(divisor)){
				for (int i=Math.abs(divident); i>1; i--) {
					if ((Math.abs(divisor)%i == 0)&&(Math.abs(divident)%i == 0)) {
						if ((divident<0)&&(divisor<0)) {
						divisor =Math.abs(divisor) / i;
						divident = Math.abs(divident) / i;
					}else {
						divisor /= i;
						divident /= i;
						}
					}
				}
			}
		FractionNumber fractionNumber = new FractionNumberImp(divident, divisor);
		return fractionNumber;
	}

	@Override
	public FractionNumber sub(FractionNumber a, FractionNumber b) {
		int divident = a.getDivident()*b.getDivisor()-b.getDivident()*a.getDivisor();
		int divisor = a.getDivisor()*b.getDivisor();
		if (Math.abs(divident)>Math.abs(divisor)) {
			for (int i=Math.abs(divisor); i>1; i--) {
				if ((Math.abs(divisor)%i == 0)&&(Math.abs(divident)%i == 0)) {
					if ((divident<0)&&(divisor<0)) {
					divisor =Math.abs(divisor) / i;
					divident = Math.abs(divident) / i;
				}else {
					divisor /= i;
					divident /= i;
					}
				}
					}	}	
			if (Math.abs(divident)<Math.abs(divisor)){
				for (int i=Math.abs(divident); i>1; i--) {
					if ((Math.abs(divisor)%i == 0)&&(Math.abs(divident)%i == 0)) {
						if ((divident<0)&&(divisor<0)) {
						divisor =Math.abs(divisor) / i;
						divident = Math.abs(divident) / i;
					}else {
						divisor /= i;
						divident /= i;
						}
					}
				}
			}
		FractionNumber fractionNumber = new FractionNumberImp(divident, divisor);
		return fractionNumber;
	}

}
