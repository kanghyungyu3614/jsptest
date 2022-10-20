package model.dto;

public class BoardDto {
	private int bno;           //  게시물번호 
	private String btitle;     //  게시물제목 
	private String bcontent;   //  게시물내용 
	private String bname;      //  게시물작성자
	private String bpassword;  //  게시물패스워드 
	private String bdate;      //  게시물 작성일
	private int bpoint;        //  게시물 조회수
	
	public BoardDto(){}

	public BoardDto(int bno, String btitle, String bcontent, String bname, String bpassword, String bdate, int bpoint) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bname = bname;
		this.bpassword = bpassword;
		this.bdate = bdate;
		this.bpoint = bpoint;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBpassword() {
		return bpassword;
	}

	public void setBpassword(String bpassword) {
		this.bpassword = bpassword;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public int getBpoint() {
		return bpoint;
	}

	public void setBpoint(int bpoint) {
		this.bpoint = bpoint;
	}

	@Override
	public String toString() {
		return "BoardDto [bno=" + bno + ", btitle=" + btitle + ", bcontent=" + bcontent + ", bname=" + bname
				+ ", bpassword=" + bpassword + ", bdate=" + bdate + ", bpoint=" + bpoint + "]";
	}
	
	
	
	
	
}
