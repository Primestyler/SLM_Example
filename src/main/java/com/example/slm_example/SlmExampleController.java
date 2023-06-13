package com.example.slm_example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @RequestMapping("/api/hamming")
    public int calculateHammingWeight(@RequestParam String inputString) {
        if (inputString.isEmpty()) {
            previousString = null;
            return 0;
        } else {
            int weight = 0;
            for (int i = 0; i < inputString.length(); i++) {
                char symbol = inputString.charAt(i);
                if (symbol != '0') {
                    weight++;
                }
            }
            previousString = inputString;
            return weight;
        }
    }
}
