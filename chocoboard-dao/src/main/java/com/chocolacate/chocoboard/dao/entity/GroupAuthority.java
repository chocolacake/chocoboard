package com.chocolacate.chocoboard.dao.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class GroupAuthority implements Serializable {
    private static final long serialVersionUID = 7003263401235352248L;

    private Integer id;

    private Integer groupId;

    private Integer datasourceId;

    private Integer authorityType;

    private String creator;

    private Date createTime;
}
