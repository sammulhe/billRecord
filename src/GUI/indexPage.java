package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

public class indexPage {

	public static void main(String[] args){
		
		JFrame jf = new JFrame("一本糊涂账");
		jf.setSize(600,500);
		jf.setLocation(200,200);
		jf.setLayout(null);
		
		/*
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		JPanel p6 = new JPanel();
		JPanel p7 = new JPanel();*/
		
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JButton b4 = new JButton();
		JButton b5 = new JButton();
		JButton b6 = new JButton();
		JButton b7 = new JButton();
		
		
		JTabbedPane tp = new JTabbedPane();
		/*tp.add(p1, "消费一览");
		tp.add(p2, "记一笔");
		tp.add(p3, "消费记录");
		tp.add(p4, "月消费报表");
		tp.add(p5, "设置");
		tp.add(p6, "备份");
		tp.add(p7, "恢复");*/
		
		tp.add(b1, "消费一览");
		tp.add(b2, "记一笔");
		tp.add(b3, "消费记录");
		tp.add(b4, "月消费报表");
		tp.add(b5, "设置");
		tp.add(b6, "备份");
		tp.add(b7, "恢复");
		
		tp.setBounds(0,0,100,10);
		
		JPanel p = new JPanel();
		p.setBounds(0, 10, 600, 490);
		
		
		JSplitPane sp = new JSplitPane(JSplitPane.VERTICAL_SPLIT,tp,p);
		
		jf.setContentPane(sp);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
		
	}
}
