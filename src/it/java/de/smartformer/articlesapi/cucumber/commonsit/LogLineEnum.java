package de.smartformer.articlesapi.cucumber.commonsit;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
enum LogLineEnum {

    ERROR,
    INFO
    
}
