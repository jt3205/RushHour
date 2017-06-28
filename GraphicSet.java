package Project4_RushHour;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import Project4_RushHour.MenuSet.MouseListen;

public class GraphicSet extends JFrame {
	Container contentPane = getContentPane();
	JButton bt_Redcar = new JButton(new ImageIcon("./Resource/image/redcarEW.gif")); // 주인공 빨간차.
	JButton bt_carEW[] = new JButton[13]; // 0~8까지는 2칸 승용차 ,
											// 9부터는 3칸 트럭
	JButton bt_carNS[] = new JButton[13]; // carEW : East West 동서로 누워있는거
											// NS : 북남으로 세워져있는것
	ImageIcon icon = new ImageIcon("./Resource/image/러시아워 판.png"); // 게임판 이미지
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
		setLayout(null); // 레이아웃 지정 X
		setResizable(false); // 사이즈 못바꾸게함
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
		panel.setSize(523, 600); // 패널의 사이즈를 정해준다
		panel.setLayout(null);
		contentPane.add(panel); // 콘텐트펜에 씌운다(올린다)

		bt_carEW[0] = new JButton(new ImageIcon("./Resource/image/AcarEW.gif")); // 2칸 자동차들~
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

		bt_carEW[9] = new JButton(new ImageIcon("./Resource/image/OlorryEW.gif"));	//3칸 트럭들~
		bt_carNS[9] = new JButton(new ImageIcon("./Resource/image/OlorryNS.gif"));
		bt_carEW[10] = new JButton(new ImageIcon("./Resource/image/PlorryEW.gif"));
		bt_carNS[10] = new JButton(new ImageIcon("./Resource/image/PlorryNS.gif"));
		bt_carEW[11] = new JButton(new ImageIcon("./Resource/image/QlorryEW.gif"));
		bt_carNS[11] = new JButton(new ImageIcon("./Resource/image/QlorryNS.gif"));
		bt_carEW[12] = new JButton(new ImageIcon("./Resource/image/RlorryEW.gif"));
		bt_carNS[12] = new JButton(new ImageIcon("./Resource/image/RlorryNS.gif"));

