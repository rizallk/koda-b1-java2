package com.koda;

public class ContractEmployee extends Employee {
  public ContractEmployee(String employeeId, String name, String position, String department, int salary) {
    super(employeeId, name, position, department, salary);
  }

  @Override
  public void increaseSalary(int amount) {
    System.out.println("Salary Increase : Rp " + amount);
    if (amount <= 0) {
      throw new IllegalArgumentException("Kenaikan gaji harus lebih dari 0");
    }
    if (amount > 500000) {
      throw new IllegalArgumentException("Kenaikan gaji maksimal Rp. 500.000");
    }
    salary += amount;
  }
}
