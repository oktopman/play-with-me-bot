package com.oktop.bot;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/bot")
@RequiredArgsConstructor
public class BotController {

    private final NoticeService noticeService;
//    private final WeatherService weatherService;

    @PostMapping("/webhook")
    public String webhook() {
        Notice notice = new Notice();
        notice.setText("Hello World !");
        noticeService.notice(notice);
        return "success";
    }

    @PostMapping("/event")
    public void interactivity(@RequestBody EventVo vo) {
        String text = (String) vo.getEvent().get("text");
        if (text.contains("날씨")) {
//            weatherService.send(vo);
        }
    }
}
