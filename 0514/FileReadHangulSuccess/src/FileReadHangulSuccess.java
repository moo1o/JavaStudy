import java.io.*;

public class FileReadHangulSuccess {
	public static void main(String [] args){
		InputStreamReader in = null;
		FileInputStream fin = null;
		try{
			fin = new FileInputStream("c:\\tmp\\hangul.txt");
//			in = new InputStreamReader(fin, "MS949");
			in = new InputStreamReader(fin, "US-ASCII");
			int c;
			System.out.println("인코딩 문자 집합은 " + in.getEncoding());
			while((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		} catch(IOException e){
			System.out.println("입출력 오류");
		}
	}
}
