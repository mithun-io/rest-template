package com.entity;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private String email;
    private String avatar;
    private String address;
}

