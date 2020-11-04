package awayoffice.api.hr.application.service;

import awayoffice.api.hr.application.dto.VendorDTO;
import awayoffice.api.hr.domain.model.Vendor;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Service;

@Service
public class VendorAssembler extends RepresentationModelAssemblerSupport<Vendor, VendorDTO> {
    public VendorAssembler(){
        super(HRService.class, VendorDTO.class);
    }

    @Override
    public VendorDTO toModel(Vendor entity) {
        VendorDTO dto = createModelWithId(entity.getId(),entity);

        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setAddress(entity.getAddress());
        dto.setEmail(entity.getEmail());

        return dto;
    }
}
