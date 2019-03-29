package org.redrock.demo.entity;

import java.util.List;

public class MessageEntity {
    private int id;
    private String username;
    private String text;
    private int pid;
    private List<MessageEntity> childContent;

    public MessageEntity() {
    }

    public MessageEntity(String username, String text, int pid) {
        this.username = username;
        this.text = text;
        this.pid = pid;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getText() {
        return text;
    }

    public void setChildContent(List<MessageEntity> childList) {
        this.childContent = childList;
    }

    public List<MessageEntity> getChildContent() {
        return childContent;
    }

    public int getPid() {
        return pid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
