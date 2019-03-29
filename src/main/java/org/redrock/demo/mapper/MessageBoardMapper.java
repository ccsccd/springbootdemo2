package org.redrock.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.redrock.demo.entity.MessageEntity;

import java.util.List;

@Mapper
public interface MessageBoardMapper {
    @Insert("insert into message_board(username,text,pid) value (#{username},#{text},#{pid})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    void insertMessage(MessageEntity entity);

    @Select("select * from message_board where pid = #{pid}")
    List<MessageEntity> findMessagesByPid(int pid);
}
