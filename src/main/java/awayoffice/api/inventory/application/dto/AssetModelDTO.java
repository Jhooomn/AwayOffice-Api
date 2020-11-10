/**
 * @author  ABDUL WAHAB
 * @version 1.0
 * @see awayoffice.api.inventory.domain.model.AssetModel
 */


package awayoffice.api.inventory.application.dto;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

@Data
public class AssetModelDTO extends RepresentationModel<AssetModelDTO> {
    Long id;
    String name;
    String model;
    String manufacturer;

}
