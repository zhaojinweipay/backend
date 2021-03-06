/*
 * Copyright 2017 BLOCAIN, Inc. All rights reserved. com.blocain
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.blocain.bitms.quotation.mapper;

import com.blocain.bitms.orm.core.GenericMapper;
import com.blocain.bitms.orm.annotation.MyBatisDao ;
import com.blocain.bitms.quotation.entity.QuoServiceConfig;

/**
 * 行情服务配置表 持久层接口
 * <p>File：QuoServiceConfigMapper.java </p>
 * <p>Title: QuoServiceConfigMapper </p>
 * <p>Description:QuoServiceConfigMapper </p>
 * <p>Copyright: Copyright (c) May 26, 2015</p>
 * <p>Company: BloCain</p>
 * @author Playguy
 * @version 1.0
 */
@MyBatisDao
public interface QuoServiceConfigMapper extends GenericMapper<QuoServiceConfig>
{

}
