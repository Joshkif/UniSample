package UniSa;

public class MainApp {

	public static void main(String[] args) {
		
		
		try {
				var instruction = new Instruction();
				instruction.displayInstructions();
				//IDegreeRepository runTimeStore = new DegreeDatabaseStore(); This will throw UnsupportedOperationException
				IDegreeRepository runTimeStore = new DegreeRunTimeStore();
				UniSa college = new UniSa(runTimeStore);
				college.printAllCouses();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}

	
	 }
}
