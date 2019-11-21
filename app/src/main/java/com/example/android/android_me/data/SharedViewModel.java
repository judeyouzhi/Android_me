package com.example.android.android_me.data;

import android.arch.lifecycle.ViewModel;
import android.util.Log;

import java.util.logging.Logger;

public class SharedViewModel extends ViewModel {
    private int leg;
    private int head;
    private int body;

    public int getLeg(){
        return leg;
    }

    public int getHead(){
        return head;
    }

    public int getBody(){
        return  body;
    }

    public void setBody(int body) {
        this.body = body;
        printMe();
    }

    public void setHead(int head) {
        this.head = head;
        printMe();
    }

    public void setLeg(int leg) {
        this.leg = leg;
        printMe();
    }

    private void printMe(){
        Logger logger = Logger.getLogger("android me");
        logger.warning("leg:" + leg);
        logger.warning("head:" + head);
        logger.warning("body:" + body);
    }
}
