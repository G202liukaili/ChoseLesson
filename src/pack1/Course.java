package pack1;

import java.util.Arrays;
import java.util.Scanner;

public class Course extends Teacher{

	public Course(int xuehao, String name, String sex) {
		super(xuehao, name, sex);
		// TODO Auto-generated constructor stub	
	}
	public Course(){
		System.out.println("所提供的课程列表："+Arrays.toString(keming));}
	
	int kehao;
	Teacher teac=new Teacher();
	String address,time;
	String keming[]={"1JAVA","2English","3Internet","4History"};
	String keming2[]={"JAVA","English","Internet","History"};
	String tName;

	Scanner scan =new Scanner(System.in);
	
	public String showlist(){
		System.out.println("所提供的课程列表："+Arrays.toString(keming));
		return tlesson;
	}
	public void choseLesson(String name){
		System.out.println("请选择课程：(编号为1-3)");
//		teac.name=tName[0];
		kehao=scan.nextInt();
		
		if(kehao==1){
			address="综9021";
			time="18:00";
			
//			tName="张老师";
			System.out.println("您所选的课程为:"+keming2[0]+",课程编号:"+kehao+", 教室："+address+", 时间："+time);
			System.out.println("教师信息：");
			super.showsJAVA();
		}else if(kehao==2){
			address="综6021";
			time="16:05";
//			tName="刘老师";
			System.out.println("您所选的课程为:"+keming2[1]+",课程编号:"+kehao+", 教室："+address+", 时间："+time);
			System.out.println("教师信息：");
			super.showsEn();
		}else if(kehao==3){
			address="综1021";
			time="13:30";
//			tName="赵老师";
			System.out.println("您所选的课程为:"+keming2[2]+",课程编号:"+kehao+", 教室："+address+", 时间："+time);	
			System.out.println("教师信息：");
			super.showsIn();
		}else if(kehao==4){
			address="教300";
			time="09:40";
//			tName="魏老师";
			System.out.println("您所选的课程为:"+keming2[3]+",课程编号:"+kehao+", 教室："+address+", 时间："+time);	
			System.out.println("教师信息：");
			super.showsHi();
		}
	}
	
	public void needtui(String name) {
		// TODO Auto-generated method stub
		System.out.println("是否需要退课？（1：是 2：否）");
		int n;
		n=scan.nextInt();
		
		
		if(n==1){
			System.out.println("请输入需要退课的课程编号：");
			kehao=scan.nextInt();
		    if(kehao==1){
				  System.out.println(keming[0]+"已退选");
			  }else if(kehao==2){
				  System.out.println(keming[1]+"已退选");
			  }else if(kehao==3){
				  System.out.println(keming[2]+"已退选");
			  }else if(kehao==4){
				  System.out.println(keming[3]+"已退选");
			  }
		}
		else if(n==2){
			System.out.println("您已成功选课！请按时上课哦");
		}
		else{
			System.out.println("输入错误，请重新输入！");
		}
	}
}

