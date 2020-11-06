/**
 * @author  ABDUL WAHAB
 * @version 1.0
 * @see awayoffice.api.inventory
 */
package awayoffice.api.inventory.application.service;

import awayoffice.api.hr.application.dto.EmployeeDTO;
import awayoffice.api.hr.domain.model.Employee;
import awayoffice.api.inventory.application.dto.AssetModelDTO;
import awayoffice.api.inventory.domain.model.AssetModel;
import awayoffice.api.inventory.domain.repository.AssetModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    AssetModelRepository assetModelRepository;

    @Autowired
    AssetModelAssembler assetModelAssembler;

    public AssetModelDTO getAssetModelById(Long id){
        AssetModel assetModel = assetModelRepository.findById(id).orElse(null);
        if(assetModel != null){
            return assetModelAssembler.toModel(assetModel);
            }
        return null;
    }

    public CollectionModel<AssetModelDTO> getAllAssetModels() throws Exception{
        List<AssetModel> assetModels = assetModelRepository.findAll();

        if(assetModels.size() <= 0){
            return null;
        }
        return assetModelAssembler.toCollectionModel(assetModels);
    }


}
