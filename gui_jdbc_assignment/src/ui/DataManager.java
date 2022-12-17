package ui;

import baseclasses.BaseBt;
import baseclasses.BaseFr;

public class DataManager extends BaseFr {
	private BaseBt insertButton;
	private BaseBt dataAddButton;
	private BaseBt dataDeleteButton;
	private BaseBt dataUpdateButton;
	private BaseBt dataSelectButton;
	private BaseBt backButton;
	private DMUP_Main dmup_Main;

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
		dataSelectButton = new BaseBt("데이터 검색");
		backButton = new BaseBt("돌아가기");
	}

	@Override
	public void addComp() {
		jpCenter.setGrid(6, 1, 10, 10);

		jpCenter.add(insertButton);
		jpCenter.add(dataAddButton);
		jpCenter.add(dataDeleteButton);
		jpCenter.add(dataUpdateButton);
		jpCenter.add(dataSelectButton);
		jpCenter.add(backButton);
	}

	@Override
	public void addEvent() {
		backButton.addActionListener(e -> {
			this.close();
			dmup_Main.setVisible(true);
		});
	}

}
