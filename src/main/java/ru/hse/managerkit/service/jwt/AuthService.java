package ru.hse.managerkit.service.jwt;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.hse.managerkit.dto.UserDto;
import ru.hse.managerkit.model.User;
import ru.hse.managerkit.service.UserService;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserService userService;
    private final JwtProvider jwtProvider;
    private final PasswordEncoder passwordEncoder;

    public String signIn(UserDto userDto){
        return "";
    }

    public String login(String login, String password){
        User user = userService.findByLogin(login);
        if (user != null) {
//            if (passwordEncoder.matches(password, user.getPassword())) {
                return jwtProvider.generateToken(login);
//            }
        }
        throw new UsernameNotFoundException("Not auth");
    }
}
