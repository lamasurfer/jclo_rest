package com.example.rest.repository;

import com.example.rest.model.Authorities;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {

    private final Map<String, String> users = new ConcurrentHashMap<>();

    public List<Authorities> getUserAuthorities(String user, String password) {
        return users.containsKey(user) && users.get(user).equals(password)
                ? List.of(Authorities.DELETE, Authorities.WRITE, Authorities.READ)
                : Collections.emptyList();
    }

    public void addUser(String name, String password) {
        users.put(name, password);
    }
}
