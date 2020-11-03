package awayoffice.api.hr.application.service;

import awayoffice.api.hr.application.dto.EmployeeDTO;
import awayoffice.api.hr.domain.model.Employee;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Service;

@Service
public class EmployeeAssembler  extends RepresentationModelAssemblerSupport<Employee, EmployeeDTO> {
    public EmployeeAssembler(){
        super(HRService.class, EmployeeDTO.class);
    }

    @Override
    public EmployeeDTO toModel(Employee entity) {
        EmployeeDTO dto = createModelWithId(entity.getId(),entity);

        dto.setId(entity.getId());
        dto.setDepartment(entity.getDepartment());
        dto.setEmail_address(entity.getEmail_address());
        dto.setFull_name(entity.getFull_name());
        dto.setHome_address(entity.getHome_address());
        dto.setPhone_number(entity.getPhone_number());
        dto.setStatus(entity.getStatus());

        return dto;
    }
}
