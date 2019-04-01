package danilova.hometask;

public class Demo {

	public static void main(String[] args) {
		FractionNumberOperation fractionNumberOperation = new FractionNumberOperationImp();
		FractionNumber a = new FractionNumberImp(-4,4);
		FractionNumber b = new FractionNumberImp(3,-7);
		System.out.println(fractionNumberOperation.add(a, b));
		System.out.println(fractionNumberOperation.sub(a, b));
		System.out.println(fractionNumberOperation.mul(a, b));
		System.out.println(fractionNumberOperation.div(a, b));
	}

}
