package phone;

public class Phone /*extends Object :상속받지않으면 묵시적으로 object클래스 상속*/{
		public final static String KIND="삼성전화기";
		protected String receiver,call;
		
		public void setReceiver(String receiver){
			this.receiver=receiver;
		}
		public String getReceiver(){
			return receiver;
		}
		public void setCall(String call){
			this.call=call;
		}
		public String getCall(){
			return call;
		}
	/*	public String toString(){
			String result="";
			
			return result;
		}*/
		@Override
		public String toString() {
		/*	String myProp="";
			myProp=KIND+"를 사용해서"+receiver+"에게"+call+"이라고 말했다.";*/
		return KIND+" 를 사용해서"+receiver+" 에게"+call+" 라고 말했다.";
		}
		
}
