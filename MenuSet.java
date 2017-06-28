package Project4_RushHour;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class MenuSet extends JFrame {
	Container contentPane = getContentPane();
	ImageIcon logo = new ImageIcon("./Resource/image/Logo.gif");
	JLabel lb_logo = new JLabel("", logo, JLabel.CENTER);
	JPanel pn_level = new JPanel();

	static JLabel lb_diff[] = new JLabel[4];
	
	JButton lb_level[] = new JButton[40];
	MenuSet() {
		setTitle("Rush Hour!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		setSize(530, 615);

		lb_logo.setSize(350, 100);
		lb_logo.setLocation(80, 30);
		contentPane.add(lb_logo);

		pn_level.setLayout(new GridLayout(11, 4, 2, 2));
		pn_level.setBackground(Color.white);
		pn_level.setSize(350, 300);
		pn_level.setLocation(80, 150);
		contentPane.add(pn_level);
		
		lb_diff[0] = new JLabel("Easy");
		lb_diff[0].setOpaque(true);
		lb_diff[0].setBackground(Color.ORANGE);
		lb_diff[0].setHorizontalAlignment(JLabel.CENTER);
		pn_level.add(lb_diff[0]);

		lb_diff[1] = new JLabel("Normal");
		lb_diff[1].setOpaque(true);
		lb_diff[1].setBackground(Color.ORANGE);
		lb_diff[1].setHorizontalAlignment(JLabel.CENTER);
		pn_level.add(lb_diff[1]);

		lb_diff[2] = new JLabel("Hard");
		lb_diff[2].setOpaque(true);
		lb_diff[2].setBackground(Color.ORANGE);
		lb_diff[2].setHorizontalAlignment(JLabel.CENTER);
		pn_level.add(lb_diff[2]);

		lb_diff[3] = new JLabel("Extreme");
		lb_diff[3].setOpaque(true);
		lb_diff[3].setBackground(Color.ORANGE);
		lb_diff[3].setHorizontalAlignment(JLabel.CENTER);
		pn_level.add(lb_diff[3]);
		for (int i = 0; i < lb_level.length; i++) {
			if((i+1)%4 == 1){
				lb_level[i] = new JButton("Level " + (i/4 + 1));
			}
			else if((i+1)%4 == 2){
				lb_level[i] = new JButton("Level " + (i/4 + 11));
			}
			else if((i+1)%4 == 3){
				lb_level[i] = new JButton("Level " + (i/4 + 21));
			}
			else if((i+1)%4 == 0){
				lb_level[i] = new JButton("Level " + (i/4 + 31));
			}
			lb_level[i].setBorderPainted(false);
			lb_level[i].setOpaque(true);
			lb_level[i].setBackground(Color.CYAN);
			lb_level[i].setHorizontalAlignment(JLabel.CENTER);
			lb_level[i].setName(lb_level[i].getText());
			lb_level[i].addMouseListener(new MouseListen());
			pn_level.add(lb_level[i]);
		}

		setVisible(true);
	}
	
	class MouseListen implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			setVisible(false);
			if(e.getComponent().getName().equals("Level 1")){		//각 번호에 맞게 name을 주었음
				new MapSet1();
			}
			else if(e.getComponent().getName().equals("Level 2")){
				
			}
			else if(e.getComponent().getName().equals("Level 3")){
				
			}
			else if(e.getComponent().getName().equals("Level 4")){
				
			}
			else if(e.getComponent().getName().equals("Level 5")){
				new MapSet5();
			}
			else if(e.getComponent().getName().equals("Level 6")){
				
			}
			else if(e.getComponent().getName().equals("Level 7")){
				
			}
			else if(e.getComponent().getName().equals("Level 8")){
				
			}
			else if(e.getComponent().getName().equals("Level 9")){
				
			}
			else if(e.getComponent().getName().equals("Level 10")){
				new MapSet10();
			}
			else if(e.getComponent().getName().equals("Level 11")){
				new MapSet11();
			}
			else if(e.getComponent().getName().equals("Level 12")){
				
			}
			else if(e.getComponent().getName().equals("Level 13")){
				
			}
			else if(e.getComponent().getName().equals("Level 14")){
				
			}
			else if(e.getComponent().getName().equals("Level 15")){
				
			}
			else if(e.getComponent().getName().equals("Level 16")){
				
			}
			else if(e.getComponent().getName().equals("Level 17")){
				
			}
			else if(e.getComponent().getName().equals("Level 18")){
				
			}
			else if(e.getComponent().getName().equals("Level 19")){
				
			}
			else if(e.getComponent().getName().equals("Level 20")){
				
			}
			else if(e.getComponent().getName().equals("Level 21")){
				
			}
			else if(e.getComponent().getName().equals("Level 22")){
				
			}
			else if(e.getComponent().getName().equals("Level 23")){
				
			}
			else if(e.getComponent().getName().equals("Level 24")){
				
			}
			else if(e.getComponent().getName().equals("Level 25")){
				
			}
			else if(e.getComponent().getName().equals("Level 26")){
				
			}
			else if(e.getComponent().getName().equals("Level 27")){
				
			}
			else if(e.getComponent().getName().equals("Level 28")){
				
			}
			else if(e.getComponent().getName().equals("Level 29")){
				
			}
			else if(e.getComponent().getName().equals("Level 30")){
				
			}
			else if(e.getComponent().getName().equals("Level 31")){
				
			}
			else if(e.getComponent().getName().equals("Level 32")){
				
			}
			else if(e.getComponent().getName().equals("Level 33")){
				
			}
			else if(e.getComponent().getName().equals("Level 34")){
				
			}
			else if(e.getComponent().getName().equals("Level 35")){
				
			}
			else if(e.getComponent().getName().equals("Level 36")){
				
			}
			else if(e.getComponent().getName().equals("Level 37")){
				
			}
			else if(e.getComponent().getName().equals("Level 38")){
				
			}
			else if(e.getComponent().getName().equals("Level 39")){
				
			}
			else if(e.getComponent().getName().equals("Level 40")){
				
			}
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
