package baseuis;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Vector;

import javax.swing.JCheckBox;

import bases.BLabel;
import javaGuiProject.BasePanel;
import javaGuiProject.DbManager;
import uis.ToDoListMainFrmae;

public class WorkDataPanel extends BasePanel{
	private BLabel workData;
	private JCheckBox checkBox;


	public WorkDataPanel(Vector<String> data, ToDoListMainFrmae toDoListMainFrmae) {
		// TODO Auto-generated constructor stub
		String num = data.get(0);
		String txt = data.get(1);
		
		checkBox = new JCheckBox();
		checkBox.setBackground(Color.white);
		workData = new BLabel(txt);
		
		
		
		super.setPreferredSize(new Dimension(0, 40));
		super.setLayout(new BorderLayout());
		super.add(checkBox, BorderLayout.WEST);
		super.add(workData, BorderLayout.CENTER);
		
		
		checkBox.addActionListener(e -> {
			toDoListMainFrmae.delData(num);
		});
	}
}
