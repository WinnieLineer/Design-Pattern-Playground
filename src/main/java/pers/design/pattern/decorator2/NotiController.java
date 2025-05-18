package pers.design.pattern.decorator2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notify")
public class NotiController {

    private final NotiService notiService;

    @Autowired
    public NotiController(NotiService notiService) {
        this.notiService = notiService;
    }

    @PostMapping
    public ResponseEntity<String> notify(@RequestBody String message) {
        notiService.send(message);
        return ResponseEntity.ok("Notification sent");
    }
}

