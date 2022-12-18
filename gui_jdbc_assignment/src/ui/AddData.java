package ui;

import javax.swing.JTextField;

import baseclasses.BaseBt;
import baseclasses.BaseFr;
import baseclasses.BaseLb;
import jdbc.DbManager;

public class AddData extends BaseFr {
	private JTextField jtbName;
	private JTextField jtbAddress;
	private JTextField jtbNumber;
	private BaseBt addButton;
	private BaseBt backButton;
	private DataManager dataManager;
	private DbManager db;

	public AddData(DataManager dataManager) {
		setFr("데이터 추가", 350, 250);
		this.dataManager = dataManager;
	}

	@Override
	public void mkComp() {
		jtbName = new JTextField();
		jtbAddress = new JTextField();
		jtbNumber = new JTextField();
		addButton = new BaseBt("추가");
		backButton = new BaseBt("돌아가기");
	}

	@Override
	public void addComp() {
		jpCenter.addPn();
		jpCenter.jpLeft.setGrid(3, 1, 10, 10);
		jpCenter.jpLeft.add(new BaseLb("이름"));
		jpCenter.jpLeft.add(new BaseLb("주소"));
		jpCenter.jpLeft.add(new BaseLb("전화번호"));
		jpCenter.jpLeft.setBorder(0, 0, 0, 10);
		jpCenter.jpCenter.setGrid(3, 1, 10, 10);
		jpCenter.jpCenter.add(jtbName);
		jpCenter.jpCenter.add(jtbAddress);
		jpCenter.jpCenter.add(jtbNumber);
		jpCenter.setBorder(0, 0, 10, 0);

		jpBottom.addPn();
		jpBottom.jpCenter.add(addButton);
		jpBottom.jpCenter.setBorder(0, 0, 0, 10);
		jpBottom.jpRight.add(backButton);

		jpMain.setBorder(10, 10, 10, 10);
	}

	@Override
	public void addEvent() {
		db = new DbManager();

		addButton.addActionListener(e -> {
			String namedata = jtbName.getText(), addressdata = jtbAddress.getText(), numberdata = jtbNumber.getText();

			if (namedata.equals("") || addressdata.equals("") || numberdata.equals("")) {
				error("모든 값을 입력하시오");
				jtbName.setText("");
				jtbAddress.setText("");
				jtbNumber.setText("");
			} else {
				db.setData("INSERT INTO `dmup_db`.`user` (`u_name`, `u_address`, `u_number`) VALUES ('" + namedata
						+ "', '" + addressdata + "', '" + numberdata + "');");
				info("데이터 추가 성공");
				jtbName.setText("");
				jtbAddress.setText("");
				jtbNumber.setText("");

//				this.close();
//				dataManager.setVisible(true); // 돌아가는 코드

			}

		});

		backButton.addActionListener(e -> {
			this.close();
			dataManager.setVisible(true);

		});
	}

	public static void main(String[] args) {
		new AddData(null);
	}
}
