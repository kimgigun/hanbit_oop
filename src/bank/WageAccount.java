package bank;



public class WageAccount extends Account {
	public WageAccount(String uid, String accountType, int money) { // 6자리랜덤숫자.
		accountNo = createAccountNo(); // math.randem...100000~999999
		createDate = today();
		super.uid = uid;
		super.accountType = accountType;
		super.money = money;
	}

	@Override
	public String deposit(int money) {
		String result = "";
		if (checkMoney(money-0)) {
			super.money += money;
			result = Account.DEPOSIT_SUCCESS;
		} else {
			result = Account.DEPOSIT_FAIL;
		}
		return result;
	}

	@Override
	public String withdraw(int money) {
		if (checkMoney(super.money-money)) {
			super.money-=money;
			return Account.WITHDRAW_SUCCESS;
		} else {
			money = super.money;
			return Account.WITHDRAW_FAIL;
		}
	}

	@Override
	public boolean checkMoney(int money) {
		/*
		 * boolean flag = false;
		 *  if(money>=0){ flag=true; }
		 *   return flag;
		 */
		return money >= 0; // 삼항연산자
	}
}
