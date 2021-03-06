package com.nhnacademy.minidoorayclient.service;

import com.nhnacademy.minidoorayclient.dto.member.request.MemberRequestDto;
import com.nhnacademy.minidoorayclient.dto.member.response.MemberResponseDto;
import com.nhnacademy.minidoorayclient.vo.SecurityUser;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public interface MemberService {
    String register(MemberRequestDto memberRequestDto);

    SecurityUser findByMemberEmail(String email);

    List<MemberResponseDto> findAllMember();

}
