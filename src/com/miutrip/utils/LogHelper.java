package com.miutrip.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogHelper {

    static Logger logger = LogManager.getLogger(LogHelper.class);

    public static void Info(String value){
        logger.info(value);
    }

    public static void Error(String value){
        logger.error(value);
    }
}
