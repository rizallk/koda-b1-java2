package com.koda;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println();

        Employee permanentEmp = new PermanentEmployee("PE001", "Anto", "Senior Fullstack Dev", "IT", 5000000);
        Employee contractEmp = new ContractEmployee("CE002", "Sugiono", "Project Manager", "IT", 5000000);

        EmployeeService permanentEmpService = new EmployeeService(permanentEmp);
        EmployeeService contractEmpService = new EmployeeService(contractEmp);

        System.out.println("================================");
        System.out.println("         Koda Enterprise        ");
        System.out.println("================================\n");

        System.out.println("Permanent Employee");
        permanentEmpService.showEmployee();
        System.out.println();
        permanentEmpService.giveRaise(1000000);
        permanentEmpService.showEmployeeCurrentSalary();
        System.out.println();

        System.out.println("================================\n");

        System.out.println("Contract Employee");
        contractEmpService.showEmployee();
        System.out.println();
        contractEmpService.giveRaise(300000);
        contractEmpService.showEmployeeCurrentSalary();
        System.out.println();
        try {
            contractEmpService.giveRaise(1000000);
        } catch (Exception e) {
            System.out.println("Gagal : " + e.getMessage());
        }
        contractEmpService.showEmployeeCurrentSalary();
        System.out.println();
        try {

            contractEmpService.giveRaise(-500000);
        } catch (Exception e) {
            System.out.println("Gagal : " + e.getMessage());
        }
        contractEmpService.showEmployeeCurrentSalary();
        System.out.println();

        System.out.println("================================");

    }
}
