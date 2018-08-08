package br.com.helpdesk.api.security.jwt;

import br.com.helpdesk.api.security.entity.User;
import br.com.helpdesk.api.security.enums.ProfileEnun;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;

public class JwtUserFactory {

    private JwtUserFactory(){

    }

    public static JwtUser create(User user){
        return new JwtUser(user.getId(), user.getEmail(), user.getPassword(), mapToGrantedAuthorities(user.getProfile()));
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(ProfileEnun profileEnun){
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority(profileEnun.toString()));
        return  authorities;
    }


}
