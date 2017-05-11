package com.senyint.test;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeoutException;


/**
 * Created by hanpeng on 2017/5/11.
 */
public class RabbitMqTest {

    private final static String QUEUE_NAME = "hello1";

    public static void main(String[] args) throws IOException, TimeoutException {
        send();
        recive();

    }

    public static Channel getChannel() throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("172.16.190.182");
        factory.setUsername("guest");
        factory.setPassword("guest");
        Connection connection = factory.newConnection();
        return connection.createChannel();
    }

    public static void send() throws IOException, TimeoutException {
        Channel channel = getChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        String message = "Hello World!";
            message = "hello world" ;
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
        System.out.println(" [x] Sent '" + message + "'");
    }

    public static void recive() throws IOException, TimeoutException {
        Channel channel = getChannel();
        Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
//                super.handleDelivery(consumerTag, envelope, properties, body);
                String str = new String(body,"utf-8");
                try {
                    System.out.println("begin sleep");
                    Thread.sleep(5000);
                    System.out.println("消费完了"+str);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    channel.basicAck(envelope.getDeliveryTag(),false);
                }
//                System.out.println("recive msg :"+str);
            }

        };
        channel.basicConsume(QUEUE_NAME, false, consumer);
    }
}
