## G202 刘凯丽 2020322095
# 实验报告
## 一、实验目的
* 初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
* 掌握面向对象的类设计方法（属性、方法）；
* 掌握类的继承用法，通过构造方法实例化对象；
* 学会使用super（），用于实例化子类；
* 掌握使用 Object根类的toString（）方法，应用在相关对象的信息输出中。
## 二、实验要求
> **说明：** 学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每门学生仅选一门课程。
**对象：** 人员（编号、姓名、性别），教师（编号、姓名、性别、所授课程），学生（编号、姓名、性别、所选课程），课程（编号、课程名称、上课地点、时间、授课教师）。
* 编写上述实体类以及测试主类（主意类之间继承关系的使用）
* 在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师、教师性别、教师编号）；
* 模拟学生退课操作，再打印课程信息。
## 三、实验过程
1.新建Member类，作为父类。定义成员变量（学号，姓名，性别）。<br/>

    int xuehao;
    String  name,sex;
    
2.新建Student类和Teacher类，并且给Teacher类的成员变量赋值，二者都继承Member类。<br/>

		public class Student extends Member{
		public class Teacher extends Member{
		
3.新建Course类，其继承Teacher类。使用数组存放Course变量信息，在构造方法Public Course(){}中实现输出课程的编号、名称列表，实例化Teacher类。<br/>		

		public class Course extends Teacher{
		
		String keming[]={"1JAVA","2English","3Internet","4History"};
		
4.新建测试类Test，实例化Course类。在此类调用choseLesson()，needtui()方法;<br/>;
		
		public class Test {    
		c.choseLesson(s1.name);
		c.needtui(s1.name);
		
## 四、实验流程图
![image](https://github.com/G202liukaili/ChoseLesson/blob/main/image/liuchengtu.jpg)
## 五、核心代码+注释
1.在构造方法course中使用Arrays.toString()方法输出课程列表。
		
		public Course(){
		System.out.println("所提供的课程列表："+Arrays.toString(keming));}

2.在Teacher类中定义show方法给成员变量赋值。

		public void showsEn(){
		name="刘老师"; sex="女"; xuehao=6002;
		System.out.println("教师姓名:"+name+", 性别:"+sex+", 编号:"+xuehao);
	}
		
3.通过控制台获取退课信息，并且使用两个if else分支进行选择。

		int n;
		n=scan.nextInt();
		if(n==1){
			System.out.println("请输入需要退课的课程编号：");
			kehao=scan.nextInt();
		    if(kehao==1){
				  System.out.println(keming[0]+"已退选");
			  }else if(kehao==2){		
4.通过super调用父类的showsEn方法。

		super.showsEn();
5.显示选课信息。

		if(kehao==1){
			address="综9021";
			time="18:00";
			System.out.println("您所选的课程为:"+keming2[0]+",课程编号:"+kehao+", 教室："+address+", 时间："+time);
			System.out.println("教师信息：");
			super.showsJAVA();
6.测试类Test构造Scanner类的对象scan，接收从控制台输入的信息，实例化Course类。

		Scanner scan = new Scanner(System.in);	
		Course c=new Course();
7.调用Course类的choseLesson（）方法和needtui()方法。

		c.choseLesson(s1.name);
		c.needtui(s1.name);
## 六、系统运行截图
![image](https://github.com/G202liukaili/ChoseLesson/blob/main/image/2020-11-01_125900.jpg)
![image](https://github.com/G202liukaili/ChoseLesson/blob/main/image/2020-11-01_125900.jpg)
		
		
		







