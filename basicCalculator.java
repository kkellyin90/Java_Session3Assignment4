
public class basicCalculator {

	public static void main(String[] args) {
		myCalculator cal1 = new myCalculator();
		System.out.println("The Sum of 18 + 2 is: " + cal1.add(18, 2));
		System.out.println("The difference of 18 - 2 is: " + cal1.sub(18, 2));
		System.out.println("The product of 18 * 2 is: " + cal1.mul(18, 2));
		System.out.println("The divisor of 18 / 2 is: " + cal1.div(18, 2));
	}

}
class myCalculator{
	public int add(int num1, int num2){
		return num1+num2;
	}
	public int sub(int num1, int num2){
		return num1-num2;
	}
	public int mul(int num1, int num2){
		return num1*num2;
	}
	public int div(int num1, int num2){
		return num1/num2;
	}
}