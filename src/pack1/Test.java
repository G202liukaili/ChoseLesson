package pack1;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int xuehao;
		String name,sex;
		Scanner scan = new Scanner(System.in);	//构造Scanner类的对象scan，接收从控制台输入的信息
		Course c=new Course();

		System.out.println("请输入您的学号：");
		xuehao=scan.nextInt();
		
		System.out.println("请输入您的姓名：");
		name=scan.next();
		
		System.out.println("请输入您的性别：");
		sex=scan.next();
		
		Student s1=new Student(xuehao,name,sex);
		c.choseLesson(s1.name);
		c.needtui(s1.name);
		
	}

}
