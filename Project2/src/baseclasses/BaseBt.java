package baseclasses;

import javax.swing.JButton;

public class BaseBt extends JButton {
	public BaseBt() {

	}

	public BaseBt(String txt) {
		super(txt);
	}

	public BaseBt status(boolean status) {
		super.setEnabled(status);
		return this;
	}

}
