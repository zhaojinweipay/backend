package com.blocain.bitms.trade.quotation.topic;

import org.springframework.data.redis.listener.ChannelTopic;

import com.blocain.bitms.trade.quotation.consts.TopicConst;

/**
 * KLineMonthChannelTopic Introduce
 * <p>File：KLineMonthChannelTopic.java</p>
 * <p>Title: KLineMonthChannelTopic</p>
 * <p>Description: KLineMonthChannelTopic</p>
 * <p>Copyright: Copyright (c) 2017/8/3</p>
 * <p>Company: BloCain</p>
 *
 * @author Playguy
 * @version 1.0
 */
public class KLineMonthChannelTopic extends ChannelTopic
{
    public KLineMonthChannelTopic(TopicConst topicConst)
    {
        super(topicConst.TOPIC_KLINE_MONTH);
    }
}