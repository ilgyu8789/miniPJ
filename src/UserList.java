package miniproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class UserList {
	static Scanner scan = new Scanner(System.in);
	static File file = new File("./files/phonbook.txt");
	
	static ArrayList<HashMap<String, String>> pb_list = new ArrayList<HashMap<String, String>>();
			
	public static void PhoneNumBook() {
		try {
			Scanner scan = new Scanner(file);
			
			int idx = 1;
			
			while (scan.hasNextLine()) {

				String[] split = scan.nextLine().split(", ");
//				System.out.println(Arrays.toString(split));

				HashMap<String, String> map = new HashMap<String, String>();
				map.put("name", split[0]);
				map.put("hp", split[1]);
				map.put("tel", split[2]);
				
				pb_list.add(map);
				idx++;
			}
			scan.close(); // try-catch를 쓸 때 scan은 try문 끝에서 닫아준다
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void List() {
		System.out.println("<1.리스트>");

		for (int i = 0; i < pb_list.size(); i++) {
			System.out.print((i + 1) + ". ");
			System.out.print(pb_list.get(i).get("name") + " ");
			System.out.print(pb_list.get(i).get("hp") + " ");
			System.out.println(pb_list.get(i).get("tel"));
		}

	}

	public static void Enrollment() {
		
		System.out.println("<2.등록>");
		System.out.print(">이름:");
		String name = scan.nextLine();

		System.out.print(">휴대전화:");
		String hp = scan.nextLine();

		System.out.print(">집전화:");
		String tel = scan.nextLine();
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", name);
		map.put("hp", hp);
		map.put("tel", tel);
		
		pb_list.add(map);
	}

	public static void Delete() {
		System.out.println("<3.삭제>");
		
		System.out.print(">번호:");
		int num = scan.nextInt();
		
		pb_list.remove(num -1);
		System.out.println("[삭제되었습니다.]");
	}

	public static void Search() {
		System.out.println("<4.검색>");
		
		System.out.print(">이름:");
		String name = scan.nextLine();
		
		for (int i = 0; i < pb_list.size(); i++) {
			
		}
		
		
		
	}

	public static void End() {
		System.out.println("******************");
		System.out.println("*    감사합니다    *");
		System.out.println("******************");

	}

	public static void Other() {
		System.out.println("[다시입력해주세요]");
	}
}