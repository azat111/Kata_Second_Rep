package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Azat","aaa", (byte) 1);
        userService.saveUser("Azat","bbb", (byte) 2);
        userService.saveUser("Azat","ccc", (byte) 3);
        userService.saveUser("Azat","ddd", (byte) 4);
        userService.getAllUsers().stream().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
