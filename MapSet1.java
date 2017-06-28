package Project4_RushHour;

public class MapSet1 {
	GraphicSet graphic = new GraphicSet();

	MapSet1() {
		/*
		 * X√‡ øﬁ∫Æ : 50 , ø¿∏•∫Æ : 50+70*6,
		 * Y√‡ ¿≠∫Æ : 71 , æ∆∑ß∫Æ : 71+70*6
		 * ∞‘¿”∆« «— ƒ≠¥Á 70px.
		 */
		
		boolean bool[][] = new boolean[6][6];
		graphic.bt_Redcar.setLocation(50+70, 71 + 140);
		graphic.panel.add(graphic.bt_Redcar);
		graphic.setbooltrue(graphic.bt_Redcar);
		
		graphic.bt_carEW[0].setLocation(50, 71);
		graphic.panel.add(graphic.bt_carEW[0]);
		graphic.setbooltrue(graphic.bt_carEW[0]);
		
		graphic.bt_carEW[2].setLocation(50+280, 71+280);
		graphic.panel.add(graphic.bt_carEW[2]);
		graphic.setbooltrue(graphic.bt_carEW[2]);
		
		graphic.bt_carNS[1].setLocation(50, 71+280);
		graphic.panel.add(graphic.bt_carNS[1]);
		graphic.setbooltrue(graphic.bt_carNS[1]);
		
		graphic.bt_carNS[10].setLocation(50,71+70);
		graphic.panel.add(graphic.bt_carNS[10]);
		graphic.setbooltrue(graphic.bt_carNS[10]);
		
		graphic.bt_carNS[11].setLocation(50+210,71+70);
		graphic.panel.add(graphic.bt_carNS[11]);
		graphic.setbooltrue(graphic.bt_carNS[11]);
		
		graphic.bt_carEW[12].setLocation(50+140,71+350);
		graphic.panel.add(graphic.bt_carEW[12]);
		graphic.setbooltrue(graphic.bt_carEW[12]);
		
		graphic.bt_carNS[9].setLocation(50+350,71);
		graphic.panel.add(graphic.bt_carNS[9]);
		graphic.setbooltrue(graphic.bt_carNS[9]);
		
		graphic.setVisible(true);
		
	}
	
}
