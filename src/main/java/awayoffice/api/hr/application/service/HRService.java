package awayoffice.api.hr.application.service;

import awayoffice.api.hr.application.dto.EmployeeDTO;
import awayoffice.api.hr.domain.model.Employee;
import awayoffice.api.hr.domain.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HRService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EmployeeAssembler employeeAssembler;

    //========[Employee]========

    //Read [Emp-01]
    public EmployeeDTO getEmployeeById(Long id) throws Exception{
        Employee employee = employeeRepository.findById(id).orElse(null);
        if(employee == null){
            throw new Exception();
        }
        return employeeAssembler.toModel(employee);
    }
}
