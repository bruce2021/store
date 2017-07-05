package com.marvel.web.root;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * Created by dell on 2017/7/4.
 */

public class DocumentDirectoryCustomizer implements EmbeddedServletContainerCustomizer {


    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setDocumentRoot(new File("/Users/dell/Documents/java/springboot/web/src/main/webapp"));



    }
}
