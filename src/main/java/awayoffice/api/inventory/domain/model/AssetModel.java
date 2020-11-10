/**
 * @author  ABDUL WAHAB
 * @version 1.0
 * @see awayoffice.api.inventory.domain.model.AssetModel
 */

package awayoffice.api.inventory.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class AssetModel {

  @Id @GeneratedValue Long id;

  String name;

  String description;

  String model;

  String manufacturer;
}
