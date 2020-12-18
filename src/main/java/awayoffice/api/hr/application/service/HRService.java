package awayoffice.api.hr.application.service;

import awayoffice.api.hr.application.dto.EmployeeDTO;
import awayoffice.api.hr.application.dto.VendorDTO;
import awayoffice.api.hr.domain.model.Employee;
import awayoffice.api.hr.domain.model.Vendor;
import awayoffice.api.hr.domain.repository.EmployeeRepository;
import awayoffice.api.hr.domain.repository.VendorRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

/**
 * {@link awayoffice.api.hr.rest.HRRestController} to access {@link EmployeeRepository}
 * and {@link VendorRepository} instances.
 * @see HRService
 *
 * @author Zubair and Mirlind
 * @version 1.0
 * @since 1.0
 */
@Service
public class HRService {

  @Autowired EmployeeRepository employeeRepository;

  @Autowired EmployeeAssembler employeeAssembler;

  @Autowired VendorRepository vendorRepository;

  @Autowired VendorAssembler vendorAssembler;

  //========[Employee]========
  //@Author: Zubair
  // Read [Emp-01]
  public EmployeeDTO getEmployeeById(Long id) {
    Employee employee = employeeRepository.findById(id).orElse(null);
    if (employee == null) {
      //TODO:  create a dedicated exception.
      throw new RuntimeException("Employee does not exist");
    }
    return employeeAssembler.toModel(employee);
  }

  //@Author: Zubair
  // Read [Emp-02]
  public CollectionModel<EmployeeDTO> getAllEmployees() {
    List<Employee> employees = employeeRepository.findAll();
    if (employees.isEmpty()) {
      //TODO:  create a dedicated exception.
      throw new RuntimeException("There are not employees in db!");
    }
    return employeeAssembler.toCollectionModel(employees);
  }

  //@Author: Zubair
  // Create [Emp-01]
  public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) throws Exception {

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
  // Update [Emp-01]
  public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO) throws Exception {

    Employee emp =
        employeeRepository.findById(employeeDTO.getId()).orElse(null);
    if (emp == null) {
      //TODO:  create a dedicated exception.
      throw new RuntimeException("Employee does not exist!");  
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
  // Delete [Emp-01]
  public EmployeeDTO deleteEmployee(Long id)  {
    Employee emp = employeeRepository.findById(id).orElse(null);
    if (emp == null) {
      //TODO:  create a dedicated exception.
      throw new RuntimeException("Employee does not exist!");    
    } 

    employeeRepository.deleteById(emp.getId());
    return employeeAssembler.toModel(emp);
  }

  /**
   * this is a helper function for fetching vendors by their IDs
   * @author Mirlind Murati
   *
   * @param id - id of the VendorDTO to be fetched
   * @return VendorDTO
   * {@link VendorDTO}
   * @see VendorDTO
   * @since 1.0
   */
  public VendorDTO getVendorById(Long id) {
    Vendor vendor = vendorRepository.findById(id).orElse(null);

    if (vendor == null) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Vendor not found");
    }
    return vendorAssembler.toModel(vendor);
  }

  /**
   * this is a helper function for fetching all vendors
   * @author Mirlind Murati
   *
   * @return CollectionModel of VendorDTOs
   * {@link VendorDTO}
   * @see VendorDTO
   * @since 1.0
   */
  public CollectionModel<VendorDTO> getAllVendors() {
    List<Vendor> vendors = vendorRepository.findAll();
    if (vendors.isEmpty()) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                                        "No Vendors Available");
    }
    return vendorAssembler.toCollectionModel(vendors);
  }

  /**
   * this is a helper function for creating new vendors
   * @author Mirlind Murati
   *
   * @return VendorDTOs
   * {@link VendorDTO}
   * @see VendorDTO
   * @since 1.0
   */
  public VendorDTO createVendor(VendorDTO vendorDTO)  {
    Vendor vendor = new Vendor();

    vendor.setName(vendorDTO.getName());
    vendor.setAddress(vendorDTO.getAddress());
    vendor.setEmail(vendorDTO.getEmail());

    vendorRepository.save(vendor);
    return vendorAssembler.toModel(vendor);
  }

  /**
   * this is a helper function for updating existing vendors
   * @author Mirlind Murati
   *
   * @return VendorDTOs
   * {@link VendorDTO}
   * @see VendorDTO
   * @since 1.0
   */
  public VendorDTO updateVendor(VendorDTO vendorDTO) {
    Vendor vdr = vendorRepository.findById(vendorDTO.getId()).orElse(null);

    if (vdr == null) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                                        "Vendor not found");
    }

    Vendor vendor = new Vendor();
    vdr.setName(vendorDTO.getName());
    vdr.setAddress(vendorDTO.getAddress());
    vdr.setEmail(vendorDTO.getEmail());

    vendorRepository.save(vdr);
    return vendorAssembler.toModel(vdr);
  }

  /**
   * this is a helper function for deleting existing vendors
   * @author Mirlind Murati
   *
   * @return VendorDTOs
   * {@link VendorDTO}
   * @see VendorDTO
   * @since 1.0
   */
  public VendorDTO deleteVendor(Long id)  {
    Vendor vdr = vendorRepository.findById(id).orElse(null);

    if (vdr == null) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                                        "Vendor not found");
    }

    vendorRepository.deleteById(vdr.getId());
    return vendorAssembler.toModel(vdr);
  }
}
