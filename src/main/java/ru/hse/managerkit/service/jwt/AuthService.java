package ru.hse.managerkit.service.jwt;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.hse.managerkit.model.User;
import ru.hse.managerkit.model.enums.RoleEnum;
import ru.hse.managerkit.repository.RoleRepository;
import ru.hse.managerkit.service.UserService;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserService userService;
    private final JwtProvider jwtProvider;
    private final PasswordEncoder passwordEncoder;
    private final RoleRepository roleRepository;

    public void signIn(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(Collections.singletonList(roleRepository.findByName(RoleEnum.USER)));
        userService.create(user);
    }

    public String login(String login, String password) {
        User user = userService.findByUsername(login);
        if (passwordEncoder.matches(password, user.getPassword())) {
            return jwtProvider.generateToken(login);
        } else {
            throw new UsernameNotFoundException("Not auth");
        }
    }
}
