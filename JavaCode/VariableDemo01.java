/*
	变量定义：
		格式：数据类型 变量名 = 变量值;
		范例：int a = 10;
		
	基本数据类型：
		byte,short,int,long,float,double,char,boolean
		
	变量的使用：
		取值格式：变量名
		
		修改值格式：变量名 = 变量值;
*/
public class VariableDemo01 {
	public static void main(String[] args) {
		//定义变量
		int a = 10;
		//输出变量
		System.out.println(a);
		//修改变量
		a = 20;
		System.out.println(a);
		//定义long类型的变量 细节：给的是整数时不管前面写的什么类型它会默认是int类型,所以要在后面加一个大写的L或者小写的l都可以
		long b = 10000000000l;
		System.out.println(b);
		//定义float类型的变量 细节：给的是浮点数时不管前面写的什么类型它会默认是double类型，所以要在后面加一个大写的F或者小写的f都可以
		float c = 13.14F;
		System.out.println(c);
	}
}