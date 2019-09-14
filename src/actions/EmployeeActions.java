package actions;

import dao.EmployeeDAO;
import entity.Employees;

public class EmployeeActions extends Employees {

    public void addEmployee(Employees emp){
        EmployeeDAO empDAO = new EmployeeDAO();
        empDAO.createEmployee(emp);
    }

    public void removeEmployee(int empId){
        EmployeeDAO empDAO = new EmployeeDAO();
        empDAO.deleteEmployee(empId);
    }
}
