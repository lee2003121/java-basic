// Math.random()�� ����Ͽ� 2�� ~ 9�� �� 1���� �����ϰ� ���� 
		// ���� �Է� ����
		// "����!" Ȥ�� "��!"�� ���
package day06.homework;
import java.util.Scanner;

public class homework03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���ڸ��Է��ϼ���");
		int a=sc.nextInt();
		int r=(int)(Math.random()*8)+2;
		if(a==r)
			System.out.println("����!");
		else
			System.out.println("��");
		System.out.println("��ǻ�Ͱ�����:"+r);
	}
}
