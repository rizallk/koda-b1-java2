package com.koda;

public class EmployeeService {
  public Employee employee;

  public EmployeeService(Employee employee) {
    this.employee = employee;
  }

  public void showEmployee() {
    employee.showInfo();
  }

  public void showEmployeeCurrentSalary() {
    employee.showCurrentSalary();
  }

  public void giveRaise(int amount) {
    employee.increaseSalary(amount);
  }
}
