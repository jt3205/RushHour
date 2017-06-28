package Project4_RushHour;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import Project4_RushHour.MenuSet.MouseListen;

public class GraphicSet extends JFrame {
	Container contentPane = getContentPane();
	JButton bt_Redcar = new JButton(new ImageIcon("./Resource/image/redcarEW.gif")); // ���ΰ� ������.
	JButton bt_carEW[] = new JButton[13]; // 0~8������ 2ĭ �¿��� ,
											// 9���ʹ� 3ĭ Ʈ��
	JButton bt_carNS[] = new JButton[13]; // carEW : East West ������ �����ִ°�
											// NS : �ϳ����� �������ִ°�
	ImageIcon icon = new ImageIcon("./Resource/image/���þƿ� ��.png"); // ������ �̹���
	JPanel panel;
	static boolean bool[][] = new boolean[6][6];
	GraphicSet() {
		for(int i = 0;i<bool.length;i++){
			for(int j = 0; j<bool.length;j++){
				bool[i][j] = false;
			}
		}
		setTitle("Rush Hour!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null); // ���̾ƿ� ���� X
		setResizable(false); // ������ ���ٲٰ���
		panel = new JPanel() { // �г��� ���� �������� ������
			public void paintComponent(Graphics g) { // �г��� ��׶��忡 ������ �����
														// ������??
				// Approach 1: Dispaly image at at full size �����ؿ°Ŷ� ���� �𸣰ڴ�;;
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
		panel.setSize(523, 600); // �г��� ����� �����ش�
		panel.setLayout(null);
		contentPane.add(panel); // ����Ʈ�濡 �����(�ø���)

		bt_carEW[0] = new JButton(new ImageIcon("./Resource/image/AcarEW.gif")); // 2ĭ �ڵ�����~
		bt_carNS[0] = new JButton(new ImageIcon("./Resource/image/AcarNS.gif"));
		bt_carEW[1] = new JButton(new ImageIcon("./Resource/image/BcarEW.gif"));
		bt_carNS[1] = new JButton(new ImageIcon("./Resource/image/BcarNS.gif"));
		bt_carEW[2] = new JButton(new ImageIcon("./Resource/image/CcarEW.gif"));
		bt_carNS[2] = new JButton(new ImageIcon("./Resource/image/CcarNS.gif"));
		bt_carEW[3] = new JButton(new ImageIcon("./Resource/image/DcarEW.gif"));
		bt_carNS[3] = new JButton(new ImageIcon("./Resource/image/DcarNS.gif"));
		bt_carEW[4] = new JButton(new ImageIcon("./Resource/image/EcarEW.gif"));
		bt_carNS[4] = new JButton(new ImageIcon("./Resource/image/EcarNS.gif"));
		bt_carEW[5] = new JButton(new ImageIcon("./Resource/image/FcarEW.gif"));
		bt_carNS[5] = new JButton(new ImageIcon("./Resource/image/FcarNS.gif"));
		bt_carEW[6] = new JButton(new ImageIcon("./Resource/image/GcarEW.gif"));
		bt_carNS[6] = new JButton(new ImageIcon("./Resource/image/GcarNS.gif"));
		bt_carEW[7] = new JButton(new ImageIcon("./Resource/image/HcarEW.gif"));
		bt_carNS[7] = new JButton(new ImageIcon("./Resource/image/HcarNS.gif"));
		bt_carEW[8] = new JButton(new ImageIcon("./Resource/image/IcarEW.gif"));
		bt_carNS[8] = new JButton(new ImageIcon("./Resource/image/IcarNS.gif"));

		bt_carEW[9] = new JButton(new ImageIcon("./Resource/image/OlorryEW.gif"));	//3ĭ Ʈ����~
		bt_carNS[9] = new JButton(new ImageIcon("./Resource/image/OlorryNS.gif"));
		bt_carEW[10] = new JButton(new ImageIcon("./Resource/image/PlorryEW.gif"));
		bt_carNS[10] = new JButton(new ImageIcon("./Resource/image/PlorryNS.gif"));
		bt_carEW[11] = new JButton(new ImageIcon("./Resource/image/QlorryEW.gif"));
		bt_carNS[11] = new JButton(new ImageIcon("./Resource/image/QlorryNS.gif"));
		bt_carEW[12] = new JButton(new ImageIcon("./Resource/image/RlorryEW.gif"));
		bt_carNS[12] = new JButton(new ImageIcon("./Resource/image/RlorryNS.gif"));

		for (int i = 0; i < bt_carEW.length; i++) { // bt_car �� �� �����Ѵ�
			bt_carEW[i].setBackground(Color.lightGray);
			bt_carNS[i].setBackground(Color.lightGray);
			bt_carEW[i].setBorderPainted(false);
			bt_carNS[i].setBorderPainted(false);
			bt_carEW[i].addMouseListener(new MouseListen());
			bt_carNS[i].addMouseListener(new MouseListen());
			if (i < 9) { // 0 ~ 8�� �Ϲ� �¿��� ũ��.
				bt_carEW[i].setSize(140, 70);	// 70���� ������ 1ĭ
				bt_carNS[i].setSize(70, 140);
				bt_carEW[i].setName("EW2");
				bt_carNS[i].setName("NS2");
			} else { // 9�̻��� Ʈ��ũ��.
				bt_carEW[i].setSize(210, 70);
				bt_carNS[i].setSize(70, 210);
				bt_carEW[i].setName("EW3");
				bt_carNS[i].setName("NS3");
			}
		}
		bt_Redcar.setSize(140,70);
		bt_Redcar.setName("EW2");
		bt_Redcar.setBackground(Color.lightGray);
		bt_Redcar.setBorderPainted(false);
		bt_Redcar.addMouseListener(new MouseListen());
		setSize(530, 615);
	}
	class MouseListen implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		void move(Component car , int dir){		// 1 : �� , 2 : �� , 3 : �� , 4 : ��
			if(dir == 1)
				car.setLocation(car.getX(), car.getY() - 70);
			else if(dir == 2)
				car.setLocation(car.getX(), car.getY() + 70);
			else if(dir == 3)
				car.setLocation(car.getX() - 70, car.getY());
			else if(dir == 4)
				car.setLocation(car.getX() + 70, car.getY());
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			Component car = e.getComponent();
			int x = car.getX();
			int y = car.getY();
			int w = car.getWidth();
			int h = car.getHeight();
			
			if (y == 71 + 70 * 2 && (x == 50 + 70 * 4 || x == 50 + 70 * 5) && car.getName().equals("EW2")) {
				move(car, 4);
				if(e.getComponent().getX() == 50+70*6){
					setVisible(false);
					new Clear();
					
				}
			} else if (car.getName().equals("EW2") || car.getName().equals("EW3") || car.getName().equals("NS2")
					|| car.getName().equals("NS3")) {
				setboolfalse(e);
				if (w > h) { 																		// ���η� �� EW��ư�� ���
					if (e.getX() <= w / 2 && x > 50 && !bool[(y - 71) / 70][(x - 50) / 70 - 1]) { 	// ���� ��ġ�� ������� �����̸鼭 ���ʺ��� �ȴ� �����ϴ°��� false�϶�(������϶�)
						move(car, 3); 																// ���� ��ġ���� �������� 70px(1ĭ)�̵��Ѵ�
					} 
					else if (e.getX() > w / 2 && x < 470 - w) { 									// ������ġ�� ������� �������̸鼭 ������ ���� ���� �ʾ�����
						if (car.getName().equals("EW2") && !bool[(y - 71) / 70][(x - 50) / 70 + 2])
							move(car, 4); 														
						else if (car.getName().equals("EW3") && !bool[(y - 71) / 70][(x - 50) / 70 + 3])
							move(car, 4); 
					}
				} else { 																			// ���η� �� NS��ư�� ���
					if (e.getY() <= h / 2 && y > 71 && !bool[(y - 71) / 70 - 1][(x - 50) / 70])  	// �ݺ��� ���� �����鼭 ������ ����X
						move(car, 1); 
					else if (e.getY() > h / 2 && y < 491 - h) { 									// �ݺ��� �Ʒ��� �����鼭 �Ʒ����� ����X
						if (car.getName().equals("NS2") && !bool[(y - 71) / 70 + 2][(x - 50) / 70]) 
							move(car, 2);
						else if (car.getName().equals("NS3") && !bool[(y - 71) / 70 + 3][(x - 50) / 70])
							move(car, 2); 
					}
				}
				setbooltrue(e);
			}
			
			
			System.out.println(x +" , "+(50+70*6));
			/*
			if(e.getComponent().getY()==71+70*2 && (e.getComponent().getX()==50+70*4 || e.getComponent().getX()==50+70*5) && e.getComponent().getName().equals("EW2")){
				e.getComponent().setLocation(e.getComponent().getX() + 70, e.getComponent().getY());	//���� ��ġ���� ���������� 70px(1ĭ)�̵�
			}
			else if(e.getComponent().getName().equals("EW2")||e.getComponent().getName().equals("EW3")||e.getComponent().getName().equals("NS2")||e.getComponent().getName().equals("NS3")) {
				setboolfalse(e);
				if (e.getComponent().getWidth() > e.getComponent().getHeight()) {		// ���η� �� EW��ư�� ���
					if (e.getX() <= e.getComponent().getWidth() / 2 && e.getComponent().getX() > 50 &&	//���� ��ġ�� ������� �����̸鼭 ���ʺ��� �ȴ������
							!bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70 - 1]) {	//�����ϴ°��� false�϶�(������϶�)
						e.getComponent().setLocation(e.getComponent().getX() - 70, e.getComponent().getY());	//���� ��ġ���� �������� 70px(1ĭ)�̵��Ѵ�
					} else if (e.getX() > e.getComponent().getWidth() / 2 && 							//������ġ�� ������� �������̸鼭
							e.getComponent().getX() < 470 - e.getComponent().getWidth())			//������ ���� ���� �ʾ�����
								if(e.getComponent().getName().equals("EW2")){
									if(!bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70 + 2])
										e.getComponent().setLocation(e.getComponent().getX() + 70, e.getComponent().getY());	//���� ��ġ���� ���������� 70px(1ĭ)�̵�
								}
								else if(e.getComponent().getName().equals("EW3")){
									if(!bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70 + 3])
										e.getComponent().setLocation(e.getComponent().getX() + 70, e.getComponent().getY());	//���� ��ġ���� ���������� 70px(1ĭ)�̵�
								}
				} else {																// ���η� �� NS��ư�� ���
					if (e.getY() <= e.getComponent().getHeight() / 2 && e.getComponent().getY() > 71 &&	//�ݺ��� ���� �����鼭 ������ ����X
							!bool[(e.getComponent().getY()-71)/70 - 1][(e.getComponent().getX()-50)/70]) {	
						e.getComponent().setLocation(e.getComponent().getX(), e.getComponent().getY() - 70);	//���ΰ� 1ĭ
					} else if (e.getY() > e.getComponent().getHeight() / 2								//�ݺ��� �Ʒ��� �����鼭 �Ʒ����� ����X
							&& e.getComponent().getY() < 491 - e.getComponent().getHeight())
								if(e.getComponent().getName().equals("NS2")){
									if(!bool[(e.getComponent().getY()-71)/70 + 2][(e.getComponent().getX()-50)/70])
										e.getComponent().setLocation(e.getComponent().getX(), e.getComponent().getY() + 70);	//�Ʒ��ΰ� 1ĭ
								}
								else if(e.getComponent().getName().equals("NS3")){
									if(!bool[(e.getComponent().getY()-71)/70 + 3][(e.getComponent().getX()-50)/70])
										e.getComponent().setLocation(e.getComponent().getX(), e.getComponent().getY() + 70);	//�Ʒ��ΰ� 1ĭ
							}
				}
				setbooltrue(e);
			}
			if(e.getComponent().getX()==50+70*6){
				
				setVisible(false);
				new Clear();
			}
			*/
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	void setboolfalse(MouseEvent e) {
		if(e.getComponent().getName().equals("EW2")){	//���� 2ĭ �ڵ���
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70] = false;
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70+1] = false;
		}
		else if(e.getComponent().getName().equals("NS2")){	//���� 2ĭ �ڵ���
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70] = false;
			bool[(e.getComponent().getY()-71)/70+1][(e.getComponent().getX()-50)/70] = false;
		}
		else if(e.getComponent().getName().equals("EW3")){	//���� 3ĭ �ڵ���
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70] = false;
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70+1] = false;
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70+2] = false;
		}
		else if(e.getComponent().getName().equals("NS3")){	//���� 3ĭ �ڵ���
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70] = false;
			bool[(e.getComponent().getY()-71)/70+1][(e.getComponent().getX()-50)/70] = false;
			bool[(e.getComponent().getY()-71)/70+2][(e.getComponent().getX()-50)/70] = false;
		}
	}
	void setbooltrue(MouseEvent e){
		if(e.getComponent().getName().equals("EW2")){	//���� 2ĭ �ڵ���
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70] = true;
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70+1] = true;
		}
		else if(e.getComponent().getName().equals("NS2")){	//���� 2ĭ �ڵ���
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70] = true;
			bool[(e.getComponent().getY()-71)/70+1][(e.getComponent().getX()-50)/70] = true;
		}
		else if(e.getComponent().getName().equals("EW3")){	//���� 3ĭ �ڵ���
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70] = true;
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70+1] = true;
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70+2] = true;
		}
		else if(e.getComponent().getName().equals("NS3")){	//���� 3ĭ �ڵ���
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70] = true;
			bool[(e.getComponent().getY()-71)/70+1][(e.getComponent().getX()-50)/70] = true;
			bool[(e.getComponent().getY()-71)/70+2][(e.getComponent().getX()-50)/70] = true;
		}
	}
	void setbooltrue(Component comp){
		if(comp.getName().equals("EW2")){	//���� 2ĭ �ڵ���
			bool[(comp.getY()-71)/70][(comp.getX()-50)/70] = true;
			bool[(comp.getY()-71)/70][(comp.getX()-50)/70+1] = true;
		}
		else if(comp.getName().equals("NS2")){	//���� 2ĭ �ڵ���
			bool[(comp.getY()-71)/70][(comp.getX()-50)/70] = true;
			bool[(comp.getY()-71)/70+1][(comp.getX()-50)/70] = true;
		}
		else if(comp.getName().equals("EW3")){	//���� 3ĭ �ڵ���
			bool[(comp.getY()-71)/70][(comp.getX()-50)/70] = true;
			bool[(comp.getY()-71)/70][(comp.getX()-50)/70+1] = true;
			bool[(comp.getY()-71)/70][(comp.getX()-50)/70+2] = true;
		}
		else if(comp.getName().equals("NS3")){	//���� 3ĭ �ڵ���
			bool[(comp.getY()-71)/70][(comp.getX()-50)/70] = true;
			bool[(comp.getY()-71)/70+1][(comp.getX()-50)/70] = true;
			bool[(comp.getY()-71)/70+2][(comp.getX()-50)/70] = true;
		}
	}
}
