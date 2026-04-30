	import java.util.*;

	public class CourseTester_Huffman {

		public static void main(String[] args) {
			
			ArrayList<String> obj = new ArrayList<String>();
			
			Course FirstCourse = new Course( "SCI112", "Botany", 3);
			obj.add(FirstCourse.toString());
			Course SecondCourse = new Course( "ECO110", "Basket Weaving", 3);
			obj.add(SecondCourse.toString());
			Course ThirdCourse = new Course( "MUS110", "Music Appreciation", 3, "Dr. Dre");
			obj.add(ThirdCourse.toString());
			Course FourthCourse = new Course( "PE230", "Advanced Walking", 3, "Dr. Yang");
			obj.add(FourthCourse.toString());
			Course FifthCourse = new Course( "SCI220", "Organic Chemistry", 3, "Dr. Grey");
			obj.add(FifthCourse.toString());
			Course SixthCourse = new Course( "NES120", "Game Design", 3, "Dr. Mario");
			obj.add(FifthCourse.toString());
			Course SeventhCourse = new Course( "PSE321", "Investigation", 3, "Dr. Waldo");
			obj.add(FifthCourse.toString());
			Course EighthCourse = new Course( "CRE440", "Organic Chemistry", 3, "Dr. Ivy");
			obj.add(FifthCourse.toString());
			
			for (String element : obj) {
				System.out.println(element);
			}
		}
		
	}