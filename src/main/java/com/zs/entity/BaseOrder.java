package com.zs.entity;

import lombok.Data;

@Data
public class BaseOrder {
    private String id;

    private String classId;

    private String name;

    private String english;

    private String description;

    private Integer displayOrder;
}