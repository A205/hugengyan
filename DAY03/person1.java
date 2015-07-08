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
	System.out.println("大家好,我叫"+name+",今年"+age+"岁，我在"+address+"");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
person1 person1=new person1("jim",30,"北京");
person1.introduce();
	}
}
