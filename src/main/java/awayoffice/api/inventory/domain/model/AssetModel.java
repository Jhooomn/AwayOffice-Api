/**
 * @author  ABDUL WAHAB
 * @version 1.0
 * @see awayoffice.api.inventory.domain.model.AssetModel
 */

package awayoffice.api.inventory.domain.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class AssetModel {

    @Id
    @GeneratedValue
    Long id;

    String name;

    String description;

    String model;

    String manafacturer;

}
