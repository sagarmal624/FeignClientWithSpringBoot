package com.sagarandcompany.application_1;

import feign.Headers;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Headers("Content-Type: application/json")
@FeignClient(name = "${feign.name}", url = "${feign.url}")
public interface RestClientService {
    @RequestMapping(value = "/app2/employee/save", method = RequestMethod.POST)
    Employee save(@RequestBody Employee employee);
}
