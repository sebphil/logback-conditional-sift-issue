package com.github.sebphil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        MDC.put("logCategory", "test");
        LOGGER.info("hello world!");
    }
}
