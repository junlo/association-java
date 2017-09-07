package com.bjike.to.msg.email;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 邮件发送工具实体
 *
 * @Author: [liguiqin]
 * @Date: [2016-11-29 17:47]
 * @Description: []
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public class Email implements Serializable{
    /**
     * 登录服务器用户名
     */
    private String username;
    /**
     * 登录服务器密码
     */
    private String password;
    /**
     * 邮箱服务器
     */
    private String host;
    /**
     * 发送人
     */
    private String sender;
    /**
     * 发送人名称（默认）
     */
    private String senderName;
    /**
     * 发送主题
     */
    @NotBlank(message = "发送主题不能为空")
    private String subject;
    /**
     * 发送内容
     */
    @NotBlank(message = "发送内容不能为空")
    private String content;
    /**
     * 接收人
     */
    @NotNull(message = "接收人不能为空")
    private String[] receiver = new String[0];
    /**
     * 发送图片地址
     */
    private Map<String, String> imgMap = null;
    /**
     * 发送附件地址
     */
    private List<String> appendixPath = null;
    /**
     * 抄送人人
     */
    private List<String> cc_address = null;
    /**
     * 密送人
     */
    private List<String> bcc_address = null;

    private Email() {

    }


    /**
     * @param subject 邮件主题
     * @param content 邮件内容
     */
    public Email(String subject, String content) {
        this.subject = subject;
        this.content = content;
    }

    /**
     * @param sender    发送者
     * @param receivers 接收者
     */

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String[] getReceiver() {
        return receiver;
    }

    public void setReceiver(String[] receiver) {
        this.receiver = receiver;
    }
    public void setReceiver(String receiver) {
        this.receiver = new String[]{receiver};
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Map<String, String> getImgMap() {
        return imgMap;
    }

    public void setImgMap(Map<String, String> imgMap) {
        this.imgMap = imgMap;
    }

    public List<String> getAppendixPath() {
        return appendixPath;
    }

    public void setAppendixPath(List<String> appendixPath) {
        this.appendixPath = appendixPath;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getCc_address() {
        return cc_address;
    }

    public void setCc_address(List<String> cc_address) {
        this.cc_address = cc_address;
    }

    public List<String> getBcc_address() {
        return bcc_address;
    }

    public void setBcc_address(List<String> bcc_address) {
        this.bcc_address = bcc_address;
    }
}
