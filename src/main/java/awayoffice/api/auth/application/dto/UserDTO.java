/**
 * @author  Muhammad Zubair
 * @version 1.0
 */

package awayoffice.api.auth.application.dto;

import awayoffice.api.auth.domain.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserDTO implements UserDetails {

    private String username;
    private String password;

    public UserDTO(String email, String password, Collection<? extends GrantedAuthority> authorities){
        this.username=email;
        this.password=password;
        this.authorities = authorities;
    }

    private Collection<? extends GrantedAuthority> authorities;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
        return authorities;
    }

    @Override
    public String getPassword(){
        return password;
    }

    @Override
    public String getUsername(){
        return username;
    }

    @Override
    public boolean isAccountNonExpired(){
        return true;
    }

    @Override
    public boolean isAccountNonLocked(){
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired(){
        return true;
    }

    @Override
    public boolean isEnabled(){
        return true;
    }

    public static UserDTO create(User user){
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(user.getRole().toString()));
        return new UserDTO(user.getUsername(),user.getPassword(), authorities);
    }
}
