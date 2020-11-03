package awayoffice.api.hr.application.dto;

import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

@Data
public class VendorDTO extends RepresentationModel<VendorDTO> {
    Long id;
    String name;
    String address;
    String email;
}
