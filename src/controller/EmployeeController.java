package controller;

import model.Employee;
import service.EmployeeService;

public class EmployeeController {

    public static String saveData(Employee data) {
        return EmployeeService.storeEmployeeInfo(data);
    }

    public static Object[][] getAllData() {
        return EmployeeService.getAllEmployees();
    }

    public static String deleteData(int id) {
        return EmployeeService.deleteData(id);
    }

    public static Employee getById(int id) {
        return EmployeeService.getById(id);
    }

}
