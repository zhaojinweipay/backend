package com.blocain.bitms.api.topic;

import com.blocain.bitms.api.consts.TopicConst;
import org.springframework.data.redis.listener.ChannelTopic;


/**
 * KLineDayChannelTopic Introduce
 * <p>File：KLineDayChannelTopic.java</p>
 * <p>Title: KLineDayChannelTopic</p>
 * <p>Description: KLineDayChannelTopic</p>
 * <p>Copyright: Copyright (c) 2017/8/3</p>
 * <p>Company: BloCain</p>
 *
 * @author Playguy
 * @version 1.0
 */
public class KLineDayChannelTopic extends ChannelTopic
{
    public KLineDayChannelTopic(TopicConst topicConst)
    {
        super(topicConst.TOPIC_KLINE_DAY);
    }
}
