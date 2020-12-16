package UniSa;

public class Course {
	
	private String courseName;
	private int year;
	private String degreeCode;
	
	public Course(String courseName,String degreeCode, int year)
	{
		this.courseName = courseName;
		this.year = year;
		this.degreeCode = degreeCode;
	
	}
	
	public void setName( String name ) {
		courseName = name;
	   }

	   public String getCourseName( ) {
	       return courseName;
	   }

	   public String getDegreeCode( ) {
	       return degreeCode;
	   }

	 //The other option is to override the ToString method.
	   public void PrintCourseInformation() {
	      System.out.println(courseName + ". It is year " + year + " course.");
	}
}
