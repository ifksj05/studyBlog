package uis;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Iterator;
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
import javaGuiProject.DbManager;

public class ToDoListMainFrmae extends BaseFrame {

	private BButton jbNewWork;
	private JLabel workCount;
	private JScrollPane scroscrollPane;
	private BasePanel workDataPanel;
	private JPanel worksPanel;
	private String tmp;
	private WorkAddUi tmpClass;
	private Vector<Vector<String>> workArrey;
	private DbManager db = new DbManager();
	
	
	public ToDoListMainFrmae() {
		// TODO Auto-generated constructor stub
		setFrame(400, 600, "To do list");
		refresh();
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
		refresh();
		jbNewWork = new BButton("ADD NEW +").setButtonSize(150, 80).boderBackgroundNone();
		workCount = new BLabel(workArrey.size() + " count").setLabelSize(150, 80).textCenter().jlbFont(15, Font.BOLD);
//		workCount = new BLabel(workArrey.get(0).get(0) + "count").setLabelSize(150, 80).textCenter().jlbFont(15, Font.BOLD);
//		workCount = new BLabel("count").setLabelSize(150, 80).textCenter().jlbFont(15, Font.BOLD);
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
		refresh();
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
	
	public void addData(String text) {
		// TODO Auto-generated method stub
		if (!text.trim().equals("")) {
			db.setUpdata("INSERT INTO `todo`.`todolist` (`list`, `check`) VALUES (?, ?);", text, 0);
			refresh();
		}
	}
	
	public void delData(String num) {
		// TODO Auto-generated method stub
		db.setUpdata("delete from todolist where no = ?;", num);
		refresh();
	}	
	
	private void refresh() {
		// TODO Auto-generated method stub
		
		worksPanel.removeAll();
		
		workArrey = db.getData("SELECT * FROM todo.todolist order by no desc;");
		
		for (int i = 0; i < workArrey.size(); i++) {
			worksPanel.add(new WorkDataPanel(workArrey.get(i), this));
		}
		
		if(workArrey.size() < 7) {
			for (int i = 0; i < 7 - workArrey.size(); i++) {
				worksPanel.add(new JPanel());
			}
		}

		repaint();
		revalidate();
	}
	// 새로고침 하는 부분 따로,
	// 저장하는 함수 따로
	//		저장하는 부분을 만들고
			// 새로고침하는 함수 호출
	
	
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
