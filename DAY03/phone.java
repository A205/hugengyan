package hgy123;

public class phone {
String name;
String brand;
int price;

void call(){
	System.out.println("打电话。。。");
}
void sendmag(){
	System.out.println("发短信。。。");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
phone p=new phone();

p.name="note";
p.brand="爆米花";
p.price=99;

System.out.println(p.name);
p.sendmag();
	}
}






















































































































