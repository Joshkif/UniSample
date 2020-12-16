package UniSa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DegreeRunTimeStore implements IDegreeRepository {
	
	private ArrayList<Degree> onlineDegreeList;
	
	
	public DegreeRunTimeStore()
	{
		addOnlineDegrees();
	}
	
	  private void addOnlineDegrees()
	   {
	    	if(onlineDegreeList == null)
	    		onlineDegreeList = new ArrayList<Degree>();
	    	    onlineDegreeList.add(new Degree("ITDA","Information Technology and Data Analytics",'O',addOnlineCourses()));
	    	    onlineDegreeList.add(new Degree("ACC","Accounting",'D',addOnCumpusourses()));
	   }
	  
	  private  Map<String,Course[]> addOnlineCourses()
	  {
		   Map<String,Course[]> degreeCourses = new HashMap<String,Course[]>();
		   Course[] courseList = new Course[8];
		   courseList[0]= new Course("UO Critical Approaches to Online Learning","ITDA", 1);
		   courseList[1]= new Course("UO Information Technology Fundamentals","ITDA", 1);
		   courseList[2]= new Course("UO Problem Solving and Programming","ITDA", 1);
		   courseList[3]= new Course("UO Design Thinking and Digital Innovation","ITDA", 1);
		   courseList[4]= new Course("UO Systems Analysis","ITDA", 1);
		   courseList[5]= new Course("UO Programming Fundamentals","ITDA", 1);
		   courseList[6]= new Course("UO IT Project Management","ITDA", 1);
		   courseList[7]= new Course("UO Database Fundamentals ","ITDA", 1);
		   degreeCourses.put("ITDA",courseList);
		   return degreeCourses;
	  }
	  
	  private  Map<String,Course[]> addOnCumpusourses()
	  {
		  Map<String,Course[]> degreeCourses = new HashMap<String,Course[]>();
		   Course[] courseList = new Course[8];
		   courseList[0]= new Course("UO Critical Approaches to Online Learning","ACC", 1);
		   courseList[1]= new Course("UO Business and Society","ACC", 1);
		   courseList[2]= new Course("UO Accounting for Business","ACC", 1);
		   courseList[3]= new Course("UO Business Law","ACC", 1);
		   courseList[4]= new Course("UO Quantitative Methods for Business","ACC", 1);
		   courseList[5]= new Course("UO Financial Accounting 1","ACC", 1);
		   courseList[6]= new Course("UO Marketing Principles: Trading and Exchange","ACC", 1);
		   courseList[7]= new Course("UO Principles of Economics","ACC", 1);
		   degreeCourses.put("ACC",courseList);
		   return degreeCourses;
	  }
	  
	@Override
	public ArrayList<Degree> getUniSaDegreeList() {
	
		return onlineDegreeList;
	}

}
