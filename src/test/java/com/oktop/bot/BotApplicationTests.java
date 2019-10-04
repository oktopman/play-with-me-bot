package com.oktop.bot;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Ignore
public class BotApplicationTests {

    @Autowired
    NoticeService noticeService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void 웹훅_뚱이에게_메세지보내기_테스트() {
        Notice notice = new Notice();
        notice.setText("Hello World");
        noticeService.notice(notice);
    }

}
