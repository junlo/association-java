package com.bjike.type.chat;

/**
 * @Author: [liguiqin]
 * @Date: [2017-07-19 14:38]
 * @Description: [ ]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public enum MsgType {
    /**
     * 系统
     */
    SYS(0),
    /**
     * 点对点
     */
    POINT(1),
    /**
     * 群发
     */
    GROUP(2),
    /**
     * 上线通知
     */
    ONLINE(3),
    /**
     * 下线通知
     */
    OFFLINE(4),;
    private int value;

    MsgType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
