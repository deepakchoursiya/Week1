class DividingPens
{
	public static void main(String args[])
	{	
		int totalPens = 14;
		// total number of pes
		
		int numberOfStudents = 3;
		// total number of students
		
		int penGotBySingleStudent = totalPens / numberOfStudents ;
		// number of pens  recieved by one students
		
		int pensLeft = totalPens / numberOfStudents;
		// calculation of pensLeft
		
		System.out.println(" The Pen Per Student is " + penGotBySingleStudent + " and the remaining pes left for distribution is " + pensLeft );
		
		
	}
}