package ui;

import javax.swing.JTextField;

import baseclasses.BaseBt;
import baseclasses.BaseFr;
import baseclasses.BaseLb;
import jdbc.DbManager;

public class UpdateData extends BaseFr {
	private DataManager dataManager;
	private BaseBt updateButton;
	private BaseBt backButton;
	private JTextField jtbName;
	private JTextField jtbAddress;
	private JTextField jtbNumber;
	private JTextField jtbUpdateNum;
	private DbManager db;

	public UpdateData(DataManager dataManager) {
		setFr("데이터 수정", 350, 300);
		this.dataManager = dataManager;
	}

	@Override
	public void mkComp() {
		jtbUpdateNum = new JTextField();
		jtbName = new JTextField();
		jtbAddress = new JTextField();
		jtbNumber = new JTextField();

		updateButton = new BaseBt("수정");
		backButton = new BaseBt("돌아가기");
	}

	@Override
	public void addComp() {
		jpCenter.addPn();
		jpCenter.jpLeft.setGrid(4, 1, 10, 10);
		jpCenter.jpLeft.add(new BaseLb("수정할 번호"));
		jpCenter.jpLeft.add(new BaseLb("이름"));
		jpCenter.jpLeft.add(new BaseLb("주소"));
		jpCenter.jpLeft.add(new BaseLb("전화번호"));
		jpCenter.jpLeft.setBorder(0, 0, 0, 10);
		jpCenter.jpCenter.setGrid(4, 1, 10, 10);
		jpCenter.jpCenter.add(jtbUpdateNum);
		jpCenter.jpCenter.add(jtbName);
		jpCenter.jpCenter.add(jtbAddress);
		jpCenter.jpCenter.add(jtbNumber);
		jpCenter.setBorder(0, 0, 10, 0);

		jpBottom.addPn();
		jpBottom.jpCenter.add(updateButton);
		jpBottom.jpCenter.setBorder(0, 0, 0, 10);
		jpBottom.jpRight.add(backButton);

		jpMain.setBorder(10, 10, 10, 10);
	}

	@Override
	public void addEvent() {
		db = new DbManager();

		updateButton.addActionListener(e -> {
			String updatenum = jtbUpdateNum.getText(), namedata = jtbName.getText(), addressdata = jtbAddress.getText(),
					numberdata = jtbNumber.getText();

			if (updatenum.equals("") || namedata.equals("") || addressdata.equals("") || numberdata.equals("")) {
				jtbUpdateNum.setText("");
				jtbName.setText("");
				jtbAddress.setText("");
				jtbNumber.setText("");
				error("값을 입력하세요");

			} else {
				db.setData("UPDATE `dmup_db`.`user` SET `u_name` = '" + namedata + "', `u_address` = '" + addressdata
						+ "', `u_number` = '" + numberdata + "' WHERE (`u_no` = '" + updatenum + "');");
				jtbUpdateNum.setText("");
				jtbName.setText("");
				jtbAddress.setText("");
				jtbNumber.setText("");
				info("수정 완료");
			}

		});

		backButton.addActionListener(e -> {
			this.close();
			dataManager.setVisible(true);

		});

	}

//	public static void main(String[] args) {
//		new UpdateData(null);
//	}

}
