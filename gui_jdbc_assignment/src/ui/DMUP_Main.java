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
		jpCenter.setBorder(10, 10, 10, 10);
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

		deleteButton.addActionListener(e -> {
			db.setData("DROP SCHEMA IF EXISTS `DMUP_DB` ;");

			info("DB 삭제 완료");
		});

		tableCreateButton.addActionListener(e -> {
			db.setData("CREATE TABLE IF NOT EXISTS `DMUP_DB`.`user` (\r\n" + "  `u_no` INT NOT NULL AUTO_INCREMENT,\r\n"
					+ "  `u_name` VARCHAR(45) NULL,\r\n" + "  `u_address` VARCHAR(45) NULL,\r\n"
					+ "  `u_number` VARCHAR(45) NULL,\r\n" + "  PRIMARY KEY (`u_no`))");

			info("Table 생성 완료"); // 디비 존재하지 않을 경우 오류 메세지 실행

		});

		tableDeleteButton.addActionListener(e -> {
			db.setData("DROP TABLE  if exists `DMUP_DB`.`user`;");

			info("Table 삭제 완료");
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
