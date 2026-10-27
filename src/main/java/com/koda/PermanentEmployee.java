package com.koda;

public class PermanentEmployee extends Employee {
  public PermanentEmployee(String employeeId, String name, String position,
      String department, int salary) {
    super(employeeId, name, position, department, salary);
  }

  @Override
  public void increaseSalary(int amount) {
    if (amount <= 0) {
      System.out.println("Error : Kenaikan gaji harus lebih dari 0");
    } else {
      salary += amount;
      System.out.println("Salary Increase : Rp " + amount);
    }
  }
}
