package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import res.ResManager;

public class test {
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("./Datafiles/area.txt");

		int ch;
		while ((ch = reader.read()) != -1) {
			System.out.print((char) ch);
		}
	}
}
