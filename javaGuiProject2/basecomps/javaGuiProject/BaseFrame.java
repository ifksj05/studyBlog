package javaGuiProject;

import java.awt.BorderLayout;

import javax.crypto.Cipher;
import javax.swing.JFrame;

public abstract class BaseFrame extends JFrame implements BaseI {

	public BasePanel jpCenter;
	public BasePanel jpTop;
	public BasePanel jpLeft;
	public BasePanel jpRight;
	public BasePanel jpBottom;
	public BasePanel jpMain;

	public void setFrame(int width, int height, String tittle) {
		// TODO Auto-generated method stub
		super.setSize(width, height);
		super.setTitle(tittle);

		jpCenter = new BasePanel();
		jpTop = new BasePanel();
		jpLeft = new BasePanel();
		jpRight = new BasePanel();
		jpBottom = new BasePanel();

		jpMain = new BasePanel();
		
		mkComp();
		addComp();
		addEvent();
		
		super.setLayout(new BorderLayout());
		
		super.setLocationRelativeTo(null);

		jpMain.add(jpCenter, BorderLayout.CENTER);
		jpMain.add(jpTop, BorderLayout.NORTH);
		jpMain.add(jpLeft, BorderLayout.WEST);
		jpMain.add(jpRight, BorderLayout.EAST);
		jpMain.add(jpBottom, BorderLayout.SOUTH);

		super.add(jpMain);

		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
	};
	
	public void close() {
		// TODO Auto-generated method stub
		super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}