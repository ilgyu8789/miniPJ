package com.java;
import java.util.*;

public class PhoneBookMain {

	public static void main(String[] args) {

		int num = 0;
		// 클래스를 붑러오는 방법 : 클래스명 변수명 = new 클래스명();
		UserList User = new UserList();
		User.PhoneNumBook();
		while (num != 5) {
			Scanner scan = new Scanner(System.in);
			System.out.println("******************");
			System.out.println("*전화번호 관리 프로그램*");
			System.out.println("******************");

			System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
			System.out.print(">메뉴번호:");
			num = scan.nextInt();

			switch (num) {
			case 1: {
				//	다른 클래스로부터 입출력값을 받아오는 방식 = "변수.메서드"로 표기한다
				User.List();
				break;
			}
			case 2: {
				User.Enrollment();
				break;
			}
			case 3: {
				User.Delete();
				break;
			}
			case 4: {
				User.Search();
				break;
			}
			case 5: {
				User.End();
				break;
			}
			default: {
				User.Other();
			}

			}

		}

	}

}