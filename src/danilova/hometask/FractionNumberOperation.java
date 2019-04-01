package danilova.hometask;

/**
 * ��������� �������� � ������� FractionNumber.
 * ��� ������ ������ ������� ����� ������� {@code ArithmeticException}
 */

public interface FractionNumberOperation {
	/**
	 * �������� ���� ����� {@code FractionNumber}
	 * @param a ������ ������� �����
	 * @param b ������ ������� �����
	 */
	FractionNumber add(FractionNumber a, FractionNumber b);
	
	/**
	 * ������� ���� ����� {@code FractionNumber}
	 * @param a ������ ������� �����
	 * @param b ������ ������� �����
	 */
	FractionNumber div(FractionNumber a, FractionNumber b);
	
	/**
	 * ��������� ���� ����� {@code FractionNumber}
	 * @param a ������ ������� �����
	 * @param b ������ ������� �����
	 */
	FractionNumber mul(FractionNumber a, FractionNumber b);
	
	/**
	 * ��������� ���� ����� {@code FractionNumber}
	 * @param a ������ ������� �����
	 * @param b ������ ������� �����
	 */
	FractionNumber sub(FractionNumber a, FractionNumber b);
}
