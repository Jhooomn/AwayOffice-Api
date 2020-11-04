/**
 * @author  ABDUL WAHAB
 * @version 1.0
 * @see awayoffice.api.inventory.domain.model.AssetItem
 */

package awayoffice.api.inventory.domain.model;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
@Entity
@Data
@NoArgsConstructor(force=true,access= AccessLevel.PROTECTED)
@AllArgsConstructor(staticName="of")
public class AssetItem {

    @Id
    @GeneratedValue
    Long id;

    String serialNumber;

    @Enumerated(EnumType.STRING)
    ItemCondition itemCondition;

    @ManyToOne
    AssetModel assetModel;

}
