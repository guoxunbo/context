package com.newbiest.common.main;

import com.newbiest.base.factory.ModelFactory;
import com.newbiest.context.model.Context;
import com.newbiest.context.model.ContextValue;
import com.newbiest.context.model.MergeRule;
import com.newbiest.context.model.MergeRuleLine;
import liquibase.integration.spring.SpringLiquibase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Slf4j
@Component
public class ContextConfiguration {

    @Bean(name="contextLiquibase")
    public SpringLiquibase liquibase(DataSource dataSource) throws Exception{
        if (log.isInfoEnabled()) {
            log.info("Load Context Liquibase Configuration.");
        }
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setDataSource(dataSource);
        liquibase.setChangeLog("classpath:db/changelog/db.changelog-context.yaml");
        liquibase.setShouldRun(true);
        liquibase.setDropFirst(false);
        return liquibase;
    }

}

