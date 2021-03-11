package com.chocolacate.chocoboard.dao.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserGroup implements Serializable {
    private static final long serialVersionUID = -5338066702499052611L;

    private Integer id;
    private Integer groupId;
    private Integer userId;

    private String creator;
    private Date createTime;
}
