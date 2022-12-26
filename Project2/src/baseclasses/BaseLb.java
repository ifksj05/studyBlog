package baseclasses;

import java.awt.Component;
import java.awt.Font;

import javax.swing.JLabel;

public class BaseLb extends JLabel {
	public BaseLb() {

	}

	public BaseLb(String txt) {
		super(txt);
	}

	public BaseLb font(int size) {
		super.setFont(new Font(null, Font.BOLD, size));
		return this;
	}

	public BaseLb center() {
		super.setHorizontalAlignment(CENTER);

		return this;
	}

}
