package bank2;
import java.util.Calendar;
import util.RandomGenerator;
public abstract class  Account {
   public final static String BANK_NAME = "한빛은행";
   public final static String ACCOUNT_TYPE="일반통장";
   public final static String WITHDRAW_SUCCESS="출금성공";
   public final static String WITHDRAW_FAIL="잔액부족";
   public final static String DEPOSIT_SUCCESS="입금성공";
   public final static String DEPOSIT_FAIL="입금실패";
   protected int money, accountNo;
   protected String uid, accountType, createDate;
   public Account(){}
   public Account(String uid, String accountType, int money) { // 6자리랜덤숫자.
      accountNo = createAccountNo(); // math.randem...100000~999999
      createDate = today();
      this.uid = uid;
      this.accountType = accountType;
      this.money = money;
   }
   
   public String today() {
      /*String today = "";
      // 로직을 짜세요.
      StringBuffer sb = new StringBuffer();
      Calendar now = Calendar.getInstance();
      int yy = now.get(now.YEAR);
      int mm = now.get(now.MONTH) + 1;
      int dd = now.get(now.DAY_OF_MONTH);
      sb.append(yy);
      sb.append("년");
      sb.append(mm);
      sb.append("월");
      sb.append(dd);
      sb.append("일");
      today = sb.toString();
      return today;*/
      String today = "";
      // 로직을 짜세요.
      StringBuffer sb = new StringBuffer();
      Calendar now = Calendar.getInstance();
      int yy = now.get(Calendar.YEAR);
      int mm = now.get(Calendar.MONTH) + 1;
      int dd = now.get(Calendar.DAY_OF_MONTH);
      sb.append(yy);
      sb.append("년");
      sb.append(mm);
      sb.append("월");
      sb.append(dd);
      sb.append("일");
      today = sb.toString();
      return today;
   }
   public int createAccountNo() {
      int accountNo= 0;
      // 로직을짜세요.
      // math.random...100000~999999
      /* int Math.random() */
      accountNo=RandomGenerator.getRandomNum(100000,999999);
      return accountNo;
   }
   public int getAccountNo() {
      return accountNo;
   }
   public String getUid() {
      return uid;
   }
   public String getCreateDate() {
      return createDate;
   }

   public int getMoney(){
      return money;
   }
   public String getAccountType(){
      return accountType;
   }
   public abstract boolean checkMoney(int money);
   public abstract String deposit(int money);
   public abstract String withdraw(int money);
}