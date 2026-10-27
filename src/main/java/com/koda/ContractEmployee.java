package com.koda;

public class ContractEmployee extends Employee {
  public ContractEmployee(String employeeId, String name, String position, String department, int salary) {
    super(employeeId, name, position, department, salary);
  }

  @Override
  public void increaseSalary(int amount) {
    if (amount <= 0) {
      System.out.println("Error : Kenaikan gaji harus lebih dari 0");
      return;
    }
    if (amount > 500000) {
      System.out.println("Error : Kenaikan gaji maksimal Rp. 500.000");
      return;
    }
    salary += amount;
    System.out.println("Salary Increase : Rp " + amount);
  }
}
