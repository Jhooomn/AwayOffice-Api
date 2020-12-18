package awayoffice.api.hr.application.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.springframework.hateoas.RepresentationModel;

@Data
@EqualsAndHashCode
public class VendorDTO extends RepresentationModel<VendorDTO> {
    Long id;
    String name;
    String address;
    String email;
}
