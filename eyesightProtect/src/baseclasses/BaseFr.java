package baseclasses;

import javax.swing.JFrame;

public abstract class BaseFr extends JFrame implements BaseI {
	public void setFr(String title, int width, int height) {
		super.setTitle(title);
		super.setSize(width, height);

		mk();
		add();
		event();

		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

}
