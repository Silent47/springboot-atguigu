package com.mxb.controller;

import com.mxb.service.ICacheService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {

    private Logger logger = LoggerFactory.getLogger(CacheController.class);

    private ICacheService cacheService;

    @Autowired
    public void setCacheService(ICacheService cacheService) {
        this.cacheService = cacheService;
    }

    @GetMapping("{arg}")
    public Integer get(@PathVariable Integer arg) {
        Integer result = cacheService.compute(arg);
        logger.info("Computed: {} -> {}.", arg, result);
        return result;
    }
}
