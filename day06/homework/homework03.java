// Math.random()을 사용하여 2단 ~ 9단 중 1개를 랜덤하게 내고 
		// 답을 입력 받음
		// "정답!" 혹은 "땡!"을 출력
package day06.homework;
import java.util.Scanner;

public class homework03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를입력하세요");
		int a=sc.nextInt();
		int r=(int)(Math.random()*8)+2;
		if(a==r)
			System.out.println("정답!");
		else
			System.out.println("땡");
		System.out.println("컴퓨터가고른수:"+r);
	}
}
