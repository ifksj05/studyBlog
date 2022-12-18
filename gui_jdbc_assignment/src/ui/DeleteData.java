package ui;

import javax.swing.JTextField;

import baseclasses.BaseBt;
import baseclasses.BaseFr;
import baseclasses.BaseLb;
import jdbc.DbManager;

public class DeleteData extends BaseFr {

	private BaseBt deleteButton;
	private BaseBt backButton;
	private JTextField jtbdeleteNum;
	private DataManager dataManager;
	private DbManager db;

	public DeleteData(DataManager dataManager) {
		setFr("데이터 삭제", 350, 130);
		this.dataManager = dataManager;
	}

	@Override
	public void mkComp() {
		jtbdeleteNum = new JTextField();

		deleteButton = new BaseBt("삭제");
		backButton = new BaseBt("돌아가기");
	}

	@Override
	public void addComp() {
		jpCenter.addPn();
		jpCenter.setBorder(0, 0, 10, 0);
		jpCenter.jpLeft.add(new BaseLb("삭제할 번호"));
		jpCenter.jpLeft.setBorder(0, 0, 0, 10);
		jpCenter.jpCenter.add(jtbdeleteNum);

		jpBottom.addPn();
		jpBottom.jpCenter.add(deleteButton);
		jpBottom.jpCenter.setBorder(0, 0, 0, 10);
		jpBottom.jpRight.add(backButton);

		jpMain.setBorder(10, 10, 10, 10);
	}

	@Override
	public void addEvent() {
		db = new DbManager();

		deleteButton.addActionListener(e -> {
			String deletenum = jtbdeleteNum.getText();

			if (deletenum.equals("")) {
				jtbdeleteNum.setText("");
				error("값을 입력하세요");
			} else {
				db.setData("DELETE FROM `dmup_db`.`user` WHERE (`u_no` = '" + deletenum + "');");
				jtbdeleteNum.setText("");
				info("삭제 완료");
			}

		});

		backButton.addActionListener(e -> {
			this.close();
			dataManager.setVisible(true);

		});
	}

//	public static void main(String[] args) {
//		new DeleteData(null);
//	}

}
