package org.zerock.spring1.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TodoDTO {

    private String title,writer;
    private LocalDate dueDate;

}
