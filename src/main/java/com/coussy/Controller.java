package com.coussy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/display/console")
public class Controller {

    @Value("${platform}")
    String platform;

    @GetMapping()
    public ResponseEntity<String> get() {
        StringBuilder sb = new StringBuilder();
        sb.append("platform: ");
        sb.append(platform);
        sb.append("\n");
        sb.append("application is running..");
        sb.append("\n");
        return ResponseEntity.ok(sb.toString());
    }

    @PutMapping()
    public ResponseEntity<String> put(@RequestBody String input) {
        StringBuilder sb = new StringBuilder();
        sb.append("platform: ");
        sb.append(platform);
        sb.append("\n");
        sb.append("your message: ");
        sb.append(input);
        sb.append("\n");
        return ResponseEntity.ok(sb.toString());
    }


}



