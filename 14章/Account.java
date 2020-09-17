
class User{
	String name;

	User(String name){
		this.name = name;
	}

	User(){
		this( "aa");
	}

	public void say() {
		System.out.println("hi" + name);
	}
}

class AdminUser extends User{
	AdminUser(String name){
		super(name);
	}
}



public class Test {


//	public static void aa(String name) {
//		System.out.println(name);
//	}
//
//	public static void aa() {
//		System.out.println("b");
//	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		User tomm = new User("YYY");
		tomm.say();

		User tom = new User();
		tom.say();

		AdminUser too = new AdminUser("tom");
		too.say();

//		aa("a");
//		aa();

		//

//		System.out.println("aaa");


		/*
		 qqq
		 qqq
		*/
//		String msg;
//		msg = "bbbtb";
//		System.out.println(msg);
//		char a = 'c';
//		int number = 13;
//		long y = 5555555L;
//		double d = 2555.333;
//		float f = 32.33F;
//		boolean g = true;
//		number++;
//		System.out.println(number);

//		double d = 555.223;
//		int i = (int)d;
//		System.out.println(i);

//		int i = 10;
//		double d = (double)i / 4;
//		System.out.println(d);
//
//
//		int a = 20;
//		if(a > 10) {
//			System.out.println("good");
//		}else if(a > 15) {
//			System.out.println("Verygood");
//		}else {
//			System.out.println("bad");
//		}
//
//		String b = a > 18 ? "Great" : "soso";
//		System.out.println(b);

//		String msg = "red";
//		switch(msg) {
//		case "red":
//			System.out.println("red");
//			break;
//		default:
//			System.out.println("bbb");
//			break;
//		}

//		int i = 0;
//		while(i < 10) {
//			System.out.println(i);
//			i++;
//		}
//		do {
//			System.out.println(i);
//			i++;
//		}while(i < 10);

//		for(int i = 0; i < 10 ; i++) {
//			if(i == 5 ) {
////				break;
//				continue;
//			}
//			System.out.println(i);
//		}

//		int[] sales;
//		sales = new int[3];
//
//		sales[0] = 100;
//		sales[1] = 200;
//		sales[2] = 300;
//
//		System.out.println(sales[2]);
//
//		int[] b ;
//		b = new int[] {100,400,400};
//		System.out.println(b[1]);


//		int[] sales = {700,800,900};
//
////		for(int i = 0; i < sales.length; i++) {
////			System.out.println(sales[i]);
////		}
//
//		for(int sale :sales) {
//			System.out.println(sale);
//		}




//		say();

	}

//	public static void say() {
//		System.out.println("こ");
//	}

}
