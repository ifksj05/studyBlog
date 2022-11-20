package bases;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import mainframe.MainClass;

public class BButton extends JButton{
	private MainClass m;

	public BButton() {
		// TODO Auto-generated constructor stub
		m = new MainClass();
		super.setForeground (m.color1);

	};

	public BButton(String txt) {
		// TODO Auto-generated constructor stub
		super(txt);
		super.setForeground (m.color1);
	};

	public BButton setButtonSize(int w, int h) {
		// TODO Auto-generated constructor stub
		super.setPreferredSize(new Dimension(w, h));
		
		return this;
	};

	public BButton boderBackgroundNone() {
		// TODO Auto-generated constructor stub
		super.setBorderPainted(false);
		super.setOpaque(false);
		super.setContentAreaFilled(false);
		super.setBorderPainted(false);
		return this;
	};

	public BButton colorPadding(int t, int l, int b, int r, Color color, int size) {
		// TODO Auto-generated constructor stub
		super.setBorder(BorderFactory.createCompoundBorder(
		        BorderFactory.createLineBorder(color, size), 
		        BorderFactory.createEmptyBorder(t, l, b, r)));
		return this;
	};
	
//	public BButton colorPadding(int t, int l, int b, int r) {
//		// TODO Auto-generated constructor stub
//		super.setBorder(BorderFactory.createCompoundBorder(
//				BorderFactory.createEmptyBorder(t, l, b, r)));
//		return this;
//	};
	
	
}
