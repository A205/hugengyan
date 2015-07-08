package hgy123;

public class Calculater {
int num1,num2;
public Calculater(int n1,int n2){
	num1=n1;
	num2=n2;
}
void add(){
	System.out.println(num1+num2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculater c=new Calculater(1,2);

c.add();
	}

}
