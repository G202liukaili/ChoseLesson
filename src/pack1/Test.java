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
		Scanner scan = new Scanner(System.in);	//����Scanner��Ķ���scan�����մӿ���̨�������Ϣ
		Course c=new Course();

		System.out.println("����������ѧ�ţ�");
		xuehao=scan.nextInt();
		
		System.out.println("����������������");
		name=scan.next();
		
		System.out.println("�����������Ա�");
		sex=scan.next();
		
		Student s1=new Student(xuehao,name,sex);
		c.choseLesson(s1.name);
		c.needtui(s1.name);
		
	}

}
