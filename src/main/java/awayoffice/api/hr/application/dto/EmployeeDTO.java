package awayoffice.api.hr.application.dto;

import awayoffice.api.hr.domain.model.PersonStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

import org.springframework.hateoas.RepresentationModel;

@Data
@EqualsAndHashCode
public class EmployeeDTO extends RepresentationModel<EmployeeDTO> {
    Long id;
    String full_name;
    PersonStatus status;
    String department;
    String home_address;
    String phone_number;
    String email_address;
}
