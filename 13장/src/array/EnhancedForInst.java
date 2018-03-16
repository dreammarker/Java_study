package array;
class Box3{
	private String contents; //내용물
	private int boxNum;  //특정번호
	
	public Box3(int boxNum,String contents) {
		super();
		this.contents = contents;
		this.boxNum = boxNum;
	}
	
	String getContents() {
		return contents;
	}
	int getBoxNum() {
		return boxNum;
	}

	@Override
	public String toString() {
		return "Box3 [contents=" + contents + "]";
	}

	
}
public class EnhancedForInst {

	public static void main(String[] args) {
			Box3[] ar= new Box3[5];
			ar[0]=new Box3(101,"Coffee");
			ar[1]=new Box3(202,"Computer");
			ar[2]=new Box3(303,"Apple");
			ar[3]=new Box3(404,"Dress");
			ar[4]=new Box3(505,"Fairy-tale book");
			
	}

}
