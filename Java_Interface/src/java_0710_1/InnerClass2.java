package java_0710_1;


interface Runnable{
	public void run();
}
class BankAccount{
	private int balance;	// 잔액
	private String bankName = "계림Bank";
	public BankAccount(int balance) {		// 생성자 메서드
		this.balance = balance;
	}
	public void showBalance() {				// 잔액 확인 메서드
		System.out.println("계좌 잔액 : "+balance);
	}
	
	// 인스턴스 내부 클래스
	class Transaction{	// 거래 - 입금, 출금
		void deposit(int amount) {
			balance = balance + amount;
			System.out.println("입금 금액 : "+amount);
		}
		void withdraw(int amount) {
			if(balance >= amount) {
			balance = balance-amount;
			System.out.println("출금 금액 : "+amount);
			}else {
			// 출금액이 부족하다면
			System.out.println("잔액 부족! 출금 불가.");
		}
		
	}
}
public static class InnerClass2 {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(3000000);
		account.showBalance();
		
		BankAccount.Transaction tran = account.new Transaction();
		tran.deposit(50000);
		account.showBalance();
		tran.withdraw(200000);
		account.showBalance();
		

	}

}
}
/*
	클래스 : BankAccount;
	BankAccount 내부클래스 ->
		인스턴스 내부클래스 : Transaction (거래)
		정적 내부 클래스 : BankInfo (은행정보)
		지역 내부 클래스 : Loan (대출)
		익명 내부 클래스 : Runnable (이자계산)
*/
