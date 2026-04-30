package q02_advanced.question01;

public class Coupon {
	private int id;
	private double discountRate;
	private String description;

	/**
	 * 引数なしコンストラクタ
	 */
	public Coupon() {
		
	}
	
	/**
	 * 引数ありコンストラクタ
	 * 
	 * @param id
	 * @param discountRate
	 * @param description
	 */
	public Coupon(int id, double discountRate, String description) {
		this.id = id;
		this.discountRate = discountRate;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Coupon [id=" + id + ", discountRate=" + discountRate + ", description=" + description + "]";
	}

	
}
