package hgy123;

public class person1 {
	String name;
	int age;
	String address;
	person1(){}
person1(String n,int a,String add){
name=n;
age=a;
address=add;

}
void introduce(){
	System.out.println("��Һ�,�ҽ�"+name+",����"+age+"�꣬����"+address+"");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
person1 person1=new person1("jim",30,"����");
person1.introduce();
	}
}
