package com.example.lenovo.gupshup.firebase;

/**
 * Created by Lenovo on 12-Aug-16.
 */
public class URLEndPoints {
    public interface EndPoints {
        String HOST = "104.236.54.169";
        String NEW_USER = "http://"+HOST+"/gupshup/v1/user/login";
        String UPDATE_FCM_ID = "http://"+HOST+"/gupshup/v1/user/";
        String GET_USER = "http://"+HOST+"/gupshup/v1/user/";
        String GET_CHATS = "http://"+HOST+"/gupshup/v1/messages/";
        String GET_CHAT_ID = "http://"+HOST+"/gupshup/v1/find_chat/_send_/chat_id/_receive_";
        String NEW_MESSAGE = "http://"+HOST+"/gupshup/v1/find_chat/_CHAT_ID_/message";
    }
}
