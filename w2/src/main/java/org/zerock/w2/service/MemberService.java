package org.zerock.w2.service;

import org.modelmapper.ModelMapper;
import org.zerock.w2.dao.MemberDAO;
import org.zerock.w2.domain.MemberVO;
import org.zerock.w2.dto.MemberDTO;

public enum MemberService {

    //싱글톤
    INSTANCE;

    private MemberDAO dao; //DB 접근 객체
    private ModelMapper modelMapper; // VO -> DTO 변환 도구


    //MemberService 인스턴스가 생성될 때 DAO와 ModelMapper 객체를 초기화
    MemberService(){
        dao = new MemberDAO();
        modelMapper = new ModelMapper();
    }

    public MemberDTO login(String mid, String mpw) throws Exception {

        //DAO를 통해 아이디와 비밀번호로 사용자 정보 조회 후 vo에 저장
        MemberVO vo = dao.getWithPassword(mid, mpw);
        //조회한 VO를 DTO로 변환
        MemberDTO memberDTO = modelMapper.map(vo, MemberDTO.class);

        return memberDTO;
    }

    public void updateUuid(String mid, String uuid) throws Exception {

        dao.updateUuid(mid, uuid);
    }

    public MemberDTO getByUUID(String uuid) throws Exception {

        MemberVO vo = dao.selectUUUID(uuid);
        MemberDTO memberDTO = modelMapper.map(vo, MemberDTO.class);

        return memberDTO;
    }
}
