/**
 * @author  Muhammad Zubair
 * @version 1.0
 */

package awayoffice.api.auth.application.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class JwtRequestDTO implements Serializable{
  /**
   *
   */
  private static final long serialVersionUID = -1191158754278023215L;
  private String username;
  private String password;
}
