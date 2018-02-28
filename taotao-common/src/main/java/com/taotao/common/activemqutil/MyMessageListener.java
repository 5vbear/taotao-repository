package com.taotao.common.activemqutil;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
/**
*@描述：消息队列的接受监听
*@创建人：[zhang]
*@类名：MyMessageListener
*@时间：2018/2/28 0028-下午 21:22
**/

public class MyMessageListener implements MessageListener {
    @Override
    public void onMessage(Message message) {
        try {
            //接收到消息
            TextMessage textMessage = (TextMessage) message;
            String text = textMessage.getText();
            System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
