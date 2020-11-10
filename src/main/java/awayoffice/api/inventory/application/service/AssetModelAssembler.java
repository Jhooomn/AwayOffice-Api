/**
 * @author  ABDUL WAHAB
 * @version 1.0
 * @see awayoffice.api.inventory.domain.model.AssetModel
 */

package awayoffice.api.inventory.application.service;

import awayoffice.api.inventory.application.dto.AssetModelDTO;
import awayoffice.api.inventory.domain.model.AssetModel;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Service;

@Service
public class AssetModelAssembler extends RepresentationModelAssemblerSupport<AssetModel, AssetModelDTO> {
    public AssetModelAssembler() {super(InventoryService.class, AssetModelDTO.class);}
    @Override
    public AssetModelDTO toModel(AssetModel entity) {
        AssetModelDTO dto = createModelWithId(entity.getId(),entity);
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setModel(entity.getModel());
        dto.setManufacturer(entity.getManufacturer());

        return dto;
    }
}
