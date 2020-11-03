package awayoffice.api.hr.domain.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Vendor {

    @Id
    @GeneratedValue
    Long id;

    String name;

    String address;

    String email;
}
