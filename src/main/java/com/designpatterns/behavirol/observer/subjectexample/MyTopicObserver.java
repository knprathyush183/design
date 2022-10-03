package com.designpatterns.behavirol.observer.subjectexample;

public class MyTopicObserver implements Observer{

    private String name;
    private Subject topic;

    public MyTopicObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if (msg == null) {
            System.out.println(name + ":: No new msg");
        } else {
            System.out.println(name + ":: Consuming msg ::" + msg);
        }
    }

    @Override
    public void setSubject(Subject sub) {
        this.topic = sub;
    }
}
