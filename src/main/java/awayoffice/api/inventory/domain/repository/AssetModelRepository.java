/**
 * @author  ABDUL WAHAB
 * @version 1.0
 * @see awayoffice.api.inventory.domain.model.AssetModel
 */

package awayoffice.api.inventory.domain.repository;

import awayoffice.api.inventory.domain.model.AssetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetModelRepository extends JpaRepository<AssetModel, Long> {
}
