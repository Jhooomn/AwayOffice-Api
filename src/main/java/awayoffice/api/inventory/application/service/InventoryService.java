/**
 * @author  ABDUL WAHAB
 * @version 1.0
 * @see awayoffice.api.inventory
 */
package awayoffice.api.inventory.application.service;

import awayoffice.api.inventory.application.dto.AssetModelDTO;
import awayoffice.api.inventory.domain.model.AssetModel;
import awayoffice.api.inventory.domain.repository.AssetModelRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

  @Autowired AssetModelRepository assetModelRepository;

  @Autowired AssetModelAssembler assetModelAssembler;

  //========[AssetModel]========
  //@Author: Abdul
  // Read [AssetModel-01]
  public AssetModelDTO getAssetModelById(Long id) {
    AssetModel assetModel = assetModelRepository.findById(id).orElse(null);
    if (assetModel != null) {
      return assetModelAssembler.toModel(assetModel);
    } else {
      return null;
    }
  }
  //========[AssetModel]========
  //@Author: Abdul
  // Read [AssetModel-02]
  public CollectionModel<AssetModelDTO> getAllAssetModels() throws Exception {
    List<AssetModel> assetModels = assetModelRepository.findAll();
    if (assetModels.size() <= 0) {
      return null;
    } else {
      return assetModelAssembler.toCollectionModel(assetModels);
    }
  }

  //========[AssetModel]========
  //@Author: Abdul
  // Create [AssetModel-01]
  public AssetModelDTO createAssetModel(AssetModelDTO assetModelDTO)
      throws Exception {
    AssetModel assetModel = new AssetModel();
    assetModel.setName(assetModelDTO.getName());
    assetModel.setModel(assetModelDTO.getModel());
    assetModel.setManufacturer(assetModelDTO.getManufacturer());
    assetModelRepository.save(assetModel);
    return assetModelAssembler.toModel(assetModel);
  }

  //========[AssetModel]========
  //@Author: Abdul
  // Update [AssetModel-01]
  public AssetModelDTO updateAssetModel(AssetModelDTO assetModelDTO)
      throws Exception {
    AssetModel assetModel =
        assetModelRepository.findById(assetModelDTO.getId()).orElse(null);
    if (assetModel != null) {
      assetModel.setName(assetModelDTO.getName());
      assetModel.setModel(assetModelDTO.getModel());
      assetModel.setManufacturer(assetModelDTO.getManufacturer());
      assetModelRepository.save(assetModel);
      return assetModelAssembler.toModel(assetModel);
    } else {
      return null;
    }
  }
  //========[AssetModel]========
  //@Author: Abdul
  // Delete [AssetModel-01]
  public AssetModelDTO deleteAssetModel(Long id) throws Exception {
    AssetModel assetModel = assetModelRepository.findById(id).orElse(null);
    if (assetModel != null) {
      assetModelRepository.deleteById(id);
      return assetModelAssembler.toModel(assetModel);
    } else {
      return null;
    }
  }
}
