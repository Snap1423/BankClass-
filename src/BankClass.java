public class BankClass {

    private int number;

    private double balance;

    private String customerName;

    private String customerEmail;

    private String customerPhone;


    public BankClass(){
        System.out.println("Empty Constructor called");
    }

    public BankClass(int  number, double balance, String customerName, String email ,
                     String phone){
        System.out.println("Account constructor with ");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phone;
    }

    public void depositFund(double depositAmount){
        balance+= depositAmount;
        System.out.println("Deposit of $ " +depositAmount + " made. new balance is $ " + balance);
    }

    public void withdrawFunds(double withDrawlAmount){

        if(balance - withDrawlAmount < 0){
            System.out.println("Insufficient balance ! You only have $ " + balance + " in your account.");
        } else{
            balance-= withDrawlAmount;
            System.out.println(" Withdrawl of $ " + withDrawlAmount +
                    " processed, remaining balance $ " + balance);
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
