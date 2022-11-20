package javaGuiProject;

import bases.BLabel;

public class MainClass extends BaseFrame{
	
	public static int[][] arrMake(int size) {

		int[][] snail = new int[size][size];

		int print = size;
		int k = 1;
		int right = -1;
		int bottom = 0;
		int top = 1;

		for (int i = 5; i > 0; i--) {

			for (int j = 0; j < print; j++) {
				right += top;
				snail[bottom][right] = k;
				k++;
			}

			print--;

			for (int j = 0; j < print; j++) {
				bottom += top;
				snail[bottom][right] = k;
				k++;
			}

			top = top * (-1);
		}
		return snail;
	}

	private BasePanel jp;
	private int[][] arr;
	private int[][] xyArr;
	
	public MainClass() {
		// TODO Auto-generated constructor stub
		setFrame(500, 500, "달팽이");
		close();
	}
	
	@Override
	public void mkComp() {
		// TODO Auto-generated method stub
		arr = arrMake(5);
		xyArr = new int[5][5];
		jpCenter.gridLaout(5);
		
	}

	@Override
	public void addComp() {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				jpCenter.add(new BLabel(arr[i][j] + " ").textCenter());
			}
		}
		
	}

	@Override
	public void addEvent() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		new MainClass();
	}
	
}
