package pack1;

import java.util.Arrays;
import java.util.Scanner;

public class Course extends Teacher{

	public Course(int xuehao, String name, String sex) {
		super(xuehao, name, sex);
		// TODO Auto-generated constructor stub	
	}
	public Course(){
		System.out.println("���ṩ�Ŀγ��б�"+Arrays.toString(keming));}
	
	int kehao;
	Teacher teac=new Teacher();
	String address,time;
	String keming[]={"1JAVA","2English","3Internet","4History"};
	String keming2[]={"JAVA","English","Internet","History"};
	String tName;

	Scanner scan =new Scanner(System.in);
	
	public String showlist(){
		System.out.println("���ṩ�Ŀγ��б�"+Arrays.toString(keming));
		return tlesson;
	}
	public void choseLesson(String name){
		System.out.println("��ѡ��γ̣�(���Ϊ1-3)");
//		teac.name=tName[0];
		kehao=scan.nextInt();
		
		if(kehao==1){
			address="��9021";
			time="18:00";
			
//			tName="����ʦ";
			System.out.println("����ѡ�Ŀγ�Ϊ:"+keming2[0]+",�γ̱��:"+kehao+", ���ң�"+address+", ʱ�䣺"+time);
			System.out.println("��ʦ��Ϣ��");
			super.showsJAVA();
		}else if(kehao==2){
			address="��6021";
			time="16:05";
//			tName="����ʦ";
			System.out.println("����ѡ�Ŀγ�Ϊ:"+keming2[1]+",�γ̱��:"+kehao+", ���ң�"+address+", ʱ�䣺"+time);
			System.out.println("��ʦ��Ϣ��");
			super.showsEn();
		}else if(kehao==3){
			address="��1021";
			time="13:30";
//			tName="����ʦ";
			System.out.println("����ѡ�Ŀγ�Ϊ:"+keming2[2]+",�γ̱��:"+kehao+", ���ң�"+address+", ʱ�䣺"+time);	
			System.out.println("��ʦ��Ϣ��");
			super.showsIn();
		}else if(kehao==4){
			address="��300";
			time="09:40";
//			tName="κ��ʦ";
			System.out.println("����ѡ�Ŀγ�Ϊ:"+keming2[3]+",�γ̱��:"+kehao+", ���ң�"+address+", ʱ�䣺"+time);	
			System.out.println("��ʦ��Ϣ��");
			super.showsHi();
		}
	}
	
	public void needtui(String name) {
		// TODO Auto-generated method stub
		System.out.println("�Ƿ���Ҫ�˿Σ���1���� 2����");
		int n;
		n=scan.nextInt();
		
		
		if(n==1){
			System.out.println("��������Ҫ�˿εĿγ̱�ţ�");
			kehao=scan.nextInt();
		    if(kehao==1){
				  System.out.println(keming[0]+"����ѡ");
			  }else if(kehao==2){
				  System.out.println(keming[1]+"����ѡ");
			  }else if(kehao==3){
				  System.out.println(keming[2]+"����ѡ");
			  }else if(kehao==4){
				  System.out.println(keming[3]+"����ѡ");
			  }
		}
		else if(n==2){
			System.out.println("���ѳɹ�ѡ�Σ��밴ʱ�Ͽ�Ŷ");
		}
		else{
			System.out.println("����������������룡");
		}
	}
}

