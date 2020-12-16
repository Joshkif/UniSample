package UniSa;
import java.util.Map;

public class Degree {
	
    private Map<String, Course[]> degreeCourses;
	private String degreeCode;
	private String degreeName;
	private char courseType;
	
	
	public Degree(String degreeCode,String degreeName,char courseType, Map<String,Course[]> degreeCourses)
	{
		this.degreeCode = degreeCode;
		this.courseType = courseType;
		this.degreeName =degreeName;
		this.degreeCourses = degreeCourses;
	}

	public void addCourse( String name,Course[] course)
	{
		degreeCourses.put(name,course);
	}
	
	public String  DegreeCode( ) {
		return degreeCode;
	}
	
	public String  DegreeName( ) {
		return degreeName;
	}
	
	public char  CourseType( ) {
		return courseType;
	}
	
   
    public Map<String,Course[]> getDegreeCourses( ) {
	      return degreeCourses;
	 }

	public String printCourseInformation() {
		
		return "The degree code is '" + DegreeCode() + "' the degree name is '" +  DegreeName()+"'";
	}

}
