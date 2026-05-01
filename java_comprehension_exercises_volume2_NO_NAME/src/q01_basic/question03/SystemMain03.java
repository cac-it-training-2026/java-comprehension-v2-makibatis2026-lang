package q01_basic.question03;

public class SystemMain03 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member nullMember = new Member();
		
		System.out.println("---SHOW DATA(NULL)---");
		nullMember.showMember();
		
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;
		
		Member miura = new Member(name, age, rank);
		
		System.out.println("---SHOW DATA(Miura)---");
		miura.showMember();
		
	}

}