		for (int i = 0; i < bt_carEW.length; i++) { // bt_car 를 다 설정한다
			bt_carEW[i].setBackground(Color.lightGray);
			bt_carNS[i].setBackground(Color.lightGray);
			bt_carEW[i].setBorderPainted(false);
			bt_carNS[i].setBorderPainted(false);
			bt_carEW[i].addMouseListener(new MouseListen());
			bt_carNS[i].addMouseListener(new MouseListen());
			if (i < 9) { // 0 ~ 8는 일반 승용차 크기.
				bt_carEW[i].setSize(140, 70);	// 70마다 게임판 1칸
				bt_carNS[i].setSize(70, 140);
				bt_carEW[i].setName("EW2");
				bt_carNS[i].setName("NS2");
			} else { // 9이상은 트럭크기.
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
		void move(Component car , int dir){		// 1 : 상 , 2 : 하 , 3 : 좌 , 4 : 우
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
				if (w > h) { 																		// 가로로 긴 EW버튼일 경우
					if (e.getX() <= w / 2 && x > 50 && !bool[(y - 71) / 70][(x - 50) / 70 - 1]) { 	// 누른 위치가 가운데보다 왼쪽이면서 왼쪽벽에 안닿 가야하는곳이 false일때(빈공간일때)
						move(car, 3); 																// 현재 위치보다 왼쪽으로 70px(1칸)이동한다
					} 
					else if (e.getX() > w / 2 && x < 470 - w) { 									// 누른위치가 가운데보다 오른쪽이면서 오른쪽 벽에 닿지 않았을때
						if (car.getName().equals("EW2") && !bool[(y - 71) / 70][(x - 50) / 70 + 2])
							move(car, 4); 														
						else if (car.getName().equals("EW3") && !bool[(y - 71) / 70][(x - 50) / 70 + 3])
							move(car, 4); 
					}
				} else { 																			// 세로로 긴 NS버튼일 경우
					if (e.getY() <= h / 2 && y > 71 && !bool[(y - 71) / 70 - 1][(x - 50) / 70])  	// 반보다 위를 누르면서 윗벽에 닿지X
						move(car, 1); 
					else if (e.getY() > h / 2 && y < 491 - h) { 									// 반보다 아래를 누르면서 아랫벽에 닿지X
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
				e.getComponent().setLocation(e.getComponent().getX() + 70, e.getComponent().getY());	//현재 위치보다 오른쪽으로 70px(1칸)이동
			}
			else if(e.getComponent().getName().equals("EW2")||e.getComponent().getName().equals("EW3")||e.getComponent().getName().equals("NS2")||e.getComponent().getName().equals("NS3")) {
				setboolfalse(e);
				if (e.getComponent().getWidth() > e.getComponent().getHeight()) {		// 가로로 긴 EW버튼일 경우
					if (e.getX() <= e.getComponent().getWidth() / 2 && e.getComponent().getX() > 50 &&	//누른 위치가 가운데보다 왼쪽이면서 왼쪽벽에 안닿았을때
							!bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70 - 1]) {	//가야하는곳이 false일때(빈공간일때)
						e.getComponent().setLocation(e.getComponent().getX() - 70, e.getComponent().getY());	//현재 위치보다 왼쪽으로 70px(1칸)이동한다
					} else if (e.getX() > e.getComponent().getWidth() / 2 && 							//누른위치가 가운데보다 오른쪽이면서
							e.getComponent().getX() < 470 - e.getComponent().getWidth())			//오른쪽 벽에 닿지 않았을때
								if(e.getComponent().getName().equals("EW2")){
									if(!bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70 + 2])
										e.getComponent().setLocation(e.getComponent().getX() + 70, e.getComponent().getY());	//현재 위치보다 오른쪽으로 70px(1칸)이동
								}
								else if(e.getComponent().getName().equals("EW3")){
									if(!bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70 + 3])
										e.getComponent().setLocation(e.getComponent().getX() + 70, e.getComponent().getY());	//현재 위치보다 오른쪽으로 70px(1칸)이동
								}
				} else {																// 세로로 긴 NS버튼일 경우
					if (e.getY() <= e.getComponent().getHeight() / 2 && e.getComponent().getY() > 71 &&	//반보다 위를 누르면서 윗벽에 닿지X
							!bool[(e.getComponent().getY()-71)/70 - 1][(e.getComponent().getX()-50)/70]) {	
						e.getComponent().setLocation(e.getComponent().getX(), e.getComponent().getY() - 70);	//위로감 1칸
					} else if (e.getY() > e.getComponent().getHeight() / 2								//반보다 아래를 누르면서 아랫벽에 닿지X
							&& e.getComponent().getY() < 491 - e.getComponent().getHeight())
								if(e.getComponent().getName().equals("NS2")){
									if(!bool[(e.getComponent().getY()-71)/70 + 2][(e.getComponent().getX()-50)/70])
										e.getComponent().setLocation(e.getComponent().getX(), e.getComponent().getY() + 70);	//아래로감 1칸
								}
								else if(e.getComponent().getName().equals("NS3")){
									if(!bool[(e.getComponent().getY()-71)/70 + 3][(e.getComponent().getX()-50)/70])
										e.getComponent().setLocation(e.getComponent().getX(), e.getComponent().getY() + 70);	//아래로감 1칸
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
		if(e.getComponent().getName().equals("EW2")){	//가로 2칸 자동차
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70] = false;
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70+1] = false;
		}
		else if(e.getComponent().getName().equals("NS2")){	//세로 2칸 자동차
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70] = false;
			bool[(e.getComponent().getY()-71)/70+1][(e.getComponent().getX()-50)/70] = false;
		}
		else if(e.getComponent().getName().equals("EW3")){	//가로 3칸 자동차
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70] = false;
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70+1] = false;
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70+2] = false;
		}
		else if(e.getComponent().getName().equals("NS3")){	//세로 3칸 자동차
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70] = false;
			bool[(e.getComponent().getY()-71)/70+1][(e.getComponent().getX()-50)/70] = false;
			bool[(e.getComponent().getY()-71)/70+2][(e.getComponent().getX()-50)/70] = false;
		}
	}
	void setbooltrue(MouseEvent e){
		if(e.getComponent().getName().equals("EW2")){	//가로 2칸 자동차
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70] = true;
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70+1] = true;
		}
		else if(e.getComponent().getName().equals("NS2")){	//세로 2칸 자동차
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70] = true;
			bool[(e.getComponent().getY()-71)/70+1][(e.getComponent().getX()-50)/70] = true;
		}
		else if(e.getComponent().getName().equals("EW3")){	//가로 3칸 자동차
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70] = true;
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70+1] = true;
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70+2] = true;
		}
		else if(e.getComponent().getName().equals("NS3")){	//세로 3칸 자동차
			bool[(e.getComponent().getY()-71)/70][(e.getComponent().getX()-50)/70] = true;
			bool[(e.getComponent().getY()-71)/70+1][(e.getComponent().getX()-50)/70] = true;
			bool[(e.getComponent().getY()-71)/70+2][(e.getComponent().getX()-50)/70] = true;
		}
	}
	void setbooltrue(Component comp){
		if(comp.getName().equals("EW2")){	//가로 2칸 자동차
			bool[(comp.getY()-71)/70][(comp.getX()-50)/70] = true;
			bool[(comp.getY()-71)/70][(comp.getX()-50)/70+1] = true;
		}
		else if(comp.getName().equals("NS2")){	//세로 2칸 자동차
			bool[(comp.getY()-71)/70][(comp.getX()-50)/70] = true;
			bool[(comp.getY()-71)/70+1][(comp.getX()-50)/70] = true;
		}
		else if(comp.getName().equals("EW3")){	//가로 3칸 자동차
			bool[(comp.getY()-71)/70][(comp.getX()-50)/70] = true;
			bool[(comp.getY()-71)/70][(comp.getX()-50)/70+1] = true;
			bool[(comp.getY()-71)/70][(comp.getX()-50)/70+2] = true;
		}
		else if(comp.getName().equals("NS3")){	//세로 3칸 자동차
			bool[(comp.getY()-71)/70][(comp.getX()-50)/70] = true;
			bool[(comp.getY()-71)/70+1][(comp.getX()-50)/70] = true;
			bool[(comp.getY()-71)/70+2][(comp.getX()-50)/70] = true;
		}
	}
}
