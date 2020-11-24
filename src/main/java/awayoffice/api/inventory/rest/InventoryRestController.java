/**
 * @author  ABDUL WAHAB
 * @version 1.0
 * @see awayoffice.api.inventory
 */

package awayoffice.api.inventory.rest;
import awayoffice.api.hr.application.dto.VendorDTO;
import awayoffice.api.inventory.application.dto.AssetModelDTO;
import awayoffice.api.inventory.application.service.InventoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/inventory")
public class InventoryRestController {

  @Autowired InventoryService inventoryService;

  //========[AssetModel]========
  //@Author: Abdul
  // Read [AssetModel-01]
  @CrossOrigin(origins="http://localhost:3000")
  @GetMapping("/assetmodels")
  public ResponseEntity<CollectionModel<AssetModelDTO>> getAllAssetModels()
      throws Exception {
    CollectionModel<AssetModelDTO> assetModelDTOs =
        inventoryService.getAllAssetModels();
    if (assetModelDTOs == null) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                                        "No  Asset Models Found");
    } else {
      return new ResponseEntity<>(assetModelDTOs, HttpStatus.OK);
    }
  }

  //========[AssetModel]========
  //@Author: Abdul
  // Read [AssetModel-02]
  @GetMapping("/assetmodel/{id}")
  public ResponseEntity<AssetModelDTO>
  getAssetModelById(@PathVariable("id") Long id) throws Exception {
    AssetModelDTO assetModelDTO = inventoryService.getAssetModelById(id);
    if (assetModelDTO == null) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                                        "Asset Model not found");
    } else {
      return new ResponseEntity<>(assetModelDTO, HttpStatus.OK);
    }
  }

  //========[AssetModel]========
  //@Author: Abdul
  // Create [AssetModel-01]
  @PostMapping("/assetmodel")
  public ResponseEntity<AssetModelDTO>
  createAssetModel(@RequestBody AssetModelDTO assetModelDTO) throws Exception {
    AssetModelDTO dto = inventoryService.createAssetModel(assetModelDTO);
    return new ResponseEntity<>(dto, HttpStatus.CREATED);
  }

  //========[AssetModel]========
  //@Author: Abdul
  // Update [AssetModel-01]
  @PutMapping("/assetmodel")
  public ResponseEntity<AssetModelDTO>
  updateAssetModel(@RequestBody AssetModelDTO assetModelDTO) throws Exception {
    AssetModelDTO dto = inventoryService.updateAssetModel(assetModelDTO);
    if (dto == null) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                                        "Asset Model to be updated not found");
    } else {
      return new ResponseEntity<>(dto, HttpStatus.OK);
    }
  }

  //========[AssetModel]========
  //@Author: Abdul
  // Delete [AssetModel-01]
  @DeleteMapping("/assetmodel/{id}")
  public ResponseEntity<AssetModelDTO>
  deleteAssetModel(@PathVariable("id") Long id) throws Exception {
    AssetModelDTO dto = inventoryService.deleteAssetModel(id);
    if (dto == null) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                                        "Asset Model to be deleted not found");
    } else {
      return new ResponseEntity<>(dto, HttpStatus.OK);
    }
  }
}
