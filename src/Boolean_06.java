
public class Boolean_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		
		boolean bYes =true;
		//&& �ΰ� �̻��� �񱳿��� ����� ��� true �ΰ��� �Ǵ��ϴ°�.
		
		bYes = num1 == num2 && num3 == num4; // f and f : ��� 
		bYes = num1 == num1 && num3 == num4; // t and f
		bYes = num1 == num2 && num3 == num3; // f and t
		bYes = num2 == num2 && num3 == num3; // t and t
		//|| �ΰ� �̻��� �񱳿������� 1����  true�ΰ��� �Ǵ�.
		// OR�����̶�� �Ѵ�.
		bYes = num1 == num2 ||num3 == num4;// f or f ��� false
		bYes = num1 == num2 ||num3 == num4;// t or f ��� true
		bYes = num1 == num2 ||num3 == num4;// f or t ��� true
		// (false or true) and false >> true and false
		bYes = num1 == num2 || num3 == num3 && num4 == num3;
		System.out.println(bYes);
		
		num4 = 3 + (4 * ((5-2) % 3 ));
		
		
	}

}