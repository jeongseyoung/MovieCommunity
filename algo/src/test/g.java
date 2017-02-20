package test;

import java.math.BigInteger;

/*
55��
*/
public class g {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 10001; i++) {
			if (findNum(i)) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static boolean findNum(int num) {
		BigInteger bigNum = BigInteger.valueOf(num);//int�� long���� ���ϱ� ������ BigInteger�� �̿���.
		for (int i = 1; i < 51; i++) {
			//reverse()�� ����Ͽ� toString�� ���ڸ� �Ųٷ� ����Ѵ�.
			bigNum = bigNum.add(new BigInteger(new StringBuffer(bigNum.toString()).reverse().toString()));
			if (length(bigNum)) {
				return false;
			}
		}
		return true;
	}

	public static boolean length(BigInteger num) {
		int length = num.toString().length();
		//���ڸ� ������ �߶� ��Ī�غ� �� �������ش�
		for (int i = 0; i < length / 2; i++) {
			if (num.toString().charAt(i) != num.toString().charAt(length - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
