public class Main {

    public static void main(String[] args) {


        BankClass snapsAccount = new BankClass(12345, 500.00, "snaps Account",
                "r8572894696@gmail.com" , "+91 47294746376");

        System.out.println(snapsAccount.getNumber());
        System.out.println(snapsAccount.getBalance());


      //  snapsAccount.setNumber(12345);
      //  snapsAccount.setBalance(1000.0);
      //  snapsAccount.setCustomerName("snaps Account");
      //  snapsAccount.setCustomerEmail("r966589365036@gmail.com");
      //  snapsAccount.setCustomerPhone("+91 47294746376");

        snapsAccount.withdrawFunds(200.0);
        snapsAccount.depositFund(100.56);
        snapsAccount.withdrawFunds(23.45);


    }


}


