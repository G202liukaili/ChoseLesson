package pack1;

public class Teacher extends Member{
	String tlesson;
	public Teacher(int xuehao, String name, String sex) {
		super(xuehao, name, sex);
		

	}
	public Teacher(){
		
	}
	

	public void showsJAVA(){
		name="张老师"; sex="男"; xuehao=5001;
		System.out.println("教师姓名:"+name+", 性别:"+sex+", 编号:"+xuehao);
		}
//		System.out.println("教师姓名:张老师，性别:男,编号:001" );	
//	}
	public void showsEn(){
		name="刘老师"; sex="女"; xuehao=6002;
		System.out.println("教师姓名:"+name+", 性别:"+sex+", 编号:"+xuehao);
	}
	public void showsIn(){
		name="赵老师"; sex="男"; xuehao=1003;
		System.out.println("教师姓名:"+name+", 性别:"+sex+", 编号:"+xuehao);
	}
	public void showsHi(){
		name="郑老师"; sex="女"; xuehao=3004;
		System.out.println("教师姓名:"+name+", 性别:"+sex+", 编号:"+xuehao);
	}
	
	
//	public void tlesson(){
//		System.out.println("教师所授课程："+tlesson);
//	}
}
