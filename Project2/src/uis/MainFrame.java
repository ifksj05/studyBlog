package uis;

import java.util.Vector;

import baseclasses.BaseBt;
import baseclasses.BaseCb;
import baseclasses.BaseFr;
import baseclasses.BaseLb;

public class MainFrame extends BaseFr {
	private Vector<String> topData;
	private BaseBt jbLogin;
	private BaseBt jbMypage;
	private BaseBt jbSerch;
	private BaseBt jbBord;
	private BaseBt jbGame;
	private BaseBt jbReservation;

	public MainFrame() {
		setFr("메인", 600, 450);
	}

	@Override
	public void mkComp() {
		topData = new Vector<String>();
		topData.add("지점");
		topData.add("테마");

		jbLogin = new BaseBt("로그인");
		jbMypage = new BaseBt("마이페이지");
		jbSerch = new BaseBt("검색");
		jbBord = new BaseBt("게시판");
		jbGame = new BaseBt("방탈출게임");
		jbReservation = new BaseBt("예약현황");

	}

	@Override
	public void addComp() {
		// TODO Auto-generated method stub
		jpTop.addChild();
		jpTop.jpLeft.setFlow().setLeft().add(new BaseLb("예약 TOP5"));
		jpTop.jpLeft.add(new BaseCb(topData));
		jpTop.jpLeft.setBorder(0, 20, 0, 0);

		jpBottom.setFlow();
		jpBottom.add(jbLogin.status(true));
		jpBottom.add(jbMypage.status(false));
		jpBottom.add(jbSerch.status(false));
		jpBottom.add(jbBord.status(false));
		jpBottom.add(jbGame.status(false));
		jpBottom.add(jbReservation.status(true));

	}

	@Override
	public void event() {
		// TODO Auto-generated method stub
		jbLogin.addActionListener(e -> {
			super.setVisible(false);
			new LoginFrame();
		});
	}
}
