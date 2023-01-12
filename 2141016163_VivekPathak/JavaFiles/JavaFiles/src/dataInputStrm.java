package javaaa;

import java.io.DataInputStream;
import java.io.FileOutputStream;

public class dataInputStrm {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataInputStream dis = new DataInputStream(System.in);
		try {
			FileOutputStream fout = new FileOutputStream("D://fout.txt");
			System.out.println("@ for the text to end");
			char ch;
			while((ch=(char)dis.read())!='@') {
				fout.write(ch);
			}
			
			fout.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
