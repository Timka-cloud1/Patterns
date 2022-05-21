package behaviourPatterns.chainOfResponsibility.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Server {
    private List<User> list = new ArrayList<>();




    public void addUser(User user) {
        list.add(user);
    }

    public boolean hasEmail(String email) {
        for(User u : list) {
            if(u.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    public boolean isValidPassword(String password) {
        for (User u : list) {
            if (u.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public boolean isAdmin(String role) {
        if(role.equals("admin")) {
            return true;
        }
        return false;
    }

    public String generateSpecialKey() {
        return "23456";
    }
}
