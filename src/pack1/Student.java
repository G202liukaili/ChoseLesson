package pack1;

public class Student extends Member{
	String xlesson;
	public Student(int xuehao, String name, String sex) {
		super(xuehao, name, sex);
		// TODO Auto-generated constructor stub
		
	}	
	public void showxlesson(){
		System.out.println("ѧ��ѧ��:"+xuehao+", ����:"+name+",�Ա� :"+sex);
	}
	

}
