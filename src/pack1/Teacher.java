package pack1;

public class Teacher extends Member{
	String tlesson;
	public Teacher(int xuehao, String name, String sex) {
		super(xuehao, name, sex);
		

	}
	public Teacher(){
		
	}
	

	public void showsJAVA(){
		name="����ʦ"; sex="��"; xuehao=5001;
		System.out.println("��ʦ����:"+name+", �Ա�:"+sex+", ���:"+xuehao);
		}
//		System.out.println("��ʦ����:����ʦ���Ա�:��,���:001" );	
//	}
	public void showsEn(){
		name="����ʦ"; sex="Ů"; xuehao=6002;
		System.out.println("��ʦ����:"+name+", �Ա�:"+sex+", ���:"+xuehao);
	}
	public void showsIn(){
		name="����ʦ"; sex="��"; xuehao=1003;
		System.out.println("��ʦ����:"+name+", �Ա�:"+sex+", ���:"+xuehao);
	}
	public void showsHi(){
		name="֣��ʦ"; sex="Ů"; xuehao=3004;
		System.out.println("��ʦ����:"+name+", �Ա�:"+sex+", ���:"+xuehao);
	}
	
	
//	public void tlesson(){
//		System.out.println("��ʦ���ڿγ̣�"+tlesson);
//	}
}
