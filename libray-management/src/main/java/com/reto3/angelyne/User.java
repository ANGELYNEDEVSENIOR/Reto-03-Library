package com.reto3.angelyne;

import java.time.LocalDate;

public class User {

    private String id;
    private String name;
    private String email;
    private LocalDate registerDate;
    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public User(String id, String name, String email, LocalDate registerDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.registerDate = registerDate;
    }
    

}
