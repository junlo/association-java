package com.bjike.type.chat;

/**
 * @Author: [liguiqin]
 * @Date: [2017-07-22 09:46]
 * @Description: [ ]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public enum ApplyType {
    /**
     * 申请状态
     */
    APPLY(0),
    /**
     * 通过
     */
    PASS(1),
    /**
     * 拒绝
     */
    REFUSE(2),;
    private int value;

    ApplyType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
