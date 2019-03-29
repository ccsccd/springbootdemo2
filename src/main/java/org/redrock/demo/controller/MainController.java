package org.redrock.demo.controller;

import org.redrock.demo.entity.MessageEntity;
import org.redrock.demo.service.MessageBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * 一共两个接口
 */
@RestController
public class MainController {
    private static final String ERROR = "{\"status\":\"10001\",\"data\":\"fail!!\"}";
    private static final String OK = "{\"status\":\"10000\",\"data\":\"succeed!!\"}";
    @Autowired
    MessageBoardService messageBoardService;

    @GetMapping("/info")
    public List Login() {
        List<MessageEntity> messageList = messageBoardService.findAllMessages();
        return messageList;
    }

    @PostMapping("/send")
    public String welcome(@RequestParam("username") String username, @RequestParam("text") String text, @RequestParam("pid") int pid) {
        MessageEntity message = new MessageEntity(username, text, pid);
        String res = ERROR;
        if (messageBoardService.insertContent(message)) {
            res = OK;
        }
        return res;
    }
}
