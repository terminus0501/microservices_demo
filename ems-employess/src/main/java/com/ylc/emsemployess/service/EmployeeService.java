package com.ylc.emsemployess.service;

import com.ylc.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * (Employee)表服务接口
 *
 * @author makejava
 * @since 2022-01-03 16:34:25
 */
@Service
public interface EmployeeService {

    /**
     *  查询员工以及部门的详细信息
     * @return List<Employee>
     */

     List<Employee> queryAll();

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */

    Employee queryById(Integer id);


    /**
     * 新增数据
     *
     * @param employee 实例对象
     * @return 实例对象
     */
    Employee insert(Employee employee);

    /**
     * 修改数据
     *
     * @param employee 实例对象
     * @return 实例对象
     */
    Employee update(Employee employee);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}
