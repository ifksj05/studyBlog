package bases;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;

import app.TodoListStart;

public class BLabel extends JLabel {
	private TodoListStart m;

	public BLabel() {
		// TODO Auto-generated constructor stub
		m = new TodoListStart();
		super.setForeground (m.color1);
	}
	
	public BLabel(String txt) {
		// TODO Auto-generated constructor stub
		super(txt);
		super.setForeground (m.color1);
	}

	public BLabel jlbFont(int size, int style) {
		// TODO Auto-generated constructor stub
		super.setFont(new Font("", style, size));
		return this;
	}

	public BLabel textCenter() {
		// TODO Auto-generated constructor stub
		super.setHorizontalAlignment(JLabel.CENTER);
		return this;
		
	}

	public BLabel setLabelSize(int w, int h) {
		// TODO Auto-generated constructor stub
		super.setPreferredSize(new Dimension(w, h));
		
		return this;
	}
	
	

}
