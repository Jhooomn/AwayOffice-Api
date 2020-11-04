/**
 * @author  ABDUL WAHAB
 * @version 1.0
 * @see awayoffice.api.inventory
 */

package awayoffice.api.inventory.rest;
import awayoffice.api.inventory.application.dto.AssetModelDTO;
import awayoffice.api.inventory.application.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/inventory")
public class AssetRestController {

    @Autowired
    InventoryService inventoryService;

    @GetMapping("/assetmodel/{id}")
    public  ResponseEntity<AssetModelDTO> getAssetModelById(@PathVariable("id") Long id) throws Exception {
        AssetModelDTO assetModelDTO = inventoryService.getAssetModelById(id);
        if(assetModelDTO == null){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "entity not found");
            }
        return new ResponseEntity<>(assetModelDTO, HttpStatus.OK);
    }
}
