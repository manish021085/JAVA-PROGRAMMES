package numberProgrammes;

public class ArmstrongNumber {
	
	//In case of an Armstrong number of 3 digits, the sum of cubes of each digits is equal to the number itself
	//153 other armstrong number like 0,1,370,407
	//1*1*1=1
	//5*5*5=125
	//3*3*3*=27
	//then add 1+125+27=153
	
	public static void isArmstrongNumber(int num) {
		int cube = 0;
		int rem;
		int t = num;
		while(num >0) {
			rem = num%10;
			num = num/10;
			cube = cube +(rem*rem*rem);
		}
		if(t == cube) {
			System.out.println(t +" is armstrong number");
		}
		else {
			System.out.println(t +" is not an armstrong number");
		}
	}
	
	public static void main(String[] args) {
		isArmstrongNumber(153);
		isArmstrongNumber(234);
	}

}
