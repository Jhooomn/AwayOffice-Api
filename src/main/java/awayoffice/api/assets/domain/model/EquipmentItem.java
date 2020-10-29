package awayoffice.api.assets.domain.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor(force=true,access= AccessLevel.PROTECTED)
@AllArgsConstructor(staticName="of")
public class EquipmentItem {

    @Id
    @GeneratedValue
    Long id;

    String serialNumber;

    @Enumerated(EnumType.STRING)
    EquipmentCondition equipmentCondition;

    @ManyToOne
    EquipmentEntry equimentInfo;

}
