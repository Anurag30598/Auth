package Bhai.Mail.Auth;

import Bhai.Mail.DTO.registerDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class register {

    @PostMapping("/register")
    public void ReqBody(@RequestBody registerDto registerDto){
        System.out.println(registerDto.getPassword());
        System.out.println(registerDto.getEmail());
        System.out.println(registerDto.getName());
    }
}
