package day06.homework;
import java.util.Scanner; 	

public class homework02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("아이디입력:");
		String a=sc.next();
		System.out.print("비밀번호 입력:");
		String b=sc.next();
		
		if(a.equals("pika")&&b.equals("pika1234"))
			System.out.println("현재 고객님은 VIP이십니다. 20% 할인 적용하여 1600원입니다. ");
		else 
			System.out.println(" 현재 고객님은 일반 고객이십니다. 2000원입니다.");
		
	}
}
