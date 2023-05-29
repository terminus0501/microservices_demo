package com.ylc.emsdepartments.feign;

import com.ylc.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("EMPLOYEES")
public interface EmployeeClient {

    @GetMapping("/employees/{id}")
    ResponseEntity<Employee> queryById(@PathVariable("id") String id);
}
