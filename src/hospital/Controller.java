package hospital;
import javax.swing.*;

/*import test.Bmi;*/
public class Controller {
	public final static String EXE_OPTION = "0.EXIT\n" + "1.REG-DOCTOR\n" + "2.REG-NURSES\n" + "3.REG-PATIENTS\n"
			+ "4.CHECK BMI\n";
	public final static String DOC_SPEC = "INPUT AS 의사ID,담당진료과목,성명,성별,전화번호,이메일,직급";
	public final static String NUR_SPEC = "INPUT AS 간호사ID,담당진료과목,성명,ssn,전화번호,이메일,직급";
	public final static String PAT_SPEC = "INPUT AS 환자ID,담당진료과목,성명,ssn,전화번호,이메일,직급";
	public void start() {
		while (true) {
			/*
			 * [의사]한석규(남) 36세, han@test.com, 010 - 1234 -5678 [간호사]박신혜(여) 25세,
			 * park@test.com, 010 - 1234 -5678 [환자]홍길동(남) 15세, hong@test.com,
			 * 010 - 1234 -5678
			 */
			switch (JOptionPane.showInputDialog(EXE_OPTION)) {
			case "0":
				return;
			case "1":

				Doctors doc = new Doctors();
				String docInfo = JOptionPane.showInputDialog(DOC_SPEC);
				String[] docInfoArr = docInfo.split(",");
				doc.setUid(Integer.parseInt(docInfoArr[0]));
				doc.setMajorTreat(docInfoArr[1]);
				doc.setName(docInfoArr[2]);
				doc.setSsn(docInfoArr[3]);
				doc.setPhone(docInfoArr[4]);
				doc.setEmail(docInfoArr[5]);
				doc.setDocPosition(docInfoArr[6]);
				JOptionPane.showMessageDialog(null, doc.toString());
				/*
				 * doc.setUid(Integer.parseInt(JOptionPane.showInputDialog(
				 * DOC_SPEC)));
				 */

				break;
			case "2":
				Nurses nur = new Nurses();
				String nurInfo = JOptionPane.showInputDialog(NUR_SPEC);
				String[] nurInfoArr = nurInfo.split(",");
				nur.setUid(Integer.parseInt( nurInfoArr[0]));
				nur.setMajorJob(nurInfoArr[1]);
				nur.setName(nurInfoArr[2]);
				nur.setSsn(nurInfoArr[3]);
				nur.setPhone(nurInfoArr[4]);
				nur.setEmail(nurInfoArr[5]);
				nur.setNurPosition(nurInfoArr[6]);
				JOptionPane.showMessageDialog(null, nur.toString());
				break;
			case "3":
				Patients pat = new Patients();
				String patInfo = JOptionPane.showInputDialog(NUR_SPEC);
				String[] patInfoArr = patInfo.split(",");
				pat.setUid(Integer.parseInt(patInfoArr[0]));
				pat.setPatJob(patInfoArr[1]);
				pat.setName(patInfoArr[2]);
				pat.setSsn(patInfoArr[3]);
				pat.setPhone(patInfoArr[4]);
				pat.setEmail(patInfoArr[5]);
				pat.setPatJob(patInfoArr[6]);
				JOptionPane.showMessageDialog(null, pat.toString());
				break;
			case "4":
				Bmi bmi = new Bmi();
				bmi.setCm(Double.parseDouble(JOptionPane.showInputDialog("키를 입력하세요."))/100);
				bmi.setKg(Double.parseDouble(JOptionPane.showInputDialog("몸무게를 입력하세요.")));
				JOptionPane.showMessageDialog(null,bmi.treat()+"입니다." );
				break;
			}
		}
	}
}