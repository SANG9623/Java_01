
public class Boolean_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean bYes = true;
		boolean bNo = false;
		//boolean에서는 연산기호(+,1 : operator)를 사용할수 없다.
		//bYes =bYes + true;
		bYes = 1 == 2;
		// (== 이퀄부호가 두개 동시에 있을경우 같냐라고 물어보는 상태)
		
		System.out.println(bYes);
		// 1. eq(=) 기호를 중심으로 항상 오른쪽이 먼저 명령실행
		// 2. ==과  - 연산기호는 연산순서가 - 가 먼저 연산실행이 된다.
		// 3. 결국 2-1이 계산되어 결과가 1이 되고
		// 4. 1과1이 같냐 라고 물어 본다.
		bYes = 1 == 2 - 1;
		
		System.out.println(bYes);
		bYes = 1 = 2 -  1;
	}

}
