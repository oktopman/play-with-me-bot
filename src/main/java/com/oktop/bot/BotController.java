package com.oktop.bot;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/bot")
@RequiredArgsConstructor
public class BotController {

    private final NoticeService noticeService;

    @PostMapping("/webhook")
    public String webhook() {
        Notice notice = new Notice();
        notice.setText("Hello World !");
        noticeService.notice(notice);
        return "success";
    }

    @PostMapping("event")
    public String interactivity(@RequestBody Map<String, Object> event) {
        System.out.println(event.toString());
        String challenge = (String) event.get("challenge");
        return challenge;
    }
}
