package week3.day1;

public class Student extends Department {
	public void studentName()
	{
		System.out.println("Name of the Student : Javeed");
	}
	
	public void studentDept()
	{
		System.out.println("Name of the Department : Computer Science");
	}
	
	public void studentId()
	{
		System.out.println("Student ID : 9987655");
	}
	public static void main(String[] args) 
	{
		System.out.println("Welcome to College Portal \n");
		Student info = new Student();
		info.collegeName();
		info.collegeCode();
		info.collegeRank();
		info.departmentName();
		info.studentName();
		info.studentDept();
		info.studentId();
}
}
