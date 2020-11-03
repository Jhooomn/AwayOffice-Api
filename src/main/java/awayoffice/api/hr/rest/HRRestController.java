package awayoffice.api.hr.rest;

import awayoffice.api.hr.application.dto.EmployeeDTO;
import awayoffice.api.hr.application.service.HRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hr")
public class HRRestController {

    @Autowired
    HRService hrService;

    //========[Employee]========

    //Read [Emp-01]
    @GetMapping("/employee/{id}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable("id") Long id) throws Exception{
        EmployeeDTO employeeDTO = hrService.getEmployeeById(id);

        return new ResponseEntity<>(employeeDTO, HttpStatus.OK);
    }
}
