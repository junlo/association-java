package com.bjike.entity.msg;

import com.bjike.type.msg.MsgType;

/**
 * @Author: [liguiqin]
 * @Date: [2017-09-07 11:35]
 * @Description: [ ]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public class MessageRead {
    /**
     * 消息标题
     */
    private String title;
    /**
     * 发送内容
     */
    private String content;

    /**
     * 发送人姓名，无需初始化，默认当前用户
     */
    private String senderName;

    /**
     * 发送时间，无需初始化，默认当前时间
     */
    private String createTime;

    /**
     * 消息类型
     */
    private MsgType msgType;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public MsgType getMsgType() {
        return msgType;
    }

    public void setMsgType(MsgType msgType) {
        this.msgType = msgType;
    }
}
