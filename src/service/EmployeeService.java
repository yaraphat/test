package service;

import dao.JdbcDao;
import model.Employee;

import java.util.List;

public class EmployeeService {

    public static String storeEmployeeInfo(Employee data) {
        if (data.getId() > 0) {
            JdbcDao.edit(data);
        } else {
            JdbcDao.save(data);
        }
        return (data.getId() > 0) ? "Successfully stored info" : "Failed to store info";
    }

    public static Object[][] getAllEmployees() {
        List<Employee> students = JdbcDao.findAll();
        Object[][] dataSet = new Object[students.size()][5];
        for (int i = 0; i < students.size(); i++) {
            Employee s = students.get(i);

            Object[] data = new Object[5];
            data[0] = s.getId();
            data[1] = s.getName();
            data[2] = s.getDesignation();
            data[3] = s.getDepeartment();
            data[4] = s.getSalary();

            dataSet[i] = data;
        }
        return dataSet;
    }

    public static Employee getById(int id) {
        return JdbcDao.getById(id);
    }

    public static String deleteData(int id) {
        int count = JdbcDao.delete(id);
        return count > 0 ? "Successfully removed data" : "Failed to remove data";
    }

}
