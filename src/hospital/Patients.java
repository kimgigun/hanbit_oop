package hospital;

public class Patients extends Member {
	private String patJob;
	private int docId,nurId;
      
      
      
      public void setPatJob(String patJob){
    	  this.patJob=patJob;
      }
      public String getPatJob(){
    	  return patJob;
      }

      public void setdocId(int docId){
    	  this.docId=docId;
      }
      public int getdocId(){
    	  return docId;
      }
      public void setNnurId(int nurId){
    	  this.nurId=nurId;
      }
      public int getNurid(){
    	  return nurId;
      }
  
      @Override
      public String toString() {
      	return String.format(
      			"환자ID:%s\n"
      			+ "간호사ID%s\n"
      			+ "의사ID%s\n"
      			+ "환자성명:%s\n"
      			+ "환자성별%:s\n"
      			+ "주민번호%s\n"
      			+ "주소%s\n"
      			+ "전화번호%s\n"
      			+ "이메일%s\n"
      			+ "직업%s\n",
      			uid,name,ssn,addr,phone,email,patJob);
      } 
   
}