package q03_extra;

import java.util.ArrayList;
import java.util.List;

class Member {
	private int id;
	private String password;
	private String name;
	private int birthday; 
	private int rank;
	private List<Coupon> coupons;

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return birthday
	 */
	public int getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday セットする birthday
	 */
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @param rank セットする rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * @return coupons
	 */
	public List<Coupon> getCoupons() {
		return coupons;
	}

	/**
	 * @param coupons セットする coupons
	 */
	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	/**
	 * 引数なしコンストラクタ
	 */
	public Member() {
	}

	/**
	 * 引数ありコンストラクタ
	 * 
	 * @param id
	 * @param password
	 * @param name
	 * @param birthday
	 * @param rank
	 */
	public Member(int id, String password, String name, int birthday, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.birthday = birthday;
		this.rank = rank;
		this.coupons = new ArrayList<Coupon>();
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", birthday=" + birthday + ", rank="
				+ rank + ", coupons=" + coupons + "]";
	}

	public void showMember() {
		System.out.println(toString());
		System.out.println("*****************");
	}

//	public static Member getInstance(int id, String password, String name, String birthdayString, int rank) {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		// 以下未実装
//		Member member = new Member(id, password, name, birthday, rank);
//		Coupon coupon1 = Coupon.getInstance(1, 0.5, "最初の特典");
//		Coupon coupon2 = Coupon.getInstance(2, 0.25, "今月の特典");
//		member.coupons.add(coupon1);
//		member.coupons.add(coupon2);
//		
//		return member;
//	}
}
