package org.redrock.demo.service;

import org.redrock.demo.entity.MessageEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MessageBoardService {
    /**
     * 查找所有的留言
     * @return 留言的集合
     */
    List<MessageEntity> findAllMessages();

    /**
     * 插入一条留言
     * @param message 留言
     * @return 成功与否
     */
    boolean insertContent(MessageEntity message);

}
