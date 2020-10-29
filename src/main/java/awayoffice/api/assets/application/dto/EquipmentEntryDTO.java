package awayoffice.api.assets.application.dto;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

@Data
public class EquipmentEntryDTO extends RepresentationModel<EquipmentEntryDTO> {
    Long _id;
    String name;
    String description;
    String model;
    String manafacturer;
}
