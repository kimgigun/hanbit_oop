package phone;

import javax.swing.JOptionPane;

public class Controller {

	public void start() {
		while(true){
		switch(JOptionPane.showInputDialog("기능선택:0.종료 1.삼성전화기 2.노키아 3.아이폰 4.갤럭시")){
		case "0": return;
		case "1": 
			Phone phone = new Phone();
			phone.setReceiver(JOptionPane.showInputDialog("받는사람"));
			phone.setCall(JOptionPane.showInputDialog("전할 말 을 입력하세요."));
			JOptionPane.showMessageDialog(null, phone.toString());
			break;
		case "2": 
			Nokia nokia = new Nokia();
			nokia.setReceiver(JOptionPane.showInputDialog("받는사람"));
			nokia.setCall(JOptionPane.showInputDialog("전할 말 을 입력하세요."));
			nokia.setPortable(true);
			JOptionPane.showMessageDialog(null, nokia.toString());
			break;
		case "3": 
			Iphone iphone = new Iphone();
			iphone.setPortable(true);
			iphone.setReceiver(JOptionPane.showInputDialog("검색엔진을 입력하세요."));
			iphone.setData(JOptionPane.showInputDialog("무엇을 검색할까요?"));
			JOptionPane.showMessageDialog(null, iphone.toString());
			
			break;
		case "4":
			GalaxyNote galaxyNote =new GalaxyNote(); 
			galaxyNote.setPortable(true);
			galaxyNote.setSize(JOptionPane.showInputDialog("스크린 크기를 입력하세요."));
			galaxyNote.setReceiver(JOptionPane.showInputDialog("검색엔진을 입력하세요."));
			galaxyNote.setData(JOptionPane.showInputDialog("무엇을 검색할까요?"));
			JOptionPane.showMessageDialog(null,galaxyNote.toString());
			break;
		
		}
		}
		
	}

}
