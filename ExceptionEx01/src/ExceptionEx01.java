import java.util.Scanner;


public class ExceptionEx01 {
	public static void main(String [] args){
		Scanner stdIn = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;
		
		System.out.print("나뉨수를 입력하시오. : ");
		dividend = stdIn.nextInt();
		System.out.print("나눗수를 입력하시오. : ");
		divisor = stdIn.nextInt();
		System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다. ");
	}
}
