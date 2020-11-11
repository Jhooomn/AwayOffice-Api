/**
 * @author  Muhammad Zubair
 * @version 1.0
 */

package awayoffice.api.auth.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JwtResponseDTO {
    private String accessToken;
    private final String tokenType = "Bearer";
}
