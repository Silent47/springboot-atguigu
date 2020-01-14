package com.mxb.service.impl;

import com.mxb.service.ICacheService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheServiceImpl implements ICacheService {

    private Logger logger = LoggerFactory.getLogger(CacheServiceImpl.class);

    @Cacheable(cacheNames = "fibonacci")
    public Integer compute(Integer arg) {
        logger.info("{} -> Computing: {}.", getClass(), arg);

        if (arg == null) {
            return null;
        }
        if (arg < 0) {
            return null;
        }
        if (arg == 0 || arg == 1) {
            return 1;
        }

        return compute(arg - 2) + compute(arg - 1);
    }

}
