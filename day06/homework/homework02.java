package day06.homework;
import java.util.Scanner; 	

public class homework02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("���̵��Է�:");
		String a=sc.next();
		System.out.print("��й�ȣ �Է�:");
		String b=sc.next();
		
		if(a.equals("pika")&&b.equals("pika1234"))
			System.out.println("���� ������ VIP�̽ʴϴ�. 20% ���� �����Ͽ� 1600���Դϴ�. ");
		else 
			System.out.println(" ���� ������ �Ϲ� ���̽ʴϴ�. 2000���Դϴ�.");
		
	}
}
