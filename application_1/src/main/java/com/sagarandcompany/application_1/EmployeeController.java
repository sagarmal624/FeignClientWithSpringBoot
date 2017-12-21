package com.sagarandcompany.application_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/app1")
@Controller
public class EmployeeController {
    @Autowired
    RestClientService restClientService;

    @RequestMapping(value = "/employee/save", method = RequestMethod.GET)
    @ResponseBody
    public Employee save() {
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("Fortran");
        employee.setEmail("sagar@gmail.com");
        employee.setPassword("sagar");
        return restClientService.save(employee);
    }
}
