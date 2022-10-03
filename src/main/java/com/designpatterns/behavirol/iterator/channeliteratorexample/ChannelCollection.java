package com.designpatterns.behavirol.iterator.channeliteratorexample;

public interface ChannelCollection {

    void addChannel(Channel c);

    void removeChannel(Channel c);

    ChannelIterator iterator(ChannelTypeEnum type);
}
