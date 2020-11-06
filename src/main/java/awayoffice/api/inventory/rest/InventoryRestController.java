/**
 * @author  ABDUL WAHAB
 * @version 1.0
 * @see awayoffice.api.inventory
 */

package awayoffice.api.inventory.rest;
import awayoffice.api.inventory.application.dto.AssetModelDTO;
import awayoffice.api.inventory.application.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class InventoryRestController {

    @Autowired
    InventoryService inventoryService;

    @GetMapping("/assetmodel")
    public  ResponseEntity<CollectionModel<AssetModelDTO>> getAllAssetModels() throws Exception {
        CollectionModel<AssetModelDTO> assetModelDTOs = inventoryService.getAllAssetModels();
        if(assetModelDTOs == null){ throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No Asset Models Found"); }
        else{ return new ResponseEntity<>(assetModelDTOs, HttpStatus.OK); }
    }


        @GetMapping("/assetmodel/{id}")
    public  ResponseEntity<AssetModelDTO> getAssetModelById(@PathVariable("id") Long id) throws Exception {
        AssetModelDTO assetModelDTO = inventoryService.getAssetModelById(id);
        if(assetModelDTO == null){ throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Asset Model not found"); }
        return new ResponseEntity<>(assetModelDTO, HttpStatus.OK);

//        try {
//            AssetModelDTO assetModelDTO = inventoryService.getAssetModelById(id);
//            if(assetModelDTO == null){
//                System.out.println("its null");
//                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "entity not found");
//            }
//            else{
//            return new ResponseEntity<>(assetModelDTO, HttpStatus.OK);}}
//        catch(Exception exc){
//            throw new ResponseStatusException(
//                    HttpStatus.INTERNAL_SERVER_ERROR, exc.getMessage(), exc);
//            }
    }

}
