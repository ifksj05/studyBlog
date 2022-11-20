package mainframe;

import java.awt.Color;

import uis.ToDoListMainFrmae;

public class MainClass {
	public static Color color1;
	public static Color color2;

	public static void main(String[] args) {
		color1 = new Color(114, 131, 255);
		color2 = new Color(213, 217, 255);
		new ToDoListMainFrmae();
	}
}