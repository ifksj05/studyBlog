package ui;

import baseclasses.BaseBt;
import baseclasses.BaseFr;
import jdbc.DbManager;

public class DataManager extends BaseFr {
	private BaseBt insertButton;
	private BaseBt dataAddButton;
	private BaseBt dataDeleteButton;
	private BaseBt dataUpdateButton;
	private BaseBt dataSelectButton;
	private BaseBt backButton;
	private DMUP_Main dmup_Main;
	private DbManager db;

	public DataManager(DMUP_Main dmup_Main) {
		setFr("데이터 관리", 350, 500);
		this.dmup_Main = dmup_Main;
	}

	@Override
	public void mkComp() {

		insertButton = new BaseBt("입력");
		dataAddButton = new BaseBt("데이터 추가");
		dataDeleteButton = new BaseBt("데이터 삭제");
		dataUpdateButton = new BaseBt("데이터 수정");
		dataSelectButton = new BaseBt("데이터 보기");
		backButton = new BaseBt("돌아가기");
	}

	@Override
	public void addComp() {
		jpCenter.setGrid(6, 1, 10, 10);
		jpCenter.setBorder(10, 10, 10, 10);
		jpCenter.add(insertButton);
		jpCenter.add(dataAddButton);
		jpCenter.add(dataDeleteButton);
		jpCenter.add(dataUpdateButton);
		jpCenter.add(dataSelectButton);
		jpCenter.add(backButton);
	}

	@Override
	public void addEvent() {
		db = new DbManager();

		backButton.addActionListener(e -> {
			this.close();
			dmup_Main.setVisible(true);
		});

		dataAddButton.addActionListener(e -> {
			super.setVisible(false);
			new AddData(this);
		});

		dataDeleteButton.addActionListener(e -> {
			super.setVisible(false);
			new DeleteData(this);
		});

		dataUpdateButton.addActionListener(e -> {
			super.setVisible(false);
			new UpdateData(this);
		});

		dataSelectButton.addActionListener(e -> {
			db.getData("SELECT * FROM dmup_db.user;");
		});

	}

//	public static void main(String[] args) {
//		new DataManager(null);
//	}

}
