package xjh;

import java.util.Scanner;

public class xuexi
{
	public static void main(String[] args)
	{
		int x;
		char grade;
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一个成绩:");
		x = s.nextInt();
		grade = x >=90 ? 'A' : x >=60?'B':'C';
		System.out.println("成绩等级："+ grade);
		
	}

}
