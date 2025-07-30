package tech.lucas.sns.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.lucas.sns.dto.MessageDTO;
import tech.lucas.sns.service.SnsService;

@RestController
@RequestMapping("/sns")
public class SnsController {

    private final SnsService snsService;

    public SnsController(SnsService snsService) {
        this.snsService = snsService;
    }

    @PostMapping("/send-message")
    public ResponseEntity<Void> sendNotification(@RequestBody MessageDTO message) {
        snsService.sendNotification(message);
        return ResponseEntity.ok().build();
    }
}
