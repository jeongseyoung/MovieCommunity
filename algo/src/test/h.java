package test;

//39��.
public class h {
	public static void main(String[] args) {
		int count = 0;
		int max = 0; //���帹�� ī��Ʈ�� ������ ����
		int temp = 0;//�ѷ��� ���̸� ������ ����
		for (int p = 1; p < 1001; p++) {
			count = 0;
			for (int i = 1; i < 500; i++) {
				for (int j = 1; j < 500; j++) {
					int c = (int) (Math.pow(i, 2) + Math.pow(j, 2));
					if (i + j + Math.sqrt(c) == p) {
						//��Ÿ��������� �̿��Ͽ� �����ﰢ���� �Ǵ� ��쿡�� ī��Ʈ������
						count++;
					}
				}
			}

			if (count > max) {
				max = count;//�ι��� for������ �Ϸ�� ī��Ʈ�� max������ ������ max�� �����ϰ�
				temp = p;//temp�� p(�ѷ�)�� �����Ѵ�.
			}
		}
		System.out.println(temp);
	}
}
