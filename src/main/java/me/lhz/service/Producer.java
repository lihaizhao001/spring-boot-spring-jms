package me.lhz.service;

public interface Producer {
    public void sendMsg(String destinationName, String message);
}
