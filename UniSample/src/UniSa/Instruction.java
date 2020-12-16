package UniSa;

public class Instruction {
	private String[] instuctions = {"Thank you for taking interest in our courses!", 
			                         "Please follow the following instruction to run the programe",
			                          "To see the degrees that runs online, please use the leter O otherwise please use the letter D"
			};

	  public void displayInstructions()
	   {
	 
	        for (String instruction: instuctions) {
	        	System.out.println(instruction);
	   
	        }
	        
	        //or
	     //   for (int i = 0; i < instuctions.length; i++) {
	      //  	  System.out.println(instuctions[i]);
	       // 	}
	   
	   }
}
