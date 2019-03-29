package org.redrock.demo.service.Impl;

import org.redrock.demo.entity.MessageEntity;
import org.redrock.demo.mapper.MessageBoardMapper;
import org.redrock.demo.service.MessageBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageBoardServiceImpl implements MessageBoardService {

    @Autowired
    private MessageBoardMapper messageBoardMapper;

    private List<MessageEntity> findContentChild(MessageEntity content) {
        List<MessageEntity> list = messageBoardMapper.findMessagesByPid(content.getId());

        for (MessageEntity message : list) {
            List<MessageEntity> childList = findContentChild(message);
            message.setChildContent(childList);
        }

        return list;
    }
    @Override
    public List<MessageEntity> findAllMessages() {
        List<MessageEntity> list = messageBoardMapper.findMessagesByPid(0);

        for (MessageEntity message : list) {
            List<MessageEntity> childList = findContentChild(message);
            message.setChildContent(childList);
        }

        return list;
    }
    @Override
    public boolean insertContent(MessageEntity message) {
        if (message.getUsername() != null && message.getText() != null) {
            messageBoardMapper.insertMessage(message);
            return true;
        }
        return false;
    }
}
