package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		//TODO ここから実装する
		ConsoleReader consoleReader = new ConsoleReader();
		List<Member> members = new ArrayList<Member>();
		Member miura = Member.getInstance(1, "Passw0rd", "Miura Manbu", 28, 2);
		members.add(miura);
		Member sato = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);
		members.add(sato);
		
		System.out.println("===会員情報を表示します===");
		MemberManager.showAllMembers(members);
		
		System.out.println("===パスワードを変更します===");
		int targetId;
		String newPassword;
		
		System.out.print("input target id >>");
		try {
			targetId = consoleReader.inputNumber();
			
			System.out.print("input new password >>");
			newPassword = consoleReader.inputString();
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("不正な入力です");
			e.printStackTrace();
			return;
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("不正な入力です");
			e.printStackTrace();
			return;
		}
		
		MemberManager.updatePassword(members, targetId, newPassword);
		
		System.out.println("---SHOW DATA---");
		MemberManager.showAllMembers(members);
	}

}
