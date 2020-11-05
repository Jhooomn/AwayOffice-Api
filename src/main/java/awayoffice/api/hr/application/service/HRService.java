package awayoffice.api.hr.application.service;

import awayoffice.api.hr.application.dto.EmployeeDTO;
import awayoffice.api.hr.application.dto.VendorDTO;
import awayoffice.api.hr.domain.model.Employee;
import awayoffice.api.hr.domain.model.Vendor;
import awayoffice.api.hr.domain.repository.EmployeeRepository;
import awayoffice.api.hr.domain.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HRService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EmployeeAssembler employeeAssembler;

    @Autowired
    VendorRepository vendorRepository;

    @Autowired
    VendorAssembler vendorAssembler;

    //========[Employee]========
    //@Author: Zubair
    //Read [Emp-01]
    public EmployeeDTO getEmployeeById(Long id) throws Exception{
        Employee employee = employeeRepository.findById(id).orElse(null);
        if(employee == null){
            throw new Exception();
        }
        return employeeAssembler.toModel(employee);
    }

    //@Author: Zubair
    //Read [Emp-02]
    public CollectionModel<EmployeeDTO> getAllEmployees() throws Exception{
        List<Employee> employees = employeeRepository.findAll();
        if(employees.size() <= 0){
            throw new Exception();
        }
        return employeeAssembler.toCollectionModel(employees);
    }

    //@Author: Zubair
    //Create [Emp-01]
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) throws Exception{

        Employee employee = new Employee();
        employee.setDepartment(employeeDTO.getDepartment());
        employee.setEmail_address(employeeDTO.getEmail_address());
        employee.setFull_name(employeeDTO.getFull_name());
        employee.setHome_address(employeeDTO.getHome_address());
        employee.setPhone_number(employeeDTO.getPhone_number());
        employee.setStatus(employeeDTO.getStatus());

        employeeRepository.save(employee);
        return employeeAssembler.toModel(employee);
    }

    //@Author: Zubair
    //Update [Emp-01]
    public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO) throws Exception{

        Employee emp = employeeRepository.findById(employeeDTO.getId()).orElse(null);
        if (emp == null){
            throw new Exception();
        }

        Employee employee = new Employee();
        employee.setId(employeeDTO.getId());
        employee.setDepartment(employeeDTO.getDepartment());
        employee.setEmail_address(employeeDTO.getEmail_address());
        employee.setFull_name(employeeDTO.getFull_name());
        employee.setHome_address(employeeDTO.getHome_address());
        employee.setPhone_number(employeeDTO.getPhone_number());
        employee.setStatus(employeeDTO.getStatus());

        employeeRepository.save(employee);
        return employeeAssembler.toModel(employee);
    }

    //@Author: Zubair
    //Delete [Emp-01]
    public EmployeeDTO deleteEmployee(Long id) throws Exception{
        Employee emp = employeeRepository.findById(id).orElse(null);
        if (emp == null){
            throw new Exception();
        }

        employeeRepository.deleteById(emp.getId());
        return employeeAssembler.toModel(emp);
    }

    //========[Vendor]========
    //@Author: Mirlind
    //Read [Vendor-01]
    public VendorDTO getVendorById(Long id) throws Exception {
        Vendor vendor =  vendorRepository.findById(id).orElse(null);

        if(vendor == null) {
            throw new Exception();
        }

        return vendorAssembler.toModel(vendor);
    }

}
