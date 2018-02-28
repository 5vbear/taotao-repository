package com.taotao.common.activemqutil;


import javax.jms.Destination;

public interface ConsumerService {
    /**
     * 接受消息
     */
    void receive(Destination destination);

}