package Project4_RushHour;

public class MapSet11 {
	GraphicSet graphic = new GraphicSet();
	final int BLOCK = 70;	//�ϳ��� 1ĭ�� ������
	MapSet11() {
		/*
		 * X�� �޺� : 50 , ������ : 50+70*6,
		 * Y�� ���� : 71 , �Ʒ��� : 71+70*6
		 * ������ �� ĭ�� 70px.
		 */
		boolean bool[][] = new boolean[6][6];
		
		graphic.bt_Redcar.setLocation(50 + BLOCK * 1, 71 + BLOCK * 2);
		graphic.panel.add(graphic.bt_Redcar);
		graphic.setbooltrue(graphic.bt_Redcar);
		
		graphic.bt_carEW[0].setLocation(50 + BLOCK * 1, 71 + BLOCK * 0);
		graphic.panel.add(graphic.bt_carEW[0]);
		graphic.setbooltrue(graphic.bt_carEW[0]);
		
		graphic.bt_carNS[1].setLocation(50 + BLOCK * 2, 71 + BLOCK * 3);
		graphic.panel.add(graphic.bt_carNS[1]);
		graphic.setbooltrue(graphic.bt_carNS[1]);
		 
		graphic.bt_carNS[4].setLocation(50 + BLOCK * 5,71 + BLOCK * 4);
		graphic.panel.add(graphic.bt_carNS[4]);
		graphic.setbooltrue(graphic.bt_carNS[4]);
		
		graphic.bt_carNS[9].setLocation(50 + BLOCK * 0,71 + BLOCK * 0);
		graphic.panel.add(graphic.bt_carNS[9]);
		graphic.setbooltrue(graphic.bt_carNS[9]);
		
		graphic.bt_carNS[10].setLocation(50 + BLOCK * 3,71 + BLOCK * 0);
		graphic.panel.add(graphic.bt_carNS[10]);
		graphic.setbooltrue(graphic.bt_carNS[10]);
		
		graphic.bt_carEW[11].setLocation(50 + BLOCK * 3,71 + BLOCK * 3);
		graphic.panel.add(graphic.bt_carEW[11]);
		graphic.setbooltrue(graphic.bt_carEW[11]);
		
		graphic.bt_carEW[12].setLocation(50 + BLOCK * 2,71 + BLOCK * 5);
		graphic.panel.add(graphic.bt_carEW[12]);
		graphic.setbooltrue(graphic.bt_carEW[12]);
		
		graphic.setVisible(true);
	}	
}
