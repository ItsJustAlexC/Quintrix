import java.sql.*;

public class Practice3 {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306";
        String user = "root";
        String password = "letmein";


        String sql = "create database practice";
        String sql1 = "use practice";
        String sql2 = "create table employee(" +
                      "id int not null, " +
                      "name varchar(255), " +
                      "department_id int not null, " +
                      "primary key(id))";

        String sql3 = "insert into employee(id, name, department_id) values (0,\"Alex\",1)";
        String sql4 = "insert into employee(id, name, department_id) values (1,\"Michael\",2)";
        String sql5 = "insert into employee(id, name, department_id) values (2,\"Matt\",2)";
        String sql6 = "insert into employee(id, name, department_id) values (3,\"Nathan\",1)";
        String sql7 = "insert into employee(id, name, department_id) values (4,\"Fred\",1)";

        String sql8 = "create table department(" +
                      "department_id int not null, " +
                      "department_name varchar(255), " +
                      "primary key(department_id))";

        String sql9 = "insert into department(department_id, department_name) values (1,\"Tech\")";
        String sql10 = "insert into department(department_id, department_name) values (2,\"Engineering\")";

        String outJoin ="select employee.id, employee.name, employee.department_id, department.department_name from employee join department on employee.department_id = department.department_id";



        try (Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
        ){
            statement.executeUpdate(sql);
            System.out.println("Database created successfully");
            statement.executeUpdate(sql1);
            statement.executeUpdate(sql2);
            statement.executeUpdate(sql3);
            statement.executeUpdate(sql4);
            statement.executeUpdate(sql5);
            statement.executeUpdate(sql6);
            statement.executeUpdate(sql7);
            statement.executeUpdate(sql8);
            statement.executeUpdate(sql9);
            statement.executeUpdate(sql10);
            System.out.println("Tables created successfully");

            ResultSet result = statement.executeQuery(outJoin);

            System.out.println("ID     Name     Employee DepartmentID     Department Name");
            while(result.next()){
                String formatted = String.format("%-7s%-20s%-15s%s", result.getString("id"),result.getString("name"), result.getString("department_id"), result.getString("department_name"));
                System.out.println(formatted);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
