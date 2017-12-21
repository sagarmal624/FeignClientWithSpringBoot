package com.sagarandcompany.application_2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/app2")
@Controller
public class EmployeeController {
    @RequestMapping(value = "/employee/save", method = RequestMethod.POST)
    @ResponseBody
    public Employee save(@RequestBody Employee employee) {
        return employee;
    }
}
