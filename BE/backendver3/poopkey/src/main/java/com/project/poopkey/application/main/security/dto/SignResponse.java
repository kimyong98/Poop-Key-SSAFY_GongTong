/**
 * 회원 가입 관련 부분 검토하기
 * */
package com.project.poopkey.application.main.security.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SignResponse {
    private String password;
    private String email;
    private List<String> roles = new ArrayList<>();
    private String token;

    public SignResponse(Member member) {
        this.email = member.getEmail();
    }
}