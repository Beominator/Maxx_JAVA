
package com.members.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name="member_test")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="member_id")
    private int id;

    private String userId;
    private String password;
    private String tel;
}

/*
    JPA 메서드
    데이터베이스에서
        데이터 - 하나의 컬럼에 저장된 값
        컬럼 - 필드명, 한 종류의 데이터들을 지칭하는 이름
            예) 김유신, 이순신, 강감찬, 을지문덕, 최무선, 홍길동, 김철수
                쏘나타, 아반테, 쏘렌토, 제네시스, 스포티지
        레코드 - 각 컬럼에 저장된 데이터들
            이름  나이  직업
            김철수 25  군인 ->  김철수, 25, 군인을 하나의 레코드라고 한다.
            홍길동 34  도둑
        파일 - 레코드의 집합

    JPA에 추상화 되어있는 메서드들
    save() - insert : 새로운 데이터들을 테이블에 저장, Entity객체에 Id(primary key)가 없는 경우 insert 실행
             update : 테이블의 특정 데이터 변경, Entity객체에 set메서드 실행과 Id가 존재하는 경우 uodate 실행
             사용법 : 레포지토리.save(Entity객채);

    delete() - 삭제 : 레포지토리.delete(Entity객체);

    count() - 테이블의 전체 레코드 갯수를 알려준다.

    findAll() - 테이블의 전체 레코드를 조회하여 가져온다. ( 정렬, 페이징 가능 )
              사용법 : 레포지토리.findAll();
              반환값(return) : List<Entity클래스명> (Optional)
    findById() - 테이블의 primary key 컬럼으로 조회하여 일치하는 레코드 가져오기
              사용법 : 레포지토리.findById( primary key의 타입 인자 )

    JPA 이름 규칙을 적용해서 메서드 커스텀(만들기)
        이름 규칙은 Entity클래스의 변수명이 컬럼으로 사용되어야 한다.
                변수의 첫글자는 대문자로 표기한다.
                findBy______ findBy로 시작하여 뒤에 컬럼명 또는 연산자를 사용한다.

    Entity 클래스
     -> class Member{
        @Id
        private long id;
        private String name;
        private int myAge;
        }
    Entity클래스에 의해 생성되는 테이블
        create table member(
            id long primary key,
            name varchar(255),
            my_age int
        );


    테이블명이 member라면
    테이블에 name컬럼의 데이터로 조회하기
    쿼리문 -> select * from member where name='김철수';
    JPA 메서드 -> findByName("김철수");


    나이와 이름으로 조회하기
    쿼리문 -> select * from member where name='김철수' and my_age=25;
    JPA 메서드 -> findByNameAndMyAge("김철수", 25);

    나이 또는 이름이 일치하는 데이터 조회하기
    쿼리문 -> select * from member where my_age=30 or name='이영희';
    JPA 메서드 -> findByMyAgeOrName(30, "이영희");

    두값 사이에 있는 데이터 조회하기
    나이가 15 에서 30 에 해당하는 사람들 조회하기
    쿼리문 -> select * from member where my_age between 15 and 30;
    JPA 메서드 -> findByMyAgeBetween(15,30);

    포함된 값 조회하기
    이름에 신이 포함되어있는 사람 조회하기
    쿼리문 -> select * from member where name like '%신%';
    JPA 메서드 -> findByNameLike("신");

    정렬하여 가져오기
    나이기준으로 내림차순 정렬 ( 오름차순 - asc 내림차순 - desc)
    쿼리문 -> select * from member order by my_age desc;
    JPA 매서드 -> findByOrderByMyAgeDesc();
             -> findByMyAgeOrderByIdAsc(25); -> 나이가 25인 사람들을 id기준으로 오름차순 정렬
*/
