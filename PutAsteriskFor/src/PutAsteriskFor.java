import java.util.Scanner;

public class PutAsteriskFor {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�� ���� *�� ǥ���մϱ�? : ");
		int n = stdIn.nextInt();

//		for(int i=0 ; i<n ; i++){
		for(int i=1 ; i<=n ; i++){
			System.out.print('*');
		}
	}
}