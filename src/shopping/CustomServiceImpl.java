package shopping;
public class CustomServiceImpl implements CustomerService {
	
	Customer customer;
	Product[] cart;
	int i;

	public CustomServiceImpl() {
		customer = new Customer();
		/*cart=new Product[4];*/
		cart=new Product[4];
		i=0;
	}
	@Override
	public String buy(Product p) {
	
		String result = "";
		int money = customer.getMoney();
		int pprice = p.getPrice();
		if (money > pprice) {
			customer.setMoney(money - pprice);
			result ="카트에 추가됨";
		} else {
			result = "잔액부족";
		}
		add(p);
		return result;
	}
	@Override
	public void add(Product p) {
	/* c.getCart()[i]=p;*/
	cart[i]=p;
	 i++;
	}
/* 쇼핑을 마치고 영수증을 출력한다.
 * tv 300
 * 지금 상황에선 3개만 구입한 내용이 나온다
 * */
	@Override
	public String getBill() {
		String bill="";
		i=0;
		for(int k=0;k<3;k++);
		bill=cart[i].toString()+"\n";
		i++;
		return bill;
	}

}
