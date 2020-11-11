/**
 * @author  Muhammad Zubair
 * @version 1.0
 */

package awayoffice.api.auth.application.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class JwtRequestDTO {
    private String username;
    private String password;
}
