public class Main {
    public static void main(String[] args) {

        System.out.println();

        System.out.println("____Salary Slip of an Employee____");
        System.out.println();
        class Employee {

            int EmployeeId = 45;
            String FirstName = "Lokesh";
            String LastName = "Kumar";
            int Salary = 25000;
            String Fullname = FirstName + " " + LastName;

        }

        class EmployeePlus extends Employee {
            public void getEmployeeId() {
                System.out.println(this.EmployeeId);
                System.out.println();
            }

            public void getFirstName() {
                System.out.println(this.FirstName);
                System.out.println();
            }

            public void getLastName() {
                System.out.println(this.LastName);
                System.out.println();
            }

            public void getFullName() {
                System.out.println(this.Fullname);
                System.out.println();
            }

            public void getSalary() {
                System.out.println(Salary);
                System.out.println();
            }

            public void SetSalary(int Pay) {
                Salary = Pay;
                System.out.println();
            }


            public void GetAnnualPay(){
                int AnnualPay = Salary * 12;
                System.out.println(AnnualPay);
                System.out.println();
            }

            public void Getincrement(){
                double Increment = Salary * 0.25;
                System.out.println(Increment);
                System.out.println();
            }

            public void getTotalSalary(){
                double TotalSalary = (Salary * 12) + (0.25 * Salary);
                System.out.println(TotalSalary);
                System.out.println();
            }

            public void getEmployeeDetails(){

                System.out.println("Salary SLip");
                System.out.println("_______________");
                System.out.println(" Employee Id :" + EmployeeId);
                System.out.println(" First Name  : " + FirstName);
                System.out.println(" Last Name   : " + LastName);
                System.out.println(" Full Name   : " + FirstName  + " " + LastName);
                System.out.println(" Salary      : " + Salary);
                System.out.print(" Annual Pay  : ");
                GetAnnualPay();
                System.out.print(" Increment   : ");
                Getincrement();

                System.out.print(" Total Salary Deducted :");
                getTotalSalary();
            }

        }
        
        EmployeePlus SalarySLip = new EmployeePlus();

        SalarySLip.getEmployeeId();
        SalarySLip.getFirstName();
        SalarySLip.getLastName();
        SalarySLip.getFullName();
        SalarySLip.getSalary();
        SalarySLip.GetAnnualPay();
        SalarySLip.Getincrement();
        SalarySLip.getEmployeeDetails();
    }
}