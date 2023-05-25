package array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> pNum = new ArrayList<>();

		while (true) {
			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 보기");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.println("5. 종료");
			System.out.print(">>> ");
			int sel = sc.nextInt();
			
			switch (sel) {
			case 1:
				System.out.println("등록할 이름을 입력해주세요");
				String inputName = sc.next();
				System.out.println("등록할 전화번호를 입력해주세요");
				String inputPNum = sc.next();
				if (!pNum.contains(inputPNum)) {
					name.add(inputName);
					pNum.add(inputPNum);
					System.out.println("등록 성공\n");
				}
				else if(pNum.contains(inputPNum)) {
					System.out.println("이미 등록된 전화번호입니다.\n");
				}
				break;
			case 2:
				System.out.println("검색할 전화번호를 입력해주세요.");
				String searchPNum=sc.next();
				if(pNum.contains(searchPNum)) {
					int index = pNum.indexOf(searchPNum);
					System.out.println("이름: "+name.get(index));
					System.out.println("전화번호: "+pNum.get(index)+"\n");
				}
				else {
					System.out.println("등록되지 않은 전화번호입니다.\n");
				}
				break;
			case 3:
				System.out.println("삭제할 전화번호를 입력해주세요");
				String removePNum = sc.next();
				if(pNum.contains(removePNum)) {
					int index = pNum.indexOf(removePNum);
					name.remove(index);
					pNum.remove(index);
					System.out.println("삭제되었습니다.\n");
				}
				else {
					System.out.println("등록되지 않은 전화번호입니다.\n");
				}
				break;
			case 4:
				for(int i = 0;i<pNum.size();i++) {
					System.out.println("이름: "+name.get(i));
					System.out.println("전화번호: "+pNum.get(i)+"\n");
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다");
				sc.close();
				return;
			}
		}
	}
}
