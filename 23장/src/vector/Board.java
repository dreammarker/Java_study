package vector;

public class Board {
	String subject;
	String content;
	String writer;
	
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	public String getSubject() {
		return subject;
	}
	public void show() {
		System.out.println("subject, content, writer");
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Board(String subject, String content) {
//		super();
	/*	this.subject = subject;
		this.content = content;
	*/
	this(subject,content,null);	
	}
	
	@Override
	public String toString() {
		return "Board [subject=" + subject + ", content=" + content + ", writer=" + writer + "]";
	}
	
	

}
