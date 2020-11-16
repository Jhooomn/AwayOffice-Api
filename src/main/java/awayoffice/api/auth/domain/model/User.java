/**
 * @author  Muhammad Zubair
 * @version 1.0
 */

package awayoffice.api.auth.domain.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
  @Id private String username;

  @NotEmpty private String password;

  @NotEmpty @Enumerated(EnumType.STRING) private UserRole role;
}
