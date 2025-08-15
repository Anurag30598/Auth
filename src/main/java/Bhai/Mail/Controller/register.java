package Bhai.Mail.Controller;

import Bhai.Mail.DTO.registerDto;
import Bhai.Mail.Entity.user;
import Bhai.Mail.Repository.userRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class register {

    private final userRepository userRepository;

    public register(userRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/register")
    public void ReqBody(@RequestBody registerDto registerDto){
        user user = new user();
        System.out.println(registerDto.getPassword());
        System.out.println(registerDto.getEmail());
        System.out.println(registerDto.getName());
        user.setPassword(registerDto.getPassword());
        user.setEmail(registerDto.getEmail());
        user.setName(registerDto.getName());
        userRepository.save(user);
    }
}
