package com.example.back.v1.domain.model;

import lombok.Data;
//import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {

    private String tenantId;
    private String subIssHash;
    private String userId;
//    private Date lastLogin;
//    private Integer version;
//    private Date lastUpdate;

}
