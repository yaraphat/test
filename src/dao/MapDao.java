package dao;

import model.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDao {

    private static Map<Integer, Employee> database = new HashMap<>();
    private static int lastId = 0;

    public static int save(Employee data) {
        int id = ++lastId;
        data.setId(id);
        database.put(id, data);
        return id;
    }

    public static int edit(Employee data) {
        database.put(data.getId(), data);
        return data.getId();
    }

    public static List<Employee> findAll() {
        return database.values().stream().collect(Collectors.toList());
    }

    public static Employee getById(int id) {
        return database.getOrDefault(id, new Employee());
    }


    public static int delete(int id) {
        if(database.containsKey(id)) {
            database.remove(id);
            return 1;
        } else {
            return 0;
        }
    }


}
