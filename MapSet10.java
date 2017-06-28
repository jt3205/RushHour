package Project4_RushHour;

import javax.swing.JButton;

public class MapSet10 {
	GraphicSet graphic = new GraphicSet();
	final int BLOCK = 70;	//ÇÏ³ª´ç 1Ä­¾¿ ³»·Á°¨
	MapSet10() {
		/*
		 * XÃà ¿Þº® : 50 , ¿À¸¥º® : 50+70*6,
		 * YÃà À­º® : 71 , ¾Æ·§º® : 71+70*6
		 * °ÔÀÓÆÇ ÇÑ Ä­´ç 70px.
		 */
		boolean bool[][] = new boolean[6][6];
		
		setBt(graphic.bt_Redcar, 1, 2);

		graphic.bt_carEW[0].setLocation(50, 71);
		graphic.panel.add(graphic.bt_carEW[0]);
		graphic.setbooltrue(graphic.bt_carEW[0]);
		
		graphic.bt_carEW[3].setLocation(50 + BLOCK * 0, 71 + BLOCK * 1);
		graphic.panel.add(graphic.bt_carEW[3]);
		graphic.setbooltrue(graphic.bt_carEW[3]);
		
		graphic.bt_carNS[1].setLocation(50 + BLOCK * 2, 71 + BLOCK * 0);
		graphic.panel.add(graphic.bt_carNS[1]);
		graphic.setbooltrue(graphic.bt_carNS[1]);
		 
		graphic.bt_carEW[2].setLocation(50 + BLOCK * 4,71 + BLOCK * 0);
		graphic.panel.add(graphic.bt_carEW[2]);
		graphic.setbooltrue(graphic.bt_carEW[2]);
		
		graphic.bt_carEW[6].setLocation(50 + BLOCK * 0,71 + BLOCK * 5);
		graphic.panel.add(graphic.bt_carEW[6]);
		graphic.setbooltrue(graphic.bt_carEW[6]);
		
		graphic.bt_carNS[4].setLocation(50 + BLOCK * 3,71 + BLOCK * 4);
		graphic.panel.add(graphic.bt_carNS[4]);
		graphic.setbooltrue(graphic.bt_carNS[4]);
		
		graphic.bt_carEW[5].setLocation(50 + BLOCK * 4,71 + BLOCK * 4);
		graphic.panel.add(graphic.bt_carEW[5]);
		graphic.setbooltrue(graphic.bt_carEW[5]);
		
		graphic.bt_carEW[7].setLocation(50 + BLOCK * 4,71 + BLOCK * 5);
		graphic.panel.add(graphic.bt_carEW[7]);
		graphic.setbooltrue(graphic.bt_carEW[7]);
		
		graphic.bt_carNS[10].setLocation(50 + BLOCK * 0,71 + BLOCK * 2);
		graphic.panel.add(graphic.bt_carNS[10]);
		graphic.setbooltrue(graphic.bt_carNS[10]);
		
		graphic.bt_carNS[9].setLocation(50 + BLOCK * 5,71 + BLOCK * 1);
		graphic.panel.add(graphic.bt_carNS[9]);
		graphic.setbooltrue(graphic.bt_carNS[9]);
		
		graphic.bt_carEW[11].setLocation(50 + BLOCK * 1,71 + BLOCK * 3);
		graphic.panel.add(graphic.bt_carEW[11]);
		graphic.setbooltrue(graphic.bt_carEW[11]);
		
		graphic.setVisible(true);
	}	
	
	void setBt(JButton car , int x , int y) {
		car.setLocation(50 + BLOCK * x, 71 + BLOCK * y);
		graphic.panel.add(car);
		graphic.setbooltrue(car);
	}
}
