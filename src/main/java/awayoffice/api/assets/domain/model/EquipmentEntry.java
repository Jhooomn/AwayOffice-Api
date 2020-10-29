package awayoffice.api.assets.domain.model;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class EquipmentEntry {

    @Id
    @GeneratedValue
    Long id;

    String name;

    String description;

    String model;

    String manafacturer;

}
