package uis;

import java.util.Vector;

import baseclasses.BaseCb;
import baseclasses.BaseFr;
import baseclasses.BaseLb;

public class MainFrame extends BaseFr {
	private Vector<String> topData;

	public MainFrame() {
		setFr("메인", 700, 500);
	}

	@Override
	public void mkComp() {
		topData = new Vector<String>();
		topData.add("지점");
		topData.add("테마");
	}

	@Override
	public void addComp() {
		// TODO Auto-generated method stub
		jpTop.addChild();
		jpTop.jpLeft.setFlow().setLeft().add(new BaseLb("예약 TOP5"));
		jpTop.jpLeft.add(new BaseCb(topData));
		jpTop.jpLeft.setBorder(0, 20, 0, 0);

	}

	@Override
	public void event() {
		// TODO Auto-generated method stub

	}
}
