/**
 * @author  Muhammad Zubair
 * @version 1.0
 */

package awayoffice.api.auth.application.service;

import awayoffice.api.auth.application.dto.UserDTO;
import awayoffice.api.auth.domain.model.User;
import awayoffice.api.auth.domain.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserAuthDetailsService implements UserDetailsService {

  private final UserRepository userRepository;

  public UserAuthDetailsService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public UserDTO loadUserByUsername(String s) throws UsernameNotFoundException {
    User user = userRepository.findByUsername(s).orElseThrow(
        ()
            -> new UsernameNotFoundException("Username" + s +
                                             "Not Found in DB"));
    return UserDTO.create(user);
  }
}
