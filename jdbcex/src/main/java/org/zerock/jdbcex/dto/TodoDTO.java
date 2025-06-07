package org.zerock.jdbcex.dto;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class TodoDTO {

    private Long tno;

    private String title;

    private LocalDateTime dueDate;

    private boolean finished;
}
