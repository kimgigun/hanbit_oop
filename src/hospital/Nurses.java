package hospital;

public class Nurses extends Member {
	private String nurPosition, majorJob;
   
   @Override
  public String toString() {
  	return String.format(
  			"간호사ID:%s\n"
  			+ "담당진료과목:%s\n"
  			+ "성명%:s\n"
  			+ "성별%:s\n"
  			+ "전화번호%s\n"
  			+ "이메일%s\n"
  			+ "직급%s\n",uid,majorJob,name,phone,email,nurPosition);
  } 
  /* public void setNurName(String nurName){
      this.nurName=nurName;
   } 
   public String getNurName(){
      return nurName;
   }
   public void setNurGen(String nurGen){
      this.nurGen=nurGen;
   }
   public String getNurGen(){
      return nurGen;
   }
   public void setNurPhone(String nurPhone){
      this.nurPhone=nurPhone;
   }
   public String getNurPhone(){
      return nurPhone;
   }
   public void setNurEmail(String nurEmail){
      this.nurEmail=nurEmail;
   }
   public String getNurEmail(){
      return nurEmail;
   }
   public void setNurPhoto(String nurPhoto){
      this.nurPhoto=nurPhoto;
   }
   public String getNurPhoto(){
      return nurPhoto;
   }*/
   public void setNurPosition(String nurPosition){
      this.nurPosition=nurPosition;
   }
   public String getNurPosition(){
      return nurPosition;
   }
/*   public void setNurJob(String nurJob){
      this.nurJob=nurJob;
   }
   public String getNurJob(){
      return nurJob;
   }*/
   public void setMajorJob(String majorJob){
      this.majorJob=majorJob;
   }
   public String getMajorJob(){
      return majorJob;
   }
}