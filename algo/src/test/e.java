package test;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;

/*
22��
*/
public class e {

	public static void main(String[] args) throws Exception {

		File f = new File("d:\\img\\", "names.txt");//�ؽ�Ʈ ������ �ҷ��´�


		@SuppressWarnings("resource")
		RandomAccessFile r = new RandomAccessFile(f, "rw");//RandomAccessFile API�� ����Ͽ�
														   //���Ͽ� ����
		String text = "";
		String text2[] = null;
		ArrayList<String> list = new ArrayList<String>();
		while ((text = r.readLine()) != null) {
			text2 = text.split("\",\"");// " " �� , �� �����Ͽ� text2�� ����
		}

		for (int i = 0; i < text2.length; i++) {
			list.add(text2[i]);
		}

		list.set(0, list.get(0).substring(1));
		list.set(5162, list.get(5162).substring(0, 6));
		Collections.sort(list);//���ĺ������� ����
		System.out.println(list);

		int total = 0;
		for (int i = 0; i < list.size(); i++) {
			for(int j = 0 ; j < list.get(i).length() ; j++){
				//�ƽ�Ű�ڵ带 ����Ͽ� ���ĺ��� �����ϴ� ���ڸ� �����ͼ� ����Ѵ�.
				total += ((int)list.get(i).charAt(j)-64) * (i+1);
			}
		}
		System.out.println(total);
	}
}
