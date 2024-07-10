package java_0709;

public class Game {

	private String title;
	private String genre;
	private String platform;
	
	public Game() {}
	public Game( String title, String genre, String platform) {
		this.title = title;
		this.genre = genre;
		this.platform = platform;
	}
	
	@Override
	public String toString() {
		return title+", "+genre+", "+platform;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
	
}

// 게임 제목과 장르, 플랫폼
// 장르는 액션, 롤플레잉, FPS 등등
// 플랫폼은 PC, PS5, Switch, XBOX	등등