package org.zerock.dao;

import jdk.vm.ci.meta.Local;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zerock.jdbcex.dao.TodoDAO;
import org.zerock.jdbcex.domain.TodoVO;

import java.time.LocalDate;
import java.util.List;

public class TodoDAOTests {

    private TodoDAO todoDAO;

    @BeforeEach
    public void ready() {
        todoDAO = new TodoDAO();
    }

    @Test
    public void testTime() throws Exception {
        System.out.println(todoDAO.getTime());
    }

    @Test
    public void testInsert() throws Exception {
        TodoVO todoVo = TodoVO.builder()
        .title("Sample Title...")
        .dueDate(LocalDate.of(2025, 06, 07))
        .build();

        todoDAO.insert(todoVo);

    }

    @Test
    public void testList() throws Exception {

        List<TodoVO> list = todoDAO.selectAll();

        list.forEach(System.out::println);
    }

    @Test
    public void testSelectOne() throws Exception {

        Long tno = 1L;

        TodoVO todoVO = todoDAO.selectOne(tno);

        System.out.println(todoVO);
    }

    @Test
    public void testUpdateOne() throws Exception {
        TodoVO todoVO = TodoVO.builder()
                .tno(1L)
                .title("Sampel Title...")
                .dueDate(LocalDate.of(2025,12,31))
                .finished(true)
                .build();

        todoDAO.update(todoVO);
    }
}
