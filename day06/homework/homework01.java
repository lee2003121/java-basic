package day06.homework;
import java.util.Scanner;

public class homework01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("�����Է�:");
		int a=sc.nextInt();
		if(a%4==0)
		{
			if((a%100==0)&&(a%400!=0))
				System.out.println("���");
			else
				System.out.println("����");
		}
		else
			System.out.println("���");
	}
}
