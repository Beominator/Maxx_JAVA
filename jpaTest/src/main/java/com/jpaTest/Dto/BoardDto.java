package com.jpaTest.Dto;

import com.jpaTest.Entity.Board;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
public class BoardDto {
    private int id;
    @NotBlank(message = "작성자는 필수 입력 입니다.")
    private String writer;

    @Size(min = 4,max = 200,message = "4자 이상 200자 이하로 제목 작성")
    private String title;

    @NotEmpty(message = "내용은 필수 입니다.")
    private String content;


    private static ModelMapper modelMapper = new ModelMapper();

    // BoardDto 객체 데이터 -> Board 객체에 저장 (변수 이름이 같아야 사용 가능)
    public Board createBoard(){
        return modelMapper.map(this, Board.class);
    }


    // BoardDto -> Board
//    public Board createBoard(){
//        Board board = new Board();
//        board.setContent( this.content );
//        board.setTitle( this.title );
//        board.setWriter( this.writer );
//        return board;
//    }
}
