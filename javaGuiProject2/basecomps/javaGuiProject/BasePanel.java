package javaGuiProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class BasePanel extends JPanel{
	public BasePanel jpCenter;
	public BasePanel jpTop;
	public BasePanel jpLeft;
	public BasePanel jpRight;
	public BasePanel jpBottom;


	public BasePanel() {
		// TODO Auto-generated constructor stub
		super.setLayout(new BorderLayout());
		super.setBackground(Color.WHITE);
	}

	public BasePanel gridLaout(int size) {
		// TODO Auto-generated constructor stub
		super.setLayout(new GridLayout(size, size));
		super.setBackground(Color.WHITE);
		
		return this;
	}
	
	
	public BasePanel line(Color col) {
		// TODO Auto-generated constructor stub
		super.setBorder(new LineBorder(col));
		return this;
	}
	
	
	public BasePanel addChild() {
		// TODO Auto-generated method stub
		jpCenter = new BasePanel();
		jpTop = new BasePanel();
		jpLeft = new BasePanel();
		jpRight = new BasePanel();
		jpBottom = new BasePanel();


		super.add(jpCenter, BorderLayout.CENTER);
		super.add(jpTop, BorderLayout.NORTH);
		super.add(jpLeft, BorderLayout.WEST);
		super.add(jpRight, BorderLayout.EAST);
		super.add(jpBottom, BorderLayout.SOUTH);
		
		return this;

	}
}