package com.bjike.to.msg;


import com.bjike.common.aspect.ADD;
import com.bjike.common.aspect.EDIT;
import com.bjike.to.BaseTO;
import com.bjike.type.msg.MsgType;
import com.bjike.type.msg.RangeType;
import com.bjike.type.msg.SendType;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 消息推送
 *
 * @Author: [liguiqin]
 * @Date: [2017-03-14 10:21]
 * @Description: [消息推送]
 * @Version: [v1.0.0]
 * @Copy: [com.bjike]
 */
public class MessageTO extends BaseTO {
    public MessageTO() {

    }

    public MessageTO(String title, String content) {
        this.title = title;
        this.content = content;
    }

    /**
     * 消息标题
     */
    @NotBlank(message = "消息标题不能为空", groups = {ADD.class, EDIT.class})
    private String title;
    /**
     * 发送内容
     */
    @NotBlank(message = "消息内容不能为空", groups = {ADD.class, EDIT.class})
    private String content;


    /**
     * 消息类型:[系统:SYS(默认),文章:ARTICLE,其他:OTHER]
     */
    @NotBlank(message = "消息类型不能为空", groups = {EDIT.class})
    private MsgType msgType;

    /**
     * 发送类型:[消息:MSG(默认),邮件:EMAIL,消息及邮件：ALL]
     */
    @NotBlank(message = "发送类型不能为空", groups = {EDIT.class})

    private SendType sendType;

    /**
     * 消息范围:[个人或多人消息:SPECIFIED(默认)，公共消息:PUB，组消息:GROUP]
     */
    @NotBlank(message = "消息范围不能为空", groups = {EDIT.class})

    private RangeType rangeType;

    /**
     * 发送人id无需初始化默认当前用户
     */
    private String senderId;
    /**
     * 发送人姓名无需初始化默认当前用户
     */
    private String senderName;

    /**
     * 发送时间无需初始化默认当前时间
     */
    private String createTime;

    /**
     * 接收人id（用户id）
     */
    private String[] receivers;

    /**
     * 接收组
     */
    private String[] groups;


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

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
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

    public SendType getSendType() {
        return sendType;
    }

    public void setSendType(SendType sendType) {
        this.sendType = sendType;
    }

    public RangeType getRangeType() {
        return rangeType;
    }

    public void setRangeType(RangeType rangeType) {
        this.rangeType = rangeType;
    }

    public String[] getReceivers() {
        return receivers;
    }

    public void setReceivers(String[] receivers) {
        this.receivers = receivers;
    }

    public String[] getGroups() {
        return groups;
    }

    public void setGroups(String[] groups) {
        this.groups = groups;
    }
}