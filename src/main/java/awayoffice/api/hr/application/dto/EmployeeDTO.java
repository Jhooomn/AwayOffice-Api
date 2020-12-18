package awayoffice.api.hr.application.dto;

import awayoffice.api.hr.domain.model.PersonStatus;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

@Data
public class EmployeeDTO extends RepresentationModel<EmployeeDTO> {
    Long id;
    String full_name;
    PersonStatus status;
    String department;
    String home_address;
    String phone_number;
    String email_address;
}
