package com.zs.entity;

import java.util.Date;
import lombok.Data;

@Data
public class BaseSpecies {
    private String id;

    private String userId;

    private String familyId;

    private String name;

    private String english;

    private String address;

    private Integer maxNumber;

    private Integer minNumber;

    private String weather;

    private String description;

    private Date creationTime;

    private Date modifiedTime;

    private Integer displayOrder;
}