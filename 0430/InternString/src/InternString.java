
public class InternString {
	public static void main(String [] args){
		String s = "DEF";
		String s1 = "ABC" + s;
		String s2 = "ABC" + s;
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		
		if(s1 == s2)
			System.out.println("s1 == s2 �Դϴ�.");
		else
			System.out.println("s1 != s2 �Դϴ�.");
		
		s1 = s1.intern();
		s2 = s2.intern();
		
		if(s1 == s2)
			System.out.println("s1 == s2 �Դϴ�.");
		else
			System.out.println("s1 != s2 �Դϴ�.");
	}
}