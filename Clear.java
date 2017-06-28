package Project4_RushHour;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Clear extends JFrame{
	Container contentPane = getContentPane();
	ImageIcon icon = new ImageIcon("./Resource/image/clear.jpg");
	JPanel panel;
	JButton bt1 = new JButton("ReStart!");
	JButton bt2 = new JButton("Exit.");
	JLabel lb_clear = new JLabel("CLEAR!");
	MouseListen mouseL = new MouseListen();
	Clear() {
		setTitle("Rush Hour!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null); // 레이아웃 지정 X
		setResizable(false); // 사이즈 못바꾸게함
		setSize(698,418);
		panel = new JPanel() { // 패널을 만들어서 게임판을 입히고
			public void paintComponent(Graphics g) { // 패널을 백그라운드에 입혀서 배경을
														// 만든든다??
				// Approach 1: Dispaly image at at full size 복사해온거라 뭔지 모르겠다;;
				g.drawImage(icon.getImage(), 0, 0, null);
				// Approach 2: Scale image to size of component
				// Dimension d = getSize();
				// g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
				// Approach 3: Fix the image position in the scroll pane
				// Point p = scrollPane.getViewport().getViewPosition();
				// g.drawImage(icon.getImage(), p.x, p.y, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel.setSize(692, 389); // 패널의 사이즈를 정해준다
		panel.setLayout(null);
		contentPane.add(panel); // 콘텐트펜에 씌운다(올린다)
		
		lb_clear.setFont(new Font(null, 0, 90));
		lb_clear.setForeground(Color.red);
		lb_clear.setSize(500,80);
		lb_clear.setLocation(40,40);
		panel.add(lb_clear);
		
		bt1.setSize(80,30);
		bt1.setLocation(470,40);
		bt1.setFont(new Font(null, 0, 12));
		bt1.addMouseListener(mouseL);
		panel.add(bt1);
		bt2.setSize(80,30);
		bt2.setLocation(570,40);
		bt2.setFont(new Font(null, 0, 12));
		bt2.addMouseListener(mouseL);
		panel.add(bt2);
		setVisible(true);
	}
	class MouseListen implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getSource() == bt1){
				setVisible(false);
				new GraphicSet();
				new MenuSet();
			}
			else if(e.getSource() == bt2){
				System.exit(0);
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
