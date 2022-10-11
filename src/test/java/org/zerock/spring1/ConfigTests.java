package org.zerock.spring1;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.spring1.dao.TodoDAO;
import org.zerock.spring1.dao.TodoDAOImpl1;
import org.zerock.spring1.service.TodoService;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes={org.zerock.spring1.config.RootConfig.class})
@Log4j2
public class ConfigTests {

    @Autowired//주입해주셈 이란 어노테이션
//    ApplicationContext context;  //주입
    TodoService service;
    @Autowired
    TodoDAO todoDAO;


    @Test
    public void test1(){
        Assertions.assertNotNull(service);  //null 아니라고 확신 ?
        Assertions.assertNotNull(todoDAO);
        log.info(todoDAO);
        log.info(service);

    }
}
