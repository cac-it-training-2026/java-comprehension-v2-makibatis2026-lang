package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member miura = new Member();
		miura.setName("Miura Manabu");
		miura.setAge(30);
		miura.setRank(1);
		
		System.out.println("---SHOW DATA---");
		miura.showMember();
		System.out.println(">>>RANK UP>>>");
		miura.rankUp();
		System.out.println("---GET RANK---");
		int newRank = miura.getRank();
		System.out.println("newRank:" + newRank);
		
	}
}
