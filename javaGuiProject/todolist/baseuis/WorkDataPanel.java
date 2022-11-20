package baseuis;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JCheckBox;

import bases.BLabel;
import javaGuiProject.BasePanel;

public class WorkDataPanel extends BasePanel{
	private BLabel workData;
	private JCheckBox checkBox;

	public WorkDataPanel(String txt) {
		// TODO Auto-generated constructor stub
		checkBox = new JCheckBox();
		checkBox.setBackground(Color.white);
		workData = new BLabel(txt);
		
		
		
		super.setPreferredSize(new Dimension(0, 40));
		super.setLayout(new BorderLayout());
		super.add(checkBox, BorderLayout.WEST);
		super.add(workData, BorderLayout.CENTER);
		
	}
}
