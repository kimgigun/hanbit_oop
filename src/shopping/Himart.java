package shopping;

import javax.swing.JOptionPane;

public class Himart {
	public static void main(String[] args) {
		CustomerService service = new CustomServiceImpl();
		Customer c = new Customer();
		String status="";
		/*StringBuffer sb=new StringBuffer();*/
		while(true){
		switch(JOptionPane.showInputDialog("구매를 원하시는 물품을 선택하세요 \n0.종료 \n1.TV \n2.PHONE \n3.청소기 \n4.PC  \n5.잔액조회")){
		case "0": 
			JOptionPane.showMessageDialog(null, service.getBill());   
			return;
		case "1":
			Product tv = new TV();
			/*sb.append(tv.toString());*/
			status = service.buy(tv);
			JOptionPane.showMessageDialog(null, status);
			break;
		case "2":
			Product phone = new SmartPhone();
		/*	sb.append(phone.toString());*/
			status = service.buy(phone);
			JOptionPane.showMessageDialog(null, status);
			break;
		case "3": 
			Product cleanner=new Cleanner();
		/*	sb.append(cleanner.toString());*/
			status = service.buy(cleanner);
			JOptionPane.showMessageDialog(null,status);
			break;
		case "4": 
			Product pc = new Computer();
			/*sb.append(pc.toString());*/
			status =  service.buy(pc);
			JOptionPane.showMessageDialog(null,status);
			break;
		case "5":
			JOptionPane.showMessageDialog(null, c.getMoney());
			
			break;
		}
		;
		
	}
	}
}
