package com.designpatterns.behavirol.observer.subjectexample;

public class ObserverPatternTest {

    public static void main(String[] args) {
        MyTopic topic = new MyTopic();

        Observer obj1 = new MyTopicObserver("Obj1");
        Observer obj2 = new MyTopicObserver("Obj2");
        Observer obj3 = new MyTopicObserver("Obj3");

        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);

        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);

        obj1.update();

        topic.postMessage("Hello");
    }
}
