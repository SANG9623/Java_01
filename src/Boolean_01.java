
public class Boolean_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean bYes = true;
		boolean bNo = false;
		//boolean������ �����ȣ(+,1 : operator)�� ����Ҽ� ����.
		//bYes =bYes + true;
		bYes = 1 == 2;
		// (== ������ȣ�� �ΰ� ���ÿ� ������� ���Ķ�� ����� ����)
		
		System.out.println(bYes);
		// 1. eq(=) ��ȣ�� �߽����� �׻� �������� ���� ���ɽ���
		// 2. ==��  - �����ȣ�� ��������� - �� ���� ��������� �ȴ�.
		// 3. �ᱹ 2-1�� ���Ǿ� ����� 1�� �ǰ�
		// 4. 1��1�� ���� ��� ���� ����.
		bYes = 1 == 2 - 1;
		
		System.out.println(bYes);
		bYes = 1 = 2 -  1;
	}

}