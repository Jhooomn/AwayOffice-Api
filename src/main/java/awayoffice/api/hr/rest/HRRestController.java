package awayoffice.api.hr.rest;

import awayoffice.api.hr.application.dto.EmployeeDTO;
import awayoffice.api.hr.application.dto.VendorDTO;
import awayoffice.api.hr.application.service.HRService;
import awayoffice.api.hr.domain.model.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hr")
public class HRRestController {

    @Autowired
    HRService hrService;

    //========[Employee]========
    //@Author: Zubair
    //Read [Emp-01]
    @GetMapping("/employee/{id}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable("id") Long id) throws Exception{
        EmployeeDTO employeeDTO = hrService.getEmployeeById(id);

        return new ResponseEntity<>(employeeDTO, HttpStatus.OK);
    }

    //@Author: Zubair
    //Read [Emp-02]
    @GetMapping("/employee")
    public CollectionModel<EmployeeDTO> getAllEmployees() throws Exception{
        return hrService.getAllEmployees();
    }

    //@Author: Zubair
    //Create [Emp-01]
    @PostMapping("/employee")
    public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO employeeDTO) throws Exception{
        EmployeeDTO dto = hrService.createEmployee(employeeDTO);

        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    //@Author: Zubair
    //Update [Emp-01]
    @PutMapping("/employee")
    public ResponseEntity<EmployeeDTO> updateEmployee(@RequestBody EmployeeDTO employeeDTO) throws Exception{
        EmployeeDTO dto = hrService.updateEmployee(employeeDTO);

        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    //@Author: Zubair
    //Delete [Emp-01]
    @DeleteMapping("/employee/{id}")
    public ResponseEntity<EmployeeDTO> deleteEmployeeById(@PathVariable("id") Long id) throws Exception{
        EmployeeDTO dto = hrService.deleteEmployee(id);

        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    //========[Vendor]========
    //@Author: Mirlind
    //Read [Vendor-01]
    @GetMapping("/vendors/{id}")
    public  ResponseEntity<VendorDTO> getVendorById(@PathVariable("id") Long id) throws Exception {
        VendorDTO vendorDTO = hrService.getVendorById(id);

        return new ResponseEntity<>(vendorDTO, HttpStatus.OK);
    }

    //@Author: Mirlind
    //Read [Vendor-02]
    @GetMapping("/vendors")
    public CollectionModel<VendorDTO> getAllVendors() throws Exception{
        return hrService.getAllVendors();
    }

    //@Author: Mirlind
    //Create [Vendor-01]
    @PostMapping("/vendors")
    public ResponseEntity<VendorDTO> createVendor(@RequestBody VendorDTO vendorDTO) throws Exception{
        VendorDTO dto = hrService.createVendor(vendorDTO);

        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    //@Author: Mirlind
    //Update [Vendor-01]
    @PutMapping("/vendors")
    public ResponseEntity<VendorDTO> updateVendor(@RequestBody VendorDTO vendorDTO) throws Exception{
        VendorDTO dto = hrService.updateVendor(vendorDTO);

        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    //@Author: Mirlind
    //Delete [Vendor-01]
    @DeleteMapping("/vendors/{id}")
    public ResponseEntity<VendorDTO> deleteVendorById(@PathVariable("id") Long id) throws Exception{
        VendorDTO dto = hrService.deleteVendor(id);

        return new ResponseEntity<>(dto, HttpStatus.OK);
    }



}
