package info.wilian.ey_dy_calculator.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculator")
public class YieldController {

    @GetMapping("/earn-yield")
    public String earnYield() {
        return new String("hello wold");
    }
    
}
