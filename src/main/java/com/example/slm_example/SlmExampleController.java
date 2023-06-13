package com.example.slm_example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SlmExampleController {
    private String previousString;

    @RequestMapping("/api/hamming/previous")
    public int getPreviousString() {
        if (previousString != null) {
            return Integer.parseInt(previousString);
        } else {
            return 0;
        }
    }

}
