package com.ylc.emsdepartments.service;


import com.ylc.Department;
import org.springframework.stereotype.Service;

/**
 * (Department)表服务接口
 *
 * @author makejava
 * @since 2022-01-03 18:14:47
 */
@Service
public interface DepartmentService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Department queryById(Integer id);

    /**
     * 新增数据
     *
     * @param department 实例对象
     * @return 实例对象
     */
    Department insert(Department department);

    /**
     * 修改数据
     *
     * @param department 实例对象
     * @return 实例对象
     */
    Department update(Department department);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
