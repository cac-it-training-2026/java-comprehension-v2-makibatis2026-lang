package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];
		//TODO ここから実装する
		NonMember nonMemberObj = new NonMember("Sato Kensuke");
		members[0] = nonMemberObj;
		
		Member memberObj = new Member(1, "passw0rd", "Miura Manabu", 28, 2);
		members[1] = memberObj;
		
		System.out.println("---SHOW MEMBERS---");
		MemberManager.showAllMembers(members);
		
		System.out.println("---BUY ITEM---");
		for (AbstMember m : members) {
			m.buyItem();
		}
	}

}
