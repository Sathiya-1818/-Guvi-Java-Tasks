public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("____No and Two args____");
        System.out.println();

        class Account{
           long balance = 100000;
            String name = " Kumar";

            Account(long b, String Name) {
                this.balance = b;
                this.name = Name;
            }

            Account() {

            }

            public void deposit(double dep) {
                this.balance += dep;
                System.out.print( "You have deposited : ");
                System.out.printf("%2f", dep);
                System.out.println();
            }

            public void withdraw(int wd) {
                this.balance -= wd;
                System.out.println("You have withdrawn  : " + wd);
                System.out.println();
            }

            public void chkbalance() {
                System.out.println("Available Balance   : " + this.balance);
                System.out.println();
            }

            public void AccDet() {

                System.out.println("Name                : " + this.name);
                System.out.println();
            }

        }
        Account Acc1 = new Account();
        Account Acc2 = new Account( 25000 , "Prabhu");

       Acc1.AccDet();
       Acc1.chkbalance();
       Acc1.withdraw(5000);
       Acc1.chkbalance();
       Acc1.deposit(10000);
       Acc1.chkbalance();

        System.out.println();
        System.out.println();
        System.out.println();

        Acc2.AccDet();
        Acc2.chkbalance();
        Acc2.deposit(15000);
        Acc2.chkbalance();
        Acc2.withdraw(7500);
        Acc2.chkbalance();

    }
}