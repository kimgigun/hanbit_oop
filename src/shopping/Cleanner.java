package shopping;

public class Cleanner extends Product {
	private String power;
	public Cleanner(){
		super(300);
	}
	public String getName(){
		return "청소기";
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power=power;
	}

	@Override
	public String toString() {
		return "품목:" + getName() + ", price=" + super.getPrice() +"원";
	}
	
}
