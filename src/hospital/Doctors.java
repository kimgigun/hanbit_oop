package hospital;

public class Doctors extends Member{
      private String docPosition, majorTreat;
      
      public void setDocPosition(String docPosition){
          this.docPosition=docPosition;
       }
       public String getDocPosition(){
          return docPosition;
       }
       public void setMajorTreat(String majorTreat){
          this.majorTreat=majorTreat;
       }
       public String getMajorTreat(){
          return majorTreat;
       }
      
     @Override
    public String toString() {
    	return String.format("의사ID: %d \n"
    			+ "담당진료과목: %s \n"
    			+ "성명 %s \n"
    			+ "성별 %s \n"
    			+ "전화번호 %s \n"
    			+ "이메일 %s \n"
    			+ "직급 %s \n",
    			super.uid, majorTreat, super.name, super.gen,
    			super.phone,super.email,docPosition);
    } 
}
 /*  public void setDocName(String docName){
      this.docName=docName;
   }
   public String getDocName(){
      return docName;
   } 
   public void setDocGen(String docGen){
      this.docGen=docGen;
   }
   public String getDocGen(){
      return docGen;
   }
   public void setDocPhone(String docPhone){
      this.docPhone=docPhone;
   }
   public String getDocPhone(){
      return docPhone;
   }
   public void setDocEmail(String docEmail){
      this.docEmail=docEmail;
   }
   public String getDocEmail(){
      return docEmail;
   }*/

