# FeignClientWithSpringBoot demo by https://www.sagarandcompany.com/


# How to interact two micro services??.


# There are two application 
 Feign Rest client implemented in application 1 to access appliaction 2
 
 application 1: end point
 
http://localhost:8090/app1/employee/save

If you hit this url... internaly the employee is going to application_2 end point(http://localhost:8090/app2/employee/save) to save.


# How to register feign client.

Here is the rest client for feign.
<pre><code>
@Headers("Content-Type: application/json")
@FeignClient(name = "${feign.name}", url = "${feign.url}")
public interface RestClientService {
    @RequestMapping(value = "/app2/employee/save", method = RequestMethod.POST)
    Employee save(@RequestBody Employee employee);
}
</code></pre>


# How to enable feign client
there is one annotation to enable feign client.
@EnableFeignClients


