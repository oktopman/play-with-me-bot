package com.oktop.bot;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bot")
@RequiredArgsConstructor
public class BotController {

    private final NoticeService noticeService;

    @PostMapping("/call")
    public String testBot() {
        Notice notice = new Notice();
        notice.setText("Hello World !");
        noticeService.notice(notice);
        return "success";
    }
}
