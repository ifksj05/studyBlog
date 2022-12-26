package uis;

import javax.swing.JTextField;

import baseclasses.BaseBt;
import baseclasses.BaseFr;
import baseclasses.BaseLb;

public class LoginFrame extends BaseFr {

	private BaseBt jbLogin;
	private BaseBt jbSignup;
	private JTextField jtfId;
	private JTextField jtfPw;

	public LoginFrame() {
		setFr("로그인", 230, 200);

	}

	@Override
	public void mkComp() {

		jtfId = new JTextField();
		jtfPw = new JTextField();

		jbLogin = new BaseBt("로그인");
		jbSignup = new BaseBt("회원가입");
	}

	@Override
	public void addComp() {
		jpMain.setBorder(10, 10, 10, 10);
		jpTop.add(new BaseLb("방탈출").center().font(30));

		jpCenter.addChild();
		jpCenter.setBorder(10, 0, 10, 0);
		jpCenter.jpLeft.setGrid(2, 1, 0, 0).add(new BaseLb("아이디"));
		jpCenter.jpLeft.add(new BaseLb("비밀번호"));
		jpCenter.jpCenter.setBorder(0, 10, 0, 0);
		jpCenter.jpCenter.setGrid(2, 1, 0, 10).add(jtfId);
		jpCenter.jpCenter.add(jtfPw);

		jpBottom.setGrid(1, 2, 5, 0);
		jpBottom.add(jbLogin);
		jpBottom.add(jbSignup);
	}

	@Override
	public void event() {

	}

	public static void main(String[] args) {
		new LoginFrame();
	}

}
