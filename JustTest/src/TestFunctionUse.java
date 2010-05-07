/*测试Java中函数调用的单向传值*/
public class TestFunctionUse {
	public static void main(String args[]){
		TestFunctionUse test=new TestFunctionUse();
		int a=3,b=4;
		System.out.println("a="+a);
		System.out.println("b="+b);
		test.swap(a,b);
		
		System.out.println("a="+a);
		System.out.println("b="+b);

	}
	
	void swap(int num1,int num2){
		int temp;
		if(num1<num2){
			temp=num1;
			num1=num2;
			num2=temp;
		}
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		
	}
}
