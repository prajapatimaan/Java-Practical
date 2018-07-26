class Student
{
	Student(int x,int y,int z)
	{
		int mark=x+y+z;
		int avg=mark/3;
		System.out.println("avg of 3 subject:" + avg);
	}
}
class p1
{
	public static void main(String ar[])
	{
		Student s1=new Student(10,30,50);
		Student s2=new Student(50,40,60);
		Student s3=new Student(50,70,40);
		Student s4=new Student(90,80,40);
		Student s5=new Student(70,70,60);	
	}
}