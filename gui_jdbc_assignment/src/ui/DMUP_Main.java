package ui;

import javax.swing.JButton;

import baseclasses.BaseBt;
import baseclasses.BaseFr;
import baseclasses.BasePn;
import jdbc.DbManager;

public class DMUP_Main extends BaseFr {
	private BaseBt insertButton;
	private BaseBt creatButton;
	private BaseBt deleteButton;
	private BaseBt tableCreateButton;
	private BaseBt tableDeleteButton;
	private BaseBt dataUpdateButton;
	private BaseBt closeButton;
	private DbManager db;

	public DMUP_Main() {
		System.out.println("DMUP_Main 실행");
		setFr("DB관리자 프로그램", 350, 500);

	}

	@Override
	public void mkComp() {
		insertButton = new BaseBt("입력");
		creatButton = new BaseBt("데이터베이스 생성");
		deleteButton = new BaseBt("데이터베이스 삭제");
		tableCreateButton = new BaseBt("테이블 생성");
		tableDeleteButton = new BaseBt("테이블 삭제");
		dataUpdateButton = new BaseBt("데이터 관리");
		closeButton = new BaseBt("종료");
	}

	@Override
	public void addComp() {
		jpCenter.setGrid(7, 1, 10, 10);

		jpCenter.add(insertButton);
		jpCenter.add(creatButton);
		jpCenter.add(deleteButton);
		jpCenter.add(tableCreateButton);
		jpCenter.add(tableDeleteButton);
		jpCenter.add(dataUpdateButton);
		jpCenter.add(closeButton);

	}

	@Override
	public void addEvent() {
		db = new DbManager();

		creatButton.addActionListener(e -> {
			db.setData("DROP SCHEMA IF EXISTS `DMUP_DB` ;"
					+ "CREATE SCHEMA IF NOT EXISTS `DMUP_DB` DEFAULT CHARACTER SET utf8 ;");

			info("DB 생성 완료");
		});

		dataUpdateButton.addActionListener(e -> {
			new DataManager(this);
			super.setVisible(false);
		});

		closeButton.addActionListener(e -> {
			allClose();
		});
	}

}
