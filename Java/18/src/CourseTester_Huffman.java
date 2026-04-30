import java.util.*;

public class CourseTester_Huffman {

	public static void main(String[] args) {
		
		ArrayList<String> obj = new ArrayList<String>();
		
		Course FirstCourse = new Course( "SCI112", "Botany", 3);
		obj.add(FirstCourse.toString());
		//System.out.println(FirstCourse.toString());
		Course SecondCourse = new Course( "ECO110", "Basket Weaving", 3);
		obj.add(SecondCourse.toString());
		//System.out.println(SecondCourse.toString());
		Course ThirdCourse = new Course( "MUS110", "Music Appreciation", 3, "Dr. Dre");
		obj.add(ThirdCourse.toString());
		//System.out.println(ThirdCourse.toString());
		Course FourthCourse = new Course( "PE230", "Advanced Walking", 3, "Dr. Yang");
		obj.add(FourthCourse.toString());
		//System.out.println(FourthCourse.toString());
		Course FifthCourse = new Course( "SCI220", "Organic Chemistry", 3, "Dr. Grey");
		obj.add(FifthCourse.toString());
		//System.out.println(FifthCourse.toString());
		
		for (String element : obj) {
			System.out.println(element);
		}
	}
	
}