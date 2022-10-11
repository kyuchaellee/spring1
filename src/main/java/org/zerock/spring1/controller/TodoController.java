package org.zerock.spring1.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.spring1.dto.TodoDTO;

//어노테이션 일단 싹다 외우기
//컨트롤러 여러개 만들 필요 x
@Controller
@RequestMapping("/todo")
@Log4j2
public class TodoController {

    @GetMapping("/list")
    public void list(Model model){  //request response dispatcher 대신 Model 사용
       log.info("Todo List...........................");
       model.addAttribute("result","hello World");
    }

    @GetMapping("/register")
    public void register(){

    }

    @PostMapping("/register")
    public String registerPost(TodoDTO todoDTO){
        log.info(todoDTO);

        return "redirect:/todo/list"; // redirection
    }
}
