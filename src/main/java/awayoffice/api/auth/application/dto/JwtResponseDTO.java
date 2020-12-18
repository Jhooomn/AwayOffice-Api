/**
 * @author  Muhammad Zubair
 * @version 1.0
 */

package awayoffice.api.auth.application.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JwtResponseDTO implements Serializable{
  /**
   *
   */
  private static final long serialVersionUID = 2213185599110607120L;
  private String accessToken;
  private final String tokenType = "Bearer";
}
