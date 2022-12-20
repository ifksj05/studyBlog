package baseclasses;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public abstract class BaseFr extends JFrame implements BaseI {
	public BasePn jpTop;
	public BasePn jpLeft;
	public BasePn jpCenter;
	public BasePn jpRight;
	public BasePn jpBottom;
	public BasePn jpMain;

	public void setFr(String title, int width, int height) {
		super.setTitle(title);
		super.setSize(width, height);

		jpTop = new BasePn();
		jpLeft = new BasePn();
		jpCenter = new BasePn();
		jpRight = new BasePn();
		jpBottom = new BasePn();
		jpMain = new BasePn();

		mkComp();
		addComp();
		event();

		jpMain.add(jpTop, BorderLayout.NORTH);
		jpMain.add(jpLeft, BorderLayout.WEST);
		jpMain.add(jpCenter, BorderLayout.CENTER);
		jpMain.add(jpRight, BorderLayout.EAST);
		jpMain.add(jpBottom, BorderLayout.SOUTH);

		super.add(jpMain);

		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public void close() {
		// TODO Auto-generated method stub
		super.dispose();
	}
}
