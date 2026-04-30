
public class Course {
	// Seth Huffman
	static int CRN = 25000;
	private String CourseID;
	private String CourseName;
	private int Credit;
	private String Instructor;

	public Course(String cid, String cn, int cr){
			CRN++;
			setCourseID(cid);
			setCourseName(cn);
			setCredit(cr);
			setInstructor("Staff");
			
			if ((getCourseID() == null) || (getCourseName() == null)){
				throw new IllegalArgumentException("Object not created");
			}
	}
	public Course(String cid, String cn, int cr, String instructor){
		if ((cid == null) || (cn == null)){
			throw new IllegalArgumentException("Object not created");
		}
			CRN++;
			setCourseID(cid);
			setCourseName(cn);
			setCredit(cr);
			setInstructor(instructor);
			
//			if ((getCourseID() == null) || (getCourseName() == null)){
//				throw new IllegalArgumentException("Object not created");
//			}
	
	}

	public int getCRN() {
		return CRN;
	}
	public String getCourseID() {
		return CourseID;
	}
	public void setCourseID(String courseID) {
		this.CourseID = courseID;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getCredit() {
		return Credit;
	}
	public void setCredit(int credit) {
		if (credit<=5){
			this.Credit = credit;
		}
	}
	public String getInstructor() {
		return Instructor;
	}
	public void setInstructor(String instructor) {
		Instructor = instructor;
	}
	@Override
	public String toString() {
		return CourseID + ", CRN " + CRN + ", " + CourseName + ", " + Credit + " credits, Instructor: " + Instructor;
	}
	public void repeatOrder() {
		System.out.println("Course [CourseID=" + CourseID + ", CourseName=" + CourseName + ", Instructor=" + Instructor + "]");
		System.out.println(CRN);
	}
}
