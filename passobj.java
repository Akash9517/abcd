import java.util.Scanner;

public class passobj {


	int x;
	int y;

	void getdata(){

		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		 x=s.nextInt();
		System.out.println("enter the number");
		 y=s.nextInt();

	}
	void add(passobj arr)
	{

	int c= arr.x;
	int d= arr.y;
	int sum=c+d;
		System.out.println(sum);


	}

//     void add1()
//	{
//		System.out.println(x+y);
//
//	}


	public static void main(String[] args) {


		passobj obj=new passobj();
		passobj obj1=new passobj();
		obj.getdata();
		obj1.getdata();
//		obj.add(obj);

	}
}
