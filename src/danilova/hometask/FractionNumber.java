package danilova.hometask;

/**
 * ��������� {@code FractionNumber} ������������ ����� � ���� �����.
 * ��� ������ ������ ������� ����� ������� IllegalArgumentException.
 * ������ ��������� ����� ���� ����������� ��� �������� ������� ������,
 * �������� 1/2, 1/4, 3/7 � �.�
 */

public interface FractionNumber {
	public static int DEFAULT_DIVISOR_VALUE = 1;
	
	/**
	 * �������� �������
	 */
	int getDivident();
	
	/**
	 * �������� ��������
	 */
	int getDivisor();
	
	/**
	 * ���������� �������
	 */
	void setDivident(int divident);
	
	/**
	 * ���������� ��������
	 * @param divisor ��������
	 * @throws IllegalArgumentException ���� �������� ���������� �������� ����� 0
	 */
	void setDivisor(int divisor);
	
	/**
	 * �������� ���������� ������������� �����.
	 * 
	 * ��������:
     * <blockquote><pre>
     * ���� ������� = 1, �������� = 4,
     * �� ���������� ������������� ����� - 1/4
     * </pre></blockquote>
	 */
	String toString();
	
	/**
	 * �������� �������� ��� ������������ �����
	 */
	double value();
}
