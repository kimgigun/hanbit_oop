package test;

import javax.swing.*;

import hospital.Bmi;

public class Controller {

   public void start(){
   /*   Scanner s = new Scanner(System.in);*/
      int i = 0; // while을 위해서 뺌
      
      String gender="",bmiResult="",ssn = ""; // local variable
      Member member=null;    // local variable 로컬 변수가 되는데 이것은 초기화 된다.
      
      while (true) {
      /*   System.out.println("어떤 작업을 원하시나요? 1.회원등록 2.bmi 측정 3.로또 4.성적표 0. 종료");*/
         
      /*   String selector = JOptionPane.showInputDialog("어떤 작업을 원하시나요? 1.회원등록 2.bmi 측정 3.로또 4.성적표 0. 종료");*/
         switch (JOptionPane.showInputDialog("어떤 작업을 원하시나요? 1.회원등록 2.bmi 측정 3.로또 4.성적표 0. 종료")) {
         case "0":
            return;

         case "1":
            member = new Member();
            member.setName(JOptionPane.showInputDialog("이름"));
            // input SSN
            /*
             * String name = s.next(); member.setName(name);
             */
            while (true) {
               ssn = JOptionPane.showInputDialog("주민번호");
               char ch = ssn.charAt(7);
               if (ch == '0' || ch == '7' || ch == '8' || ch == '9') {
                  System.out.println("다시 입력하세요");
               } else {
                  break;
               }
            }
            // [1]input:ID
            member.setUid(JOptionPane.showInputDialog("아이디"));
            member.setSsn(ssn);
            // [2]calcGender 를 standAlone method
            gender = member.calcGender(ssn);
            JOptionPane.showMessageDialog(null, member.getName()  + gender);
            break;
         // 한석규()

        

         case "3":
            /* 로또 */
            break;
         case "4":
            ReportCard card = new ReportCard();
            card.setName(JOptionPane.showInputDialog("Name:"));
            int  total = 0;
            for (i = 0; i < 6; i++) {
               total += Integer.parseInt(JOptionPane.showInputDialog("Score:"));
            }
            card.setTotal(total);
            card.setAverage(total / 6);
            card.calcGrade();

            JOptionPane.showMessageDialog(null, "Name:" + card.getName());
            JOptionPane.showMessageDialog(null, "Name:" + card.getTotal());
            JOptionPane.showMessageDialog(null, card.getAverage());
            JOptionPane.showMessageDialog(null, card.getName());
            // int score,total,average;
            // String name,grade;
            break;
            
         case "5":
         }
      }
   }
}