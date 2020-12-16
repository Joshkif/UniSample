package UniSa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniSa {
	
	private ArrayList<Degree> onlineDegreeList;
	private String input;
	
	public UniSa(IDegreeRepository degreStore) {
		onlineDegreeList = degreStore.getUniSaDegreeList();
	}
	
	
	   public void printAllCouses()
	   {
		   Scanner scaner = new Scanner(System.in);
		   while(scaner.hasNext()) {
		    	input = scaner.next();
		        if(input.toUpperCase().equals("O") | input.toUpperCase().equals("D") ) {
		        	var result = filterTheListOFDegrees(input.toUpperCase());
		        	printTheListOFCourses(result,input);
		        	break;
 		        }
		        System.out.println("Your input should be O or D");
	         }
		   scaner.close();
       }
	   
	   private boolean validateInput(String filter)
	   {
		   var result = false;
	       for (Degree degree: onlineDegreeList) {
	            if (String.valueOf(degree.DegreeCode()).equals(filter)) {
	            	result = true;
	            }
	        }
	       return result;
	   }
	   
	   private ArrayList<Degree> filterTheListOFDegrees(String filter)
	   {
		   var result = new ArrayList<Degree>();
	        for (Degree degree: onlineDegreeList) {

	            if (String.valueOf(degree.CourseType()).equals(filter)) {
	                result.add(degree);
	            }
	        }
	       return result;
	   }
	   
	   private  Map<String, Course[]> getDegreeCourses(ArrayList<Degree> degreeList,String filter)
		  {
			   Map<String,Course[]> result = new HashMap<String,Course[]>();
			   for (Degree degree: degreeList) {

		            if (String.valueOf(degree.DegreeCode()).equals(filter)) {
		               System.out.println(degree.printCourseInformation() + " It has the following courses :");
		               result = degree.getDegreeCourses();
		               break;
		            }
		        }
			   return result;
		  }
	   
	   private void requestDegreeCodeFromUser(ArrayList<Degree> filter)
	   {
		   Scanner scaner = new Scanner(System.in);
		   while(scaner.hasNext()) {
		    	input = scaner.next();
		        if(validateInput(input.toUpperCase()) ) {
		        	var result = getDegreeCourses(filter,input.toUpperCase());
		        	printDegreeCourses(result);
		        	break;
 		        }
		        System.out.println("Your input should be one form the list of degrees");
	         }
		   scaner.close();
       }
	   
	   private void printDegreeCourses(Map<String,Course[]> courses)
	   {
			 for (Map.Entry<String,Course[]> entry : courses.entrySet()) 
			 {
				 Course[] course = entry.getValue();
				 for(Course aCourse: course)
				 {
					 aCourse.PrintCourseInformation(); 
				 }
		        
		     } 
			 System.out.println("Thank you for using our system. If you want to continue please run the system again.");
	   }
	   
	   private void printTheListOFCourses(ArrayList<Degree> filter, String input)
	   {
			 if (filter.size()==0)
			 {
				 System.out.println("There are no courses to display, please contact administration of more information.");
			 }
			 else
			 {
				 String choice = "Online";
				 if(input.toUpperCase().equals("O")) 
				 {
					 choice = "Online";
				 }
				 else if (input.toUpperCase().equals("D"))
			    {
					 choice = "In campus";
				}
				 
				 
				 System.out.println("List of UniSa " + choice + " Degrees.");
				 for (Degree degree: filter) {
		 	       	 System.out.println(degree.DegreeCode());	          
			     }
				 System.out.println("Please chose and write the Degree code and press enter to see the list of the courses.");
				 requestDegreeCodeFromUser(filter);
			 }

	   }
	   
	   
}
