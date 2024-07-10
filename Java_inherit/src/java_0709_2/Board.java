package java_0709_2;

public class Board {
	private int Board_id;
	private String Title;
	private String Writer;
	private String Content;
	private int Hit;
	
	public Board() {}
	public Board(int Board_id, String Title, String Writer, String Content, int Hit) {
		this.Board_id = Board_id;
		this.Title = Title;
		this.Writer = Writer;
		this.Content = Content;
		this.Hit = Hit;
	}
	
	@Override
	public String toString() {
		return Board_id+". "+Title+"("+Writer+", "+Hit+"), "+Content;
	}
	
	public int getBoard_id() {
		return Board_id;
	}
	public void setBoard_id(int board_id) {
		Board_id = board_id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getWriter() {
		return Writer;
	}
	public void setWriter(String writer) {
		Writer = writer;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public int getHit() {
		return Hit;
	}
	public void setHit(int hit) {
		Hit = hit;
	}
	
	
	
}
