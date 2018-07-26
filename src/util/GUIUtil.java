package util;

import java.awt.Color;
import java.awt.Dimension;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUIUtil {

	public static String imageFolder = "d:/workspace/billRecord/img";
	
	public static void setImageIcon(JButton b, String fileName, String tip){
		
		ImageIcon i = new ImageIcon(new File(imageFolder, fileName).getAbsolutePath());
		b.setIcon(i);
		b.setPreferredSize(new Dimension(61, 81));
		b.setToolTipText(tip);
		b.setVerticalTextPosition(JButton.BOTTOM);
		b.setHorizontalTextPosition(JButton.CENTER);
	    b.setText(tip);
	}
	
	
	public static void setColor(Color color, JComponent...cs){
		for(JComponent c : cs){
			c.setForeground(color);
		}
	}
	
	
	public static void showPanel(JPanel p, double strechRate){
		GUIUtil.userLNF();
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}


	private static void userLNF() {
		// TODO Auto-generated method stub
		
	}
}
