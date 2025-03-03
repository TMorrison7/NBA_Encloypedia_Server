//package EncyclopediaApi.config;
//
//import EncyclopediaApi.model.User;
//import EncyclopediaApi.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//
//import java.util.Optional;
//
//@Component
//public class Auth implements AuthenticationProvider
//{
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @Override
//    public Authentication authenticate(Authentication authentication)
//            throws AuthenticationException {
//        String email = authentication.getName();
//        String pwd = authentication.getCredentials().toString();
//        Optional<User> user = userRepository.findByEmail(email);
//        if(!user.isEmpty() && user.get().getId()>0 &&
//                passwordEncoder.matches(pwd,user.get().getPassword())){
//            return new UsernamePasswordAuthenticationToken(
//                    user.get().getEmail(), null, null);
//        }else{
//            throw new BadCredentialsException("Invalid credentials!");
//        }
//    }
//
//    @Override
//    public boolean supports(Class<?> authentication) {
//        return authentication.equals(UsernamePasswordAuthenticationToken.class);
//    }
//}