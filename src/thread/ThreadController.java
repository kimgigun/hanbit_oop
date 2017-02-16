package thread;
import java.lang.Thread;
import java.lang.String;
import java.lang.Object;

public class ThreadController {
	public static void main(String[] args) {
		ATM atm=new ATM();	
		Runnable hong=new User("홍길동",atm);   //<-이게 associ Runnable 로 하지 않고 User로 하면 User만 사용가능 하지만 Runnable 로 하면 부모 메서드 사용가능
		Runnable kim=new User("김유신",atm);  
		Runnable lee=new User("이순신",atm);  
		Thread thr1=new Thread(hong);           //<데코 패턴
		thr1.start();
		Thread thr2=new Thread(kim);
		thr2.start();
		Thread thr3=new Thread(lee);
		thr3.start();
	}
}
class ATM {
	public synchronized void inchul(String name){
		System.out.println(name+"님이 인출요청함");
		for(int i=0;i<=5;i++){
			if(i==5){
				System.out.println(name+"님이 인출중 입니다");
			}
		}
		System.out.println(name+"님이 인출해 나감");
			
	}
}

class User implements Runnable{
	private String name;
	private ATM atm;     //<---atm을 위한거라고?   has a 관계
	public User(String name,ATM atm) {
		super();
		this.atm=atm;     //디펜던시
		this.name=name;
	}

	@Override
	public void run() {
		atm.inchul(name);
		
		
	}
}
