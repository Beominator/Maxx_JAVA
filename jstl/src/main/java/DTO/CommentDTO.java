package DTO;

import java.time.LocalDate;

public class CommentDTO {
	private int commentId;
	private int boardId;
	private String writer;
	private String comment;
	private LocalDate writeDate;
	
	public static CommentDTO of(int cid, int bid, String writer, String comment, LocalDate date) {
		CommentDTO dto = new CommentDTO();
		dto.commentId = cid;
		dto.boardId = bid;
		dto.writer = writer;
		dto.comment = comment;
		dto.writeDate = date;
		return dto;
	}
	
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public LocalDate getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(LocalDate writeDate) {
		this.writeDate = writeDate;
	}
	
}
