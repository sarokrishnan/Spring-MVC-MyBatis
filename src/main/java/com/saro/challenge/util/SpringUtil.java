package com.saro.challenge.util;

/**
 * Created by sbalakrishnan on 7/6/15.
 */

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class SpringUtil implements ApplicationContextAware {
    private static ApplicationContext ctx = null;

    public static ApplicationContext getContext(){
        return ctx;
    }

    public void setApplicationContext(ApplicationContext ctx)
            throws BeansException {
        this.ctx = ctx;
    }

    public synchronized void stopSpring(){
        ctx = null;

    }


}