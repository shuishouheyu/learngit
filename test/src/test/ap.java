package test;


 class bb{
	public bb(){
		System.out.println("bb1");
	}
}
public class ap extends bb{

	public static void main(String[] args) {
		new ap();
		new bb();
		
	}
}
