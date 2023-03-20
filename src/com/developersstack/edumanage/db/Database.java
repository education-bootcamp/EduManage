package com.developersstack.edumanage.db;

import com.developersstack.edumanage.model.User;
import com.developersstack.edumanage.util.security.PasswordManager;

import java.util.ArrayList;

public class Database {
    public static ArrayList<User> userTable= new ArrayList();

    static {
        userTable.add(
                new User("Hasika","sandaruwan",
                        "h@gmail.com",
                        new PasswordManager().encrypt("1234"))
        );
    }

}
