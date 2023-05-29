package com.ylc;

import java.io.Serializable;
import java.util.Date;


/**
 * @author yanglingcong
 * 部门类
 */
public class Department implements Serializable {
    private static final long serialVersionUID = 279210942586979318L;

    private Integer id;
    /**
     * 部门名称
     */
    private String name;
    /**
     * 创建时间
     */
    private Date createdAt;

    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

}

