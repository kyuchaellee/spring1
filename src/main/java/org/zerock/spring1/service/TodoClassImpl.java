package org.zerock.spring1.service;


import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.zerock.spring1.dao.TodoDAO;

@Service
@RequiredArgsConstructor
@Log4j2
@ToString
public class TodoClassImpl implements TodoService{

    private final TodoDAO todoDAO;

}
