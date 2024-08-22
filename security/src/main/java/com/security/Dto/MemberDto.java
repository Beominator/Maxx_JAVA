package com.security.Dto;

import com.security.Entity.Member;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDto {
    private String userId;
    private String password;
    private int age;

    // DTO -> Entity
    public Member createEntity(){
        Member member = new Member();
        member.setAge( this.age);
        member.setPassword( this.password );
        member.setUserId( this.userId );
        return member;
    }

    // Entity -> DTO
    public static MemberDto of(Member member){
        MemberDto memberDto = new MemberDto();
        memberDto.setAge(member.getAge());
        memberDto.setPassword(member.getPassword());
        memberDto.setUserId(member.getUserId());
        return memberDto;
    }
}
