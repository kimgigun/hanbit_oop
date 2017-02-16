package hospital;

public class Member {
	protected String name,ssn,gen,email,addr,phone;
	protected int uid;
	
	public void setGEn(String gen){
		this.gen=gen;
	}
	public String get(){
		return gen;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setSsn(String ssn){
		this.ssn=ssn;
	}
	public String getSsn(){
		return ssn;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return email;
	}
	public void setAddr(String addr){
		this.addr=addr;
	}
	public String getAddr(){
		return addr;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getPhone(){
		return phone;
	}
	public void setUid(int uid){
		this.uid=uid;
	}
	public int getUid(){
		return uid;
	}

}
