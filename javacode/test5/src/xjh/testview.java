package xjh;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;

public class testview {

	public void WriteStringToFile(String filePath) {
		try {
			File file = new File(filePath);
			PrintStream ps = new PrintStream(new FileOutputStream(file));
			ps.println("http://www.docin.com/p-315288370.html");// 往文件里写入字符串
			ps.append("http://www.docin.com/p-315288370.html");// 在已有的基础上添加字符串
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

/*	public void WriteStringToFile2(String filePath) {
		try {
			FileWriter fw = new FileWriter(filePath, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.append("在已有的基础上添加字符串");
			bw.write("abc\r\n ");// 往已有的文件上添加字符串
			bw.write("def\r\n ");
			bw.write("hijk ");
			bw.close();
			fw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void WriteStringToFile3(String filePath) {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(filePath));
			pw.println("abc ");
			pw.println("def ");
			pw.println("hef ");
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void WriteStringToFile4(String filePath) {
		try {
			RandomAccessFile rf = new RandomAccessFile(filePath, "rw");
			rf.writeBytes("op\r\n");
			rf.writeBytes("app\r\n");
			rf.writeBytes("hijklllll");
			rf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void WriteStringToFile5(String filePath) {
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			String s = "http://www.docin.com/p-315288370.html";
			fos.write(s.getBytes());
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/

	public static void main(String[] args) throws FileNotFoundException {
		String filePath = "E:\\link.txt";
		File file = new File(filePath);
		PrintStream ps = new PrintStream(new FileOutputStream(file));
		ps.append("xjh");// 在已有的基础上添加字符串

		// new WriteStringToTxt().WriteStringToFile(filePath);
		// new WriteStringToTxt().WriteStringToFile2(filePath);
		// new WriteStringToTxt().WriteStringToFile3(filePath);
		// new WriteStringToTxt().WriteStringToFile4(filePath);
		new testview().WriteStringToFile(filePath);
	}
}
