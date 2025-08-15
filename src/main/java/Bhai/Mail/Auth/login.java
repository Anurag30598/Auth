package Bhai.Mail.Auth;

import Bhai.Mail.DTO.loginDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class login {

    @PostMapping("/login")
    public void ReqBody(@RequestBody loginDto loginDto){
        System.out.println(loginDto.getPassword());
        System.out.println(loginDto.getEmail());
    }
}
