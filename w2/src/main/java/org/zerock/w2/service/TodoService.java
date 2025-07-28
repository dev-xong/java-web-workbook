package org.zerock.w2.service;

import org.modelmapper.ModelMapper;
import org.zerock.w2.dao.TodoDAO;
import org.zerock.w2.domain.TodoVO;
import org.zerock.w2.dto.TodoDTO;
import org.zerock.w2.util.MapperUtil;

public enum TodoService {

    INSTANCE;

    private TodoDAO dao;
    private ModelMapper modelMapper;

    TodoService() {
        dao = new TodoDAO();
        modelMapper = MapperUtil.INSTANCE.get();
    }

    public void register(TodoDTO dto) throws Exception {

        TodoVO vo = modelMapper.map(dto, TodoVO.class);

        System.out.println("todoVO : " + vo);

        dao.insert(vo);
    }
}
