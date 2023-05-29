package com.ylc;



import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;


/**
 * (Employee)实体类
 * @author yanglingcong
 */
public class Employee implements Serializable {
    private static final long serialVersionUID = -87055454147065054L;

    private Integer id;

    private String name;
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 工资
     */
    private String salary;
    /**
     * 部门信息
     */
    @JsonProperty("department_id")
    private Integer departmentId;

    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

}

