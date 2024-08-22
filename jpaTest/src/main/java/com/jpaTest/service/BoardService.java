package com.jpaTest.service;

import com.jpaTest.Dto.BoardDto;
import com.jpaTest.Dto.BoardListDto;
import com.jpaTest.Entity.Board;
import com.jpaTest.Repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;


    // 글 목록 불러오기

    public List<BoardListDto> all(){
        // 1. JPA 메서드를 통해 테이블의 전체 데이터 가져오기
        // 전체 데이터는 Entity객체에 하나씩 저장되어야 한다.
        List<Board> boardList = boardRepository.findAll();

        List<BoardListDto> boardListDtos = new ArrayList<>();

        // Entity List의 값을 Dto List에 저장하기
        for( Board board : boardList){
            boardListDtos.add( BoardListDto.of(board));
        }
        return boardListDtos;
    }


    // 새글 작성 데이터베이스에 저장
    public void save(BoardDto boardDto) {
        // 데이터베이스에 저장 될 수 있도록 Dao 클래스의 메서드 호출

//        if(boardDto.getId() == 0) {  // 새 글 작성


            // 1. DTO 객체를 Entity 객체로 저장
            Board board = boardDto.createBoard();

            // 2. JPA 메서드 호출하기
            boardRepository.save(board);
//        }else{  // 글 수정
//           Board board = boardRepository.findById( boardDto.getId()).orElse(null);
//           board.setWriter(boardDto.getWriter());
//           board.setContent(boardDto.getContent());
//           board.setTitle(boardDto.getTitle());


//        }
    }

    // 상세페이지 요청 처리 서비스 메서드
    public BoardDto getBoard(int id) {

        // 1. 데이터베이스에 조회해서 해당 테이블의 데이터 가져오기
        Board board = boardRepository.findById(id).orElse(new Board());

        // 2. 데이터베이스에서 조회한 결과를 DTO로 변환
        BoardDto boardDto = BoardDto.of(board);

        return boardDto;
    }

    // 글 삭제 요청 처리 서비스 메서드
    public void boardDelete(int id) {

        Board board = boardRepository.findById(id).orElse(null);
        // 조회한 값이 없으면 null을 줘서 삭제 진행 안되게 하기
        boardRepository.delete(board);   // delete(Entity객체)
    }
}


/*
    Optional
     - 개발할때 가장 많이 발생하는 오류(예외)가 null
     null 값이냐 아니냐 검사를 해야한다.
     if( xxx != null)

     - NULLPointerException을 방지하기 위해 Optional 탄생
     - Optional은 null이 발생하지 않도록 도와준다.
*/