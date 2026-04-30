package q02_advanced.question03;

import java.io.IOException;

public class SystemMain03 {

	public static void main(String[] args) {
		ConsoleReader consolereader = new ConsoleReader();
		MemberStorage members = new MemberStorage();
		LoginService loginService = new LoginService(members);
		System.out.println("ログイン情報を入力してください");
		boolean isLogin = false;
		//TODO ここから実装する
		// ここに手順書どうりの記述するとだめなのでは？
//		ConsoleReader consolereader = new ConsoleReader();
//		MemberStorage members = new MemberStorage();
		int inputId = 0;
		String inputPass = null;
		Member loginUser = null;
		
		while (isLogin == false) {
			System.out.print("input id >>");
			try {
				inputId = consolereader.inputNumber();
				
				System.out.print("input password >>");
				inputPass = consolereader.inputString();
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println("不正な値です。再度入力してください。");
				continue;
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("不正な値です。再度入力してください。");
				continue;
			}
			loginUser = loginService.doLogin(inputId, inputPass);
			
			if (loginUser == null) {
				System.out.println("IDまたはパスワードが間違っています。再度入力してください。");
				continue;
			}else if (loginUser != null) {
				System.out.println("ログインに成功しました。");
				isLogin = true;
			}
		}
		
		System.out.println("ログインユーザ情報を表示します。");
		System.out.println(loginUser);
	}

}
