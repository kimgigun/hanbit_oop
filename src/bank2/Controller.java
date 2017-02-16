package bank2;
import javax.swing.*;
import test.Member;

public class Controller {
   /*
    * public static void main(String[] args) { new Controller().start();
    */

   public void start() {
      Member member = null;
      Account account = null;
      String ssn = "";
      while (true) {
         /*
          * String option = JOptionPane.
          * showInputDialog("0.종료 1.회원등록 2.통장개설 3.입금 4.출금 5.조회 6.해지");
          */
         /*
          * int opt = Integer.parseInt(option); String opt2 =
          * String.valueOf(opt);
          */
         switch (JOptionPane.showInputDialog("0.종료 1.회원등록 2.통장개설 3.입금 4.출금 5.조회 6.해지")) {
         case "0":
            return;
         case "1":
            member = new Member();

            while (true) {
               /* System.out.println("주민번호"); */
               /*
                * String str=JOptionPane.showInputDialog("주민번호"); ssn =
                * s.next();
                */

               ssn = JOptionPane.showInputDialog("주민번호");
               char ch = ssn.charAt(7);
               if (ch == '0' || ch == '7' || ch == '8' || ch == '9') {
                  /* System.out.println("다시 입력하세요"); */
                  JOptionPane.showMessageDialog(null, "올바른 값을 입력하세요.");
               } else {
                  break;
               }
            }
            /* System.out.println("이름"); */
            /* JOptionPane.showInputDialog("이름"); */
            JOptionPane.showMessageDialog(null, member.getSsn() + "회원이 등록 되었습니다.");
            member.setName(JOptionPane.showInputDialog("이름"));
            /* System.out.println("아이디"); */
            /* JOptionPane.showInputDialog("아이디"); */
            member.setUid(JOptionPane.showInputDialog("아이디"));
            break;
         case "2":
            String uid = "";
            int accout,money = 0;
            String accountType = "저축예금";
            account = new WageAccount(uid, accountType, money);
            // [한빛은행] 123456
            /*
             * [한빛뱅크] 계좌번호:123456 
             * 예금종류:저축예금 
             * 송상훈님 
             * 가입일:2016년12월14일
             * 잔액:￦0
             */
            StringBuffer sb = new StringBuffer();
            while (true) {

               if (member.getUid().equals(JOptionPane.showInputDialog("아이디를 입력하세요."))) {
                  break;
               } else {
                  /* System.out.println("올바른 아이디를 입력하세요"); */
                  JOptionPane.showMessageDialog(null, "올바른 아이디를 입력해 주세요.");
               }
            }
            sb.append("[" + Account.BANK_NAME + "\n");
            sb.append("계좌번호:" + account.createAccountNo() + "\n");
            sb.append("예금종류:" + accountType + "\n");
            sb.append("가입일:" + account.getCreateDate() + "\n");
            sb.append("잔액:" + account.getMoney() + "\n");
            /* System.out.println(sb.toString()+"\n"); */
            JOptionPane.showMessageDialog(null, sb.toString() + "\n");
            break;
         case "3":
        	account.deposit(Integer.parseInt(JOptionPane.showInputDialog("입금액을 기입해 주세요.")));
            JOptionPane.showMessageDialog(null,"잔액은"+account.getMoney()+"원 입니다.");
            break;
         case "4":
        /*	account.withdraw(Integer.parseInt(JOptionPane.showInputDialog("출금액을 입력 하세요"))); 
            JOptionPane.showMessageDialog(null,"잔액은"+account.withdraw()+"원 입니다.");*/
            JOptionPane.showMessageDialog(null,"잔액은"+account.withdraw(Integer.parseInt(JOptionPane.showInputDialog("출금액을 입력 하세요")))+"원 입니다.");
            break;
         case "5":
            break;
         case "6":
            break;
         }
      }
   }
}