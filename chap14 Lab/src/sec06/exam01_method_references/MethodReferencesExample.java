package sec06.exam01_method_references;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		//�͸�����ü
		operator=new IntBinaryOperator() {
			@Override
			public int applyAsInt(int left,int right) {
				return 0;
		}
		};
		
		//2.���ٽ�--------------------------------------------
		operator = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println("���1: " + operator.applyAsInt(1, 2));

		//3.���� �޼ҵ� ���� ---------------------------------
		operator = Calculator :: staticMethod;
		System.out.println("���2: " +  operator.applyAsInt(3, 4));

		//���ٽ�
		Calculator obj = new Calculator();
		operator = (x, y) -> obj.instanceMethod(x, y);
		System.out.println("���3: " + operator.applyAsInt(5, 6));

		//�ν��Ͻ� �޼ҵ� ���� ---------------------------
		operator = obj :: instanceMethod;
		System.out.println("���4: " + operator.applyAsInt(7, 8));
	}
}
