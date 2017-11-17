import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class GraphicsDrawLineMouseEx extends JFrame{
	Container contentPane;
	GraphicsDrawLineMouseEx(){
		setTitle("Drawing Line by Mouse ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String [] args){
		new GraphicsDrawLineMouseEx();
	}
	
	class MyPanel extends JPanel{
		Vector<Point> vStart = new Vector<Point>();
		Vector<Point> vEnd = new Vector<Point>();
		
		public MyPanel(){
			addMouseListener(new MouseAdapter(){
				public void mousePressed(MouseEvent e){
					Point startP = e.getPoint();
					vStart.add(startP);
				}
				
				public void mouseReleased(MouseEvent e){
					Point endP = e.getPoint();
					vEnd.add(endP);
					
					repaint();
				}
			});
		}
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			
			for(int i=0 ; i<vStart.size() ; i++){
				Point s = vStart.elementAt(i);
				Point e = vEnd.elementAt(i);
				
				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
			}
		}
	}
}
