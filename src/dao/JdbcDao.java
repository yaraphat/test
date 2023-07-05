package dao;

import config.DbConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import model.Employee;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class JdbcDao {

    private static int lastId = 0;

    private static int getLastId() {
        if (lastId == 0) {
            try (Connection conn = DbConfig.getConnection()) {
                PreparedStatement stmtMaxId = conn.prepareStatement("select coalesce(max(\"id\"), 0) as max_id from employee");
                ResultSet rsMaxId = stmtMaxId.executeQuery();
                if (rsMaxId.next()) {
                    lastId = rsMaxId.getInt("max_id");
                }
                DbConfig.closeStatement(stmtMaxId, rsMaxId);
            } catch (SQLException ex) {
                Logger.getLogger(JdbcDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ++lastId;
    }

    public static int save(Employee data) {
        int id = getLastId();
        data.setId(id);

        try (Connection conn = DbConfig.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement("insert into employee values(?, ?, ?, ?, ?)");
            stmt.setInt(1, id);
            stmt.setString(2, data.getName());
            stmt.setString(3, data.getDesignation());
            stmt.setString(4, data.getDepeartment());
            stmt.setDouble(5, data.getSalary());

            int result = stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(JdbcDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public static int edit(Employee data) {
        try (Connection conn = DbConfig.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement("update employee set name = ?, designation = ?, department = ?, salary = ? where \"id\" = ?");
            stmt.setString(1, data.getName());
            stmt.setString(2, data.getDesignation());
            stmt.setString(3, data.getDepeartment());
            stmt.setDouble(4, data.getSalary());
            stmt.setInt(5, data.getId());

            return stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(JdbcDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public static List<Employee> findAll() {
        List<Employee> list = new LinkedList<>();
        try (Connection conn = DbConfig.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement("select * from employee order by \"id\" asc");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Employee emp = new Employee();
                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setDesignation(rs.getString("designation"));
                emp.setDepeartment(rs.getString("department"));
                emp.setSalary(rs.getDouble("salary"));

                list.add(emp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JdbcDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static Employee getById(int id) {
        try (Connection conn = DbConfig.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement("select * from employee where \"id\" = ?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Employee emp = new Employee();
                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setDesignation(rs.getString("designation"));
                emp.setDepeartment(rs.getString("department"));
                emp.setSalary(rs.getDouble("salary"));
                return emp;
            }
        } catch (SQLException ex) {
            Logger.getLogger(JdbcDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Employee();
    }

    public static int delete(int id) {
        try (Connection conn = DbConfig.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement("delete from employee where \"id\" = ?");
            stmt.setInt(1, id);

            return stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(JdbcDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}