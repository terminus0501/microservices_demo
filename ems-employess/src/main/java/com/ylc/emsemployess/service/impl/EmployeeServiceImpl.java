package com.ylc.emsemployess.service.impl;

import com.ylc.Department;
import com.ylc.Employee;
import com.ylc.emsemployess.dao.EmployeeDao;
import com.ylc.emsemployess.fegin.DepartmentClient;
import com.ylc.emsemployess.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * (Employee)表服务实现类
 *
 * @author makejava
 * @since 2022-01-03 16:34:25
 */
@Repository
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private EmployeeDao employeeDao;

    @Autowired
    DepartmentClient departmentClient;

    @Override
    public List<Employee> queryAll() {
        List<Employee> employees=employeeDao.queryAll();
        employees.forEach(emp->{
            Integer departmentid=emp.getDepartmentId();
            Department detail = departmentClient.detail(departmentid);
            emp.setDepartment(detail);
        });
        return employees;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Employee queryById(Integer id) {
        System.out.println("-----"+id);
        return this.employeeDao.queryById(id);
    }



    /**
     * 新增数据
     *
     * @param employee 实例对象
     * @return 实例对象
     */
    @Override
    public Employee insert(Employee employee) {
        this.employeeDao.insert(employee);
        return employee;
    }

    /**
     * 修改数据
     *
     * @param employee 实例对象
     * @return 实例对象
     */
    @Override
    public Employee update(Employee employee) {
        this.employeeDao.update(employee);
        return this.queryById(employee.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.employeeDao.deleteById(id) > 0;
    }
}
