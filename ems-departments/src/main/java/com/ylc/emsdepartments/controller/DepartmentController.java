package com.ylc.emsdepartments.controller;

import com.ylc.Department;
import com.ylc.Employee;
import com.ylc.emsdepartments.feign.EmployeeClient;
import com.ylc.emsdepartments.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Department)表控制层
 *
 * @author makejava
 * @since 2022-01-03 18:14:47
 */
@RestController
@RequestMapping("department")
public class DepartmentController {
    /**
     * 服务对象
     */
    @Resource
    private DepartmentService departmentService;

    @Autowired
    private EmployeeClient employeeClient;

    //查看某个部门下某个员工信息
    @GetMapping("{did}/employee/{id}")
    public Department detailDepartmentAndEmployee(@PathVariable("did") Integer did, @PathVariable("id") Integer id) {
        Department department = departmentService.queryById(did);
        //根据员工id查询员工信息 调用员工服务
        ResponseEntity<Employee> employeeResponseEntity = employeeClient.queryById(String.valueOf(id));
        Employee employee = employeeResponseEntity.getBody();
        department.setEmployee(employee);
        return department;
    }


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/{id}")
    public ResponseEntity<Department> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.departmentService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param department 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Department> add(Department department) {
        return ResponseEntity.ok(this.departmentService.insert(department));
    }

    /**
     * 编辑数据
     *
     * @param department 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Department> edit(Department department) {
        return ResponseEntity.ok(this.departmentService.update(department));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.departmentService.deleteById(id));
    }

}

