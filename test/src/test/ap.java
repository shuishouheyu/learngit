package test;


 class bb{
	public bb(){
		System.out.println("bb");
	}
}
public class ap extends bb{

	public static void main(String[] args) {
		new ap();
		new bb();
		
	}
}
