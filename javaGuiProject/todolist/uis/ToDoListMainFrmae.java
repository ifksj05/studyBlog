package uis;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import bases.BButton;
import bases.BLabel;
import baseuis.WorkDataPanel;
import javaGuiProject.BaseFrame;
import javaGuiProject.BasePanel;

public class ToDoListMainFrmae extends BaseFrame {

	private BButton jbNewWork;
	private JLabel workCount;
	private JScrollPane scroscrollPane;
	private BasePanel workDataPanel;
	private JPanel worksPanel;
	private String tmp;
	private WorkAddUi tmpClass;
	private Vector<Vector<String>> workArrey;

	public ToDoListMainFrmae() {
		// TODO Auto-generated constructor stub
		setFrame(400, 600, "To do list");
		close();
	}

	@Override
	public void mkComp() {
		// TODO Auto-generated method stub
		// jpCenter 부분

		worksPanel = new JPanel();
		worksPanel.setLayout(new GridLayout(0, 1, 0, 20));

		for (int i = 0; i < 10; i++) {
//			worksPanel.add(new B);

		}

		JScrollPane scrollBar = new JScrollPane(worksPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		workDataPanel = new BasePanel();
		scrollBar.setBackground(Color.white);
		worksPanel.setBackground(Color.white);
		workDataPanel.add(scrollBar);

		// jpBottom 부분
		jbNewWork = new BButton("ADD NEW +").setButtonSize(150, 80).boderBackgroundNone();
		workCount = new BLabel("count").setLabelSize(150, 80).textCenter().jlbFont(15, Font.BOLD);
	}

	@Override
	public void addComp() {
		// TODO Auto-generated method stub
		jpTop.addChild();
		jpTop.jpCenter.add(new BLabel("To Do List").textCenter().jlbFont(25, Font.BOLD));
		jpTop.jpLeft.add(new BLabel("<").jlbFont(20, Font.BOLD));
		jpTop.jpRight.add(new BLabel(">").jlbFont(20, Font.BOLD));
		jpTop.setBorder(new EmptyBorder(20, 20, 20, 20));

		jpCenter.add(workDataPanel);

		jpBottom.addChild();
		jpBottom.jpLeft.add(workCount);
		jpBottom.jpRight.add(jbNewWork);
		
		// 백터 데이터
		
		workArrey = new Vector<Vector<String>>();
		
		
	}

	@Override
	public void addEvent() {
		// TODO Auto-generated method stub
		jbNewWork.addActionListener(e -> {
//			System.out.println("1");
			// tmpClass =  new WorkAddUi(this);
			new WorkAddUi(this);
			
		});
	}
	
	public void returnWorkData(String text) {
		// TODO Auto-generated method stub
		

		System.out.println(text);

		if (!text.trim().equals("")) {
			System.out.println(text);
			worksPanel.add(new WorkDataPanel(text));

			repaint();
			revalidate();
			
		}

	}
//	public void returnWorkData() {
//		// TODO Auto-generated method stub
//		
//		System.out.println(tmp);
//		
//		if (tmp.isEmpty()) {
//			System.out.println(tmp);
//			worksPanel.add(new WorkDataPanel(tmp));
//			
//			repaint();
//			revalidate();
//			
//		}
//		
//	}

}
