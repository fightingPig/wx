package com.zs.entity;

import lombok.Data;

@Data
public class BaseFamily {
    private String id;

    private String orderId;

    private String name;

    private String english;

    private String description;

    private Integer displayOrder;
}