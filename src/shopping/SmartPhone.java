package shopping;

public class SmartPhone extends Product{
	private String giga;
	
	public SmartPhone() {
		super(300);
	}
	public String getName(){
		return "폰";
	}

	public String getGiga() {
		return giga;
	}

	public void setGiga(String giga) {
		this.giga = giga;
	}

	@Override
	public String toString() {
		return "품목:" + getName() + ", price=" + super.getPrice() + "원";
	}
	
}
