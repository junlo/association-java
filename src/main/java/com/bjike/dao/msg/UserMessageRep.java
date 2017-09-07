package com.bjike.dao.msg;


import com.bjike.dao.JpaRep;
import com.bjike.dto.msg.UserMessageDTO;
import com.bjike.entity.msg.UserMessage;

/**
 * 用户消息持久化接口, 继承基类可使用ｊｐａ命名查询
 *
 * @Author: [ liguiqin ]
 * @Date: [ 2017-03-21T09:40:27.619 ]
 * @Description: [ 用户消息持久化接口, 继承基类可使用ｊｐａ命名查询 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface UserMessageRep extends JpaRep<UserMessage, UserMessageDTO> {

}