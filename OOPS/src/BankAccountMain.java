public class Main {

    public static void main(String[] args) throws Exception {
        
        BankAccount bankAccountObj = new BankAccount(1234567, "ABCD", 50000.0);
        System.out.println("Original Account Details");
        bankAccountObj.displayInformation();
        System.out.println("----------------------\n");
        bankAccountObj.depositCash(7000);
        System.out.println("Updated balance after deposit");
        bankAccountObj.displayInformation();
        System.out.println("-----------------------\n");
        bankAccountObj.withdrawCash(2000);
        System.out.println("Updated balance after withdrawal");
        bankAccountObj.displayInformation();

    }
}
