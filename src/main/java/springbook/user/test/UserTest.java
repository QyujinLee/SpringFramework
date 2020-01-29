package springbook.user.test;

import java.sql.SQLException;

import springbook.user.dao.DUserDAO;
import springbook.user.dao.NUserDAO;
import springbook.user.dao.UserDAO;
import springbook.user.domain.User;

public class UserTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
            UserDAO dao1 = new DUserDAO();
            UserDAO dao2 = new NUserDAO();

            User user = new User();
            user.setId("q_cdax");
            user.setName("gyujin");
            user.setPassword("1234");

            dao1.add(user);

            System.out.println(user.getId() + "등록 성공");

            User user2 = dao1.get(user.getId());
            System.out.println(user2.getName());
            System.out.println(user2.getPassword());

            System.out.println(user2.getId() + "조회 성공");
        }
}

