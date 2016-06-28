package bean;

@SuppressWarnings("all")
public class Comment {
	private String fullname;
	private String cmt;
	private String date;
	public Comment() {
		super();
	}
	public Comment(String fullname, String cmt, String date) {
		super();
		this.fullname = fullname;
		this.cmt = cmt;
		this.date = date;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getCmt() {
		return cmt;
	}
	public void setCmt(String cmt) {
		this.cmt = cmt;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
