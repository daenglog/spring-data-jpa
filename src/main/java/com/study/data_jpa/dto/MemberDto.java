package com.study.data_jpa.dto;


import com.study.data_jpa.entity.Member;

public record MemberDto(
        Long id,
        String username,
        String teamName
) {

    public MemberDto(Member member) {
        this(
                member.getId(),
                member.getUsername(),
                member.getTeam() != null
                        ? member.getTeam().getName()
                        : null
        );
    }
}
