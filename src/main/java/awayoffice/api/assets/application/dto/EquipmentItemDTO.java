package awayoffice.api.assets.application.dto;

import awayoffice.api.assets.domain.model.EquipmentCondition;
import awayoffice.api.assets.domain.model.EquipmentEntry;
import lombok.Data;


@Data
public class EquipmentItemDTO {

    Long id;
    String serialNumber;
    EquipmentCondition equipmentCondition;
    EquipmentEntry equimentInfo;



}
