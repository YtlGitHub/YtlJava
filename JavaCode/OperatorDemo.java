public class OperatorDemo{
	public static void main(String[] args){
		//定义两个变量
		int i = 10;
		char c = 'A'; //'A'的值是65
		c = 'a'; //'a'的值是97
		c = '0'; //'0'的值是48
		System.out.println(i+c);
		
		//char类型会被自动提升到int类型，表达式中i是int类型，所有会提升
		//char j = i+c;
		int j = i+c;
		System.out.println(j);
		//int k = 10+13.14;
		double k = 10+13.14;
		System.out.println(k);
	}
}