package test;

public class ThreadB extends Thread {
	private MyList list;
	public ThreadB(MyList list) {
		super();
		this.list=list;
	}
	@Override
	public void run() {
		try {
			while(true) {
//				System.out.println("b=="+list.size());
			System.out.println("bb");
//				int i=0;
				if(list.size()==2) {
					System.out.println("==5了,线程b要退出了");
					throw new InterruptedException();
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
