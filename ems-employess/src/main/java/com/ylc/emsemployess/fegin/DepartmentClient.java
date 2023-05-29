package com.ylc.emsemployess.fegin;



import com.ylc.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("DEPARTMENTS")
public interface DepartmentClient {

    //部门详细
    @GetMapping("/department/{id}")
     Department detail(@PathVariable("id") Integer id);
}
