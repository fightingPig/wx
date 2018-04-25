package com.zs.entity;

import java.util.Date;
import lombok.Data;

@Data
public class BaseUser {
    private String id;

    private String userName;

    private String password;

    private String email;

    private String phone;

    private Integer sex;

    private String ip;

    private Date creationTime;
}