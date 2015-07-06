package com.saro.challenge.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by sbalakrishnan on 7/6/15.
 * Note : this class is not used anywhere inside the sample app, this is just a demo on how to use property using spring annotation
 */
@Component
public class PropertyUtil {

    @Value("core.jdbc.driverClassName")
    private String url;
    public String getUrl() {
        return url;
    }
}
