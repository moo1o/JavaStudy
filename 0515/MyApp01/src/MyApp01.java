import javax.swing.*;

class MyFrame extends JFrame{
	MyFrame(){
		setTitle("첫번째 프레임");
		setSize(300, 300);
		setVisible(true);
	}
}

public class MyApp01 {
	public static void main(String [] args){
		MyFrame mf = new MyFrame();
	}
}
