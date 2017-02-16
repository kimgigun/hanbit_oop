package shopping;

public class TV extends Product{
	private String size;
	public TV(){
		super(300);
	}
	public String getName(){
		return "텔레비전";
	}
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return " 품목:" + getName() + ", price=" + super.getPrice() +"원  ";
	}
	

}
