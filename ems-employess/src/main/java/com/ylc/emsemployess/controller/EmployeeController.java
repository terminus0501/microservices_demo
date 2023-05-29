package com.ylc.emsemployess.controller;

import com.ylc.Employee;
import com.ylc.emsemployess.fegin.DepartmentClient;
import com.ylc.emsemployess.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Employee)表控制层
 *
 * @author makejava
 * @since 2022-01-03 16:34:25
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    /**
     * 服务对象
     */
    @Resource
    private EmployeeService employeeService;


    @Autowired
    DepartmentClient departmentClient;


    //员工列表
    @GetMapping
    public List<Employee> employees() {
        return employeeService.queryAll();
    }


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/{id}")
    public ResponseEntity<Employee> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(employeeService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param employee 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Employee> add(Employee employee) {
        return ResponseEntity.ok(this.employeeService.insert(employee));
    }

    /**
     * 编辑数据
     *
     * @param employee 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Employee> edit(Employee employee) {
        return ResponseEntity.ok(this.employeeService.update(employee));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.employeeService.deleteById(id));
    }

}

