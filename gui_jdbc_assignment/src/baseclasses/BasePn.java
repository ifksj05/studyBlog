package baseclasses;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class BasePn extends JPanel {
	public BasePn jpTop;
	public BasePn jpLeft;
	public BasePn jpCenter;
	public BasePn jpRight;
	public BasePn jpBottom;

	public BasePn() {
		super.setLayout(new BorderLayout());
	}

	public BasePn setGrid(int rows, int cols) {
		super.setLayout(new GridLayout(rows, cols));

		return this;
	}

	public BasePn setGrid(int rows, int cols, int hgap, int vgap) {
		super.setLayout(new GridLayout(rows, cols, hgap, vgap));

		return this;
	}

	public BasePn setBorder(int top, int left, int bottom, int right) {
		super.setBorder(new EmptyBorder(top, left, bottom, right));
		return this;
	}

	public BasePn addPn() {
		jpTop = new BasePn();
		jpLeft = new BasePn();
		jpCenter = new BasePn();
		jpRight = new BasePn();
		jpBottom = new BasePn();

		super.add(jpTop, BorderLayout.NORTH);
		super.add(jpLeft, BorderLayout.WEST);
		super.add(jpCenter, BorderLayout.CENTER);
		super.add(jpRight, BorderLayout.EAST);
		super.add(jpBottom, BorderLayout.SOUTH);

		return this;
	}
}
