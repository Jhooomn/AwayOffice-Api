/**
 * @author  ABDUL WAHAB
 * @version 1.0
 * @see awayoffice.api.inventory.domain.model.AssetItem
 */


package awayoffice.api.inventory.application.dto;

import awayoffice.api.inventory.domain.model.AssetModel;
import awayoffice.api.inventory.domain.model.ItemCondition;
import lombok.Data;


@Data
public class AssetItemDTO {

    Long id;
    String serialNumber;
    ItemCondition itemCondition;
    AssetModel assetModel;



}
