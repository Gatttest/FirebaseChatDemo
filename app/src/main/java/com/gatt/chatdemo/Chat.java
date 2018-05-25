package com.gatt.chatdemo;

/**
 * Class that represent the message.
 */
public class Chat {
    public String message;
    public String id;
    public String time;

    public Chat() {
    }

    public Chat(String message,  String id, String a) {
        this.message = message;
        this.id = id;
        this.time = a;

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
