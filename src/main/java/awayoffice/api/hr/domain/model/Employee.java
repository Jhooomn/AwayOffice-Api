package awayoffice.api.hr.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue
    Long id;

    String full_name;

    @Enumerated(EnumType.STRING)
    PersonStatus status;

    //@Enumerated(EnumType.STRING)
    //String role;

    String department;

    String home_address;

    String phone_number;

    String email_address;
}
